package csci571.usc.homework9.activity;

import android.content.pm.PackageInfo;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.NavUtils;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import csci571.usc.homework9.R;
import csci571.usc.homework9.adapter.DetailAdapter;
import csci571.usc.homework9.common.DataStorage;
import csci571.usc.homework9.common.Util;
import csci571.usc.homework9.entity.AlbumItem;
import csci571.usc.homework9.entity.DetailEntry;
import csci571.usc.homework9.entity.FavoriteItem;
import csci571.usc.homework9.entity.PostItem;
import csci571.usc.homework9.fragments.AlbumFrag;
import csci571.usc.homework9.fragments.PostFrag;

import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookDialog;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.share.Sharer;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.widget.ShareDialog;

/**
 * Created by xuchen on 2017/4/18.
 */

public class DetailActivity extends AppCompatActivity {

//表示上边的tab
    private TabLayout Detailtabs;
    //下方内容
    private ViewPager DetailviewPager;
    //保存所有title
    private List<String> mTitle=new ArrayList<String>();
    //保存所有fragment
    private List<Fragment> mFragment=new ArrayList<Fragment>();


    public int[] icons={R.drawable.albums,R.drawable.posts};
    public String[] titles={"Albums","Posts"};

    private PostFrag post_Fragment;
    private AlbumFrag album_Fragment;

    public List<PostItem> post_list;
    public List<AlbumItem> album_list;

    public boolean isFavorite=false;
    public String url=null;
    public String Profileid=null;
    public String Profilename=null;
    public String Profiletype=null;

    public DataStorage ds;

    public ShareDialog dialog;
    public CallbackManager callbackManager;

    //以下为方法区

    private void setupTabIcons()
    {
        Detailtabs.getTabAt(0).setCustomView(getTabView(0));
        Detailtabs.getTabAt(1).setCustomView(getTabView(1));

    }


    public View getTabView(int position)
    {
        View view= LayoutInflater.from(this).inflate(R.layout.tab_item,null);
        TextView txt_title=(TextView)view.findViewById(R.id.icon_title);
        ImageView img_title=(ImageView)view.findViewById(R.id.icon_pic);
        img_title.setImageResource(icons[position]);
        txt_title.setText(titles[position]);
        return view;
    }


    class detailThread extends Thread
    {
        String input;
        public detailThread(String str)
        {
            this.input=str;
        }
        public void run()
        {
            String json_str= Util.getJsonFromPHP(input,"detail");
            DetailEntry json_obj=Util.GetDetailJason(json_str);

            Profilename=json_obj.getName();
            url=json_obj.getPicture().getData().getUrl();
            DetailEntry.PictureBean picture=json_obj.getPicture();
            PostItem.post_pic=Util.getHttpBitmap(picture.getData().getUrl());
            post_list=new ArrayList<PostItem>();
            if(json_obj.getPosts()!=null)
            {
                List<DetailEntry.PostsBean.DataBeanXXX> posts=json_obj.getPosts().getData();
                String name=json_obj.getName();

                for(int i=0;i<posts.size();i++){
                    if(posts.get(i)!=null)
                    {
                        PostItem item=new PostItem();
                        item.name=name;
                        item.message=posts.get(i).getMessage();
                        item.time=Util.ConvertToDateFormat(posts.get(i).getCreated_time());
                        post_list.add(item);
                    }

                }
            }

            album_list=new ArrayList<AlbumItem>();
            if(json_obj.getAlbums()!=null)
            {
                List<DetailEntry.AlbumsBean.DataBeanXX> album_obj=json_obj.getAlbums().getData();
                for(int i=0;i<album_obj.size();i++)
                {
                    AlbumItem item=new AlbumItem();
                    item.name=album_obj.get(i).getName();
                    if(album_obj.get(i)!=null&&album_obj.get(i).getPhotos()!=null)
                    {
                        for(int j=0;j<album_obj.get(i).getPhotos().getData().size();j++)
                        {
                            String id=album_obj.get(i).getPhotos().getData().get(j).getId();
                            Bitmap tempMap=Util.getHttpBitmapEx(id);
                            item.albumList.add(tempMap);
                        }
                    }

                    album_list.add(item);
                }
            }

            handler.sendEmptyMessage(0x111);

        }
    }

    Handler handler=new Handler()
    {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);

            mTitle.add("Albums");
            mTitle.add("Posts");




            post_Fragment=new PostFrag();
            post_Fragment.data=post_list;
            album_Fragment=new AlbumFrag();
            album_Fragment.item_list=album_list;



            mFragment.add(album_Fragment);
            mFragment.add(post_Fragment);






            DetailAdapter adapter=new DetailAdapter(getSupportFragmentManager(),mTitle,mFragment);
            DetailviewPager.setAdapter(adapter);
            Detailtabs.setupWithViewPager(DetailviewPager);

            setupTabIcons();

            DetailviewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
                                                        @Override
                                                        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

                                                        }

                                                        @Override
                                                        public void onPageSelected(int position) {
                                                            Toast.makeText(DetailActivity.this,"you select"+position,Toast.LENGTH_SHORT).show();

                                                        }

                                                        @Override
                                                        public void onPageScrollStateChanged(int state) {

                                                        }
                                                    });



        }
    };


    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_activity);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ds=new DataStorage();

        Bundle bundle=getIntent().getExtras();
        Profileid=bundle.getString("userID");
        Profiletype=bundle.getString("type");
        isFavorite=bundle.getBoolean("islike");
        Toast.makeText(this,Profileid,Toast.LENGTH_SHORT).show();





        //绑定控件tab和viewpager并且将fragment全部保存在mFragment list中

        Detailtabs=(TabLayout)findViewById(R.id.detailtabs);

        DetailviewPager=(ViewPager)findViewById(R.id.detailviewPager);


        new detailThread(Profileid).start();


        FacebookSdk.sdkInitialize(getApplicationContext());
        callbackManager=CallbackManager.Factory.create();
        dialog=new ShareDialog(this);
        dialog.registerCallback(callbackManager, new FacebookCallback<Sharer.Result>() {
            @Override
            public void onSuccess(Sharer.Result result) {
                Toast.makeText(DetailActivity.this,"post success",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onCancel() {
                Toast.makeText(DetailActivity.this,"post canceled",Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onError(FacebookException error) {

            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.detailmenu,menu);
        MenuItem menu1=(MenuItem) menu.findItem(R.id.favoriteitem);
        if(isFavorite==false)
        menu1.setTitle("Add To Favorite");
        else
        menu1.setTitle("Delete From Favorite");
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item){
        switch(item.getItemId())
        {
            case android.R.id.home:
            {
                NavUtils.navigateUpFromSameTask(this);
            } break;
            case R.id.favoriteitem:
            {
               if(isFavorite==false)
               {

                   FavoriteItem tempitem=new FavoriteItem();
                   tempitem.Name=Profilename;
                   tempitem.url=url;
                   tempitem.ID=Profileid;
                   tempitem.type=Profiletype;
                   ds.insertRecord(tempitem);
                   isFavorite=true;
                   item.setTitle("Delete From Favorite");
               }
                else
               {
                   ds.deleteRecord(Profileid);
                   isFavorite=false;
                   item.setTitle("Add To Favorite");
               }
            }break;
            case R.id.shareitem:
            {
                Toast.makeText(DetailActivity.this,Profilename+" "+url, Toast.LENGTH_SHORT).show();
               if(ShareDialog.canShow(ShareLinkContent.class))
               {

                   ShareLinkContent linkContent=new ShareLinkContent.Builder()
                           .setContentTitle(Profilename)
                           .setContentDescription("FB SEARCH FROM CSCI571...")
                           .setContentUrl(Uri.parse("http://developers.facebook.com/android"))
                           .setImageUrl(Uri.parse(url))
                           .build();
                   dialog.show(linkContent);
               }




            }break;
        }
        return super.onOptionsItemSelected(item);
    }
}
