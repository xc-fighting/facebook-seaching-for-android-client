package csci571.usc.homework9.fragments;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import csci571.usc.homework9.R;
import csci571.usc.homework9.activity.ResultActivity;
import csci571.usc.homework9.adapter.ListAdapter;
import csci571.usc.homework9.common.DataStorage;
import csci571.usc.homework9.common.Util;
import csci571.usc.homework9.entity.ProfileEntry;
import csci571.usc.homework9.entity.ProfileItem;

/**
 * Created by xuchen on 2017/4/17.
 */

public class GroupFrag extends Fragment {
    //保存上一个url以及下一个
    String preURL=null;
    String nextURL=null;

    //listview的适配器
    ListAdapter adapter;

    //前后button
    Button nextbutton;
    Button previousbutton;

    //对界面listview的引用
    ListView groupList;

    //上下文内容
    Activity context;

    //listview 数据集
    ArrayList<ProfileItem> data=null;

    Bitmap pic=null;

    public Handler GroupFragHandler=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if(preURL!=null)
            {
                previousbutton.setEnabled(true);
            }
            else
            {
                previousbutton.setEnabled(false);
            }
            if(nextURL!=null){
                nextbutton.setEnabled(true);
            }
            else
            {
                nextbutton.setEnabled(false);
            }

            adapter.itemlist=data;
            adapter.notifyDataSetChanged();
        }
    };

    public class GroupFragDownLoadThread extends Thread{
        String searchContent;
        String type;
        public GroupFragDownLoadThread(String content,String type)
        {
            this.searchContent=content;
            this.type=type;
        }
        public void run()
        {
            String result_str=null;
            DataStorage ds=new DataStorage();
            if(type=="normal")
            {
                result_str= Util.getJsonFromPHP(searchContent,"group");
                ProfileEntry json_obj=Util.GetProfileJason(result_str);
                ProfileEntry.PagingBean paging=json_obj.getPaging();
                if(paging.getNext()!=null)
                {
                    nextURL=paging.getNext();
                }
                if(paging.getPrevious()!=null)
                {
                    preURL=paging.getPrevious();
                }
                List<ProfileEntry.DataBeanX> dataset=json_obj.getData();
                for(int i=0;i<dataset.size();i++)
                {
                    ProfileEntry.DataBeanX entry=dataset.get(i);
                    ProfileItem savedItem=new ProfileItem();
                    savedItem.profile_name=entry.getName();
                    savedItem.profile_id=entry.getId();
                    savedItem.type="group";

                    if(ds.isRecordExist(savedItem.profile_id))
                        savedItem.isFavorite=true;
                    else savedItem.isFavorite=false;
                    savedItem.profile_pic_url=entry.getPicture().getData().getUrl();
                    savedItem.profile_picture=Util.getHttpBitmap(savedItem.profile_pic_url);
                    data.add(savedItem);
                }
            }
            else if(type=="nextpage")
            {
                result_str=Util.getJsonFromPHP(nextURL,"nextpage");
                ProfileEntry json_obj=Util.GetProfileJason(result_str);
                ProfileEntry.PagingBean paging=json_obj.getPaging();
                if(paging.getNext()!=null)
                {
                    nextURL=paging.getNext();
                }
                else
                {
                    nextURL=null;
                }
                if(paging.getPrevious()!=null)
                {
                    preURL=paging.getPrevious();
                }
                else{
                    preURL=null;
                }
                List<ProfileEntry.DataBeanX> dataset=json_obj.getData();
                data.clear();
                for(int i=0;i<dataset.size();i++)
                {
                    ProfileEntry.DataBeanX entry=dataset.get(i);
                    ProfileItem savedItem=new ProfileItem();
                    savedItem.profile_name=entry.getName();
                    savedItem.profile_id=entry.getId();
                    savedItem.type="group";
                    if(ds.isRecordExist(savedItem.profile_id))
                        savedItem.isFavorite=true;
                    else savedItem.isFavorite=false;
                    savedItem.profile_pic_url=entry.getPicture().getData().getUrl();
                    savedItem.profile_picture=Util.getHttpBitmap(savedItem.profile_pic_url);
                    data.add(savedItem);
                }
            }
            else if(type=="previouspage")
            {
                result_str=Util.getJsonFromPHP(preURL,"previouspage");
                ProfileEntry json_obj=Util.GetProfileJason(result_str);
                ProfileEntry.PagingBean paging=json_obj.getPaging();
                if(paging.getNext()!=null)
                {
                    nextURL=paging.getNext();
                }
                else
                {
                    nextURL=null;
                }
                if(paging.getPrevious()!=null)
                {
                    preURL=paging.getPrevious();
                }
                else
                {
                    preURL=null;
                }
                List<ProfileEntry.DataBeanX> dataset=json_obj.getData();
                data.clear();
                for(int i=0;i<dataset.size();i++)
                {
                    ProfileEntry.DataBeanX entry=dataset.get(i);
                    ProfileItem savedItem=new ProfileItem();
                    savedItem.profile_name=entry.getName();
                    savedItem.profile_id=entry.getId();
                    savedItem.type="group";
                    if(ds.isRecordExist(savedItem.profile_id))
                        savedItem.isFavorite=true;
                    else savedItem.isFavorite=false;
                    savedItem.profile_pic_url=entry.getPicture().getData().getUrl();
                    savedItem.profile_picture=Util.getHttpBitmap(savedItem.profile_pic_url);
                    data.add(savedItem);
                }
            }



            ds.closeDB();
            GroupFragHandler.sendEmptyMessage(0x111);
        }

    }

    //创建时候第一个调用
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }



    //在oncreate结束以后调用，用来创建视图
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        //初始化数据集为空
        data=new ArrayList<ProfileItem>();

        //对当前的fragment绑定一个布局
        View view=inflater.inflate(R.layout.user_frag,null);

        //获取next按钮
        nextbutton=(Button)view.findViewById(R.id.nextbtn);
        nextbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //向前一个页面发指令
                Toast.makeText(getActivity(),nextURL,Toast.LENGTH_SHORT).show();

                new GroupFragDownLoadThread(ResultActivity.searchContent,"nextpage").start();
            }
        });

        //获取previous 按钮
        previousbutton=(Button)view.findViewById(R.id.previousbtn);
        previousbutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //向后一个页面发指令
                Toast.makeText(getActivity(),preURL,Toast.LENGTH_SHORT).show();

                new GroupFragDownLoadThread(ResultActivity.searchContent,"previouspage").start();
            }
        });

        //设置按钮是否可按
        if(preURL==null)
        {
            previousbutton.setEnabled(false);
        }
        if(nextURL==null)
        {
            nextbutton.setEnabled(false);
        }


        //找到Listview
        groupList=(ListView)view.findViewById(R.id.userlistview);



        adapter=new ListAdapter(getActivity(),data,"group");
        groupList.setAdapter(adapter);

        new GroupFragDownLoadThread(ResultActivity.searchContent,"normal").start();
        return view;
    }
}
