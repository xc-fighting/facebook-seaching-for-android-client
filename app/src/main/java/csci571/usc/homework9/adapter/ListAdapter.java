package csci571.usc.homework9.adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

import csci571.usc.homework9.activity.DetailActivity;
import csci571.usc.homework9.R;
import csci571.usc.homework9.common.DataStorage;
import csci571.usc.homework9.entity.FavoriteItem;
import csci571.usc.homework9.entity.ListItemView;
import csci571.usc.homework9.entity.ProfileItem;

/**
 * Created by xuchen on 2017/4/18.
 */

public class ListAdapter extends BaseAdapter {
     public static int count=0;
    //数据集
 //   public ArrayList<HashMap<String,Object>> itemlist;
    public ArrayList<ProfileItem> itemlist;
    public String type1;

    //上下文以及布局
    Context context;
    LayoutInflater layoutInflater;


    DataStorage ds;
    //构造方法，传入上下文，数据集
    public ListAdapter(Context context,ArrayList<ProfileItem> data,String type)
    {
        this.context=context;
        this.itemlist=data;
        this.layoutInflater=LayoutInflater.from(context);
        this.type1=type;
        this.ds=new DataStorage();
    }


    public int getCount()
    {
        return itemlist.size();
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public Object getItem(int position) {
       return null;
    }


    //这个是重点，在每次notifydata的时候进行调用
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        Log.v("showq","function on"+(count++));
        ListItemView item=null;
        if(convertView==null)
        {
            item=new ListItemView();
            convertView=layoutInflater.inflate(R.layout.list_item,null);
            item.profilephoto=(ImageView)convertView.findViewById(R.id.profilephoto);
            item.profilename=(TextView)convertView.findViewById(R.id.profilename);
            item.favoritebtn=(ImageView)convertView.findViewById(R.id.favoritebutton);
            item.detailbtn=(ImageView)convertView.findViewById(R.id.detailbutton);
            convertView.setTag(item);
        }
        else
        {
            item=(ListItemView)convertView.getTag();
        }
        //下边进行view的数据绑定

        ProfileItem temp=itemlist.get(position);

        item.profilephoto.setImageBitmap(temp.profile_picture);
        item.profilename.setText(temp.profile_name);
        if(temp.isFavorite==true)
        {
            item.favoritebtn.setImageResource(R.drawable.favorites_on);
            item.favoritebtn.setEnabled(false);
         //   Toast.makeText(context,"favorite activated"+position,Toast.LENGTH_SHORT).show();
        }
        else
        {
            //下边这行解决了问题，favorite重复的问题，思考为什么！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！
            item.favoritebtn.setImageResource(R.drawable.favorites_off);
           item.favoritebtn.setEnabled(true);
        }
        item.favoritebtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"you press at favorite"+position,Toast.LENGTH_SHORT).show();
                ((ImageView)v).setImageResource(R.drawable.favorites_on);
                itemlist.get(position).isFavorite=true;
                //加入内存中favorite list中
                FavoriteItem tempitem=new FavoriteItem();
                tempitem.ID=itemlist.get(position).profile_id;
                tempitem.Name=itemlist.get(position).profile_name;
                tempitem.type=type1;
                tempitem.url=itemlist.get(position).profile_pic_url;
                    Toast.makeText(context,tempitem.ID+" "+tempitem.Name+" "+tempitem.type,Toast.LENGTH_SHORT).show();
                new updateThread(tempitem).start();

            }
        });

        item.detailbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"you press at detail"+position+" "+itemlist.get(position).profile_id,Toast.LENGTH_SHORT).show();
                Intent intent=new Intent();
                Bundle bundle=new Bundle();
                bundle.putString("userID",itemlist.get(position).profile_id);
                bundle.putString("type",type1);
                bundle.putBoolean("islike",itemlist.get(position).isFavorite);
                intent.putExtras(bundle);
                intent.setClass(context,DetailActivity.class);
                context.startActivity(intent);

            }
        });
        return convertView;
    }
    class updateThread extends Thread{
        FavoriteItem item;
        public updateThread(FavoriteItem item)
        {
            this.item=item;
        }
        public void run()
        {
            ds.insertRecord(item);
        }

    }
}
