package csci571.usc.homework9.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import csci571.usc.homework9.MainActivity;
import csci571.usc.homework9.R;
import csci571.usc.homework9.adapter.MyAdapter;

import csci571.usc.homework9.common.DataStorage;
import csci571.usc.homework9.common.Util;
import csci571.usc.homework9.entity.FavoriteItem;
import csci571.usc.homework9.entity.ProfileItem;
import csci571.usc.homework9.fragments.FavoriteFrag;


/**
 * Created by xuchen on 2017/4/19.
 */

public class FavoriteActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    //表示上边的tab
    private TabLayout tabs;
    //下方内容
    private ViewPager viewPager;
    //保存所有title
    private List<String> mTitle = new ArrayList<String>();
    //保存所有fragment
    private List<Fragment> mFragment = new ArrayList<Fragment>();

    DataStorage ds=null;

    public int[] icons = {R.drawable.users, R.drawable.pages, R.drawable.events, R.drawable.places, R.drawable.groups};
    public String[] titles = {"Users", "Pages", "Events", "Places", "Groups"};

    private FavoriteFrag user_favorite_frag;
    private FavoriteFrag page_favorite_frag;
    private FavoriteFrag event_favorite_frag;
    private FavoriteFrag place_favorite_frag;
    private FavoriteFrag group_favorite_frag;

    public List<ProfileItem> user_list;
    public List<ProfileItem> page_list;
    public List<ProfileItem> event_list;
    public List<ProfileItem> place_list;
    public List<ProfileItem> group_list;


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.favorite_drawer);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }






    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        Intent intent=new Intent();
        switch(id){
            case R.id.AboutMe:
            {
                intent.setClass(FavoriteActivity.this,FavoriteAboutMe.class);
                FavoriteActivity.this.startActivity(intent);
            }break;
            case R.id.Home:
            {
                intent.setClass(FavoriteActivity.this, MainActivity.class);
                FavoriteActivity.this.startActivity(intent);
            }break;
        }


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.favorite_drawer);
        drawer.closeDrawer(GravityCompat.START);

        return true;
    }

    public class getFavoriteThread extends Thread{
        public void run()
        {

            user_list=new ArrayList<ProfileItem>();
            List<FavoriteItem> userlist=ds.Query("user");
            if(userlist!=null)
            {
                for(int i=0;i<userlist.size();i++){
                    ProfileItem item=new ProfileItem();
                    item.profile_pic_url=userlist.get(i).url;
                    item.type=userlist.get(i).type;
                    item.isFavorite=true;
                    item.profile_name=userlist.get(i).Name;
                    item.profile_id=userlist.get(i).ID;
                    item.profile_picture= Util.getHttpBitmap(userlist.get(i).url);
                    user_list.add(item);
                }
            }



            page_list=new ArrayList<ProfileItem>();
            List<FavoriteItem> pagelist=ds.Query("page");

            if(pagelist!=null)
            {
                for(int i=0;i<pagelist.size();i++)
                {
                    ProfileItem item=new ProfileItem();
                    item.profile_pic_url=pagelist.get(i).url;
                    item.type=pagelist.get(i).type;
                    item.isFavorite=true;
                    item.profile_name=pagelist.get(i).Name;
                    item.profile_id=pagelist.get(i).ID;
                    item.profile_picture= Util.getHttpBitmap(pagelist.get(i).url);
                    page_list.add(item);
                }
            }



            event_list=new ArrayList<ProfileItem>();
            List<FavoriteItem> eventlist=ds.Query("event");
            if(eventlist!=null)
            {
                for(int i=0;i<eventlist.size();i++)
                {
                    ProfileItem item=new ProfileItem();
                    item.profile_pic_url=eventlist.get(i).url;
                    item.type=eventlist.get(i).type;
                    item.isFavorite=true;
                    item.profile_name=eventlist.get(i).Name;
                    item.profile_id=eventlist.get(i).ID;
                    item.profile_picture= Util.getHttpBitmap(eventlist.get(i).url);
                    event_list.add(item);
                }
            }




            group_list=new ArrayList<ProfileItem>();
            List<FavoriteItem> grouplist=ds.Query("group");
            if(grouplist!=null)
            {
                for(int i=0;i<grouplist.size();i++)
                {
                    ProfileItem item=new ProfileItem();
                    item.profile_pic_url=grouplist.get(i).url;
                    item.type=grouplist.get(i).type;
                    item.isFavorite=true;
                    item.profile_name=grouplist.get(i).Name;
                    item.profile_id=grouplist.get(i).ID;
                    item.profile_picture= Util.getHttpBitmap(grouplist.get(i).url);
                    group_list.add(item);
                }
            }




           place_list=new ArrayList<ProfileItem>();
          /*  List<FavoriteItem> placelist=ds.Query("page");

                for(int i=0;i<placelist.size();i++)
                {
                    ProfileItem item=new ProfileItem();
                    item.profile_pic_url=placelist.get(i).url;
                    item.type=placelist.get(i).type;
                    item.isFavorite=true;
                    item.profile_name=placelist.get(i).Name;
                    item.profile_id=placelist.get(i).ID;
                    item.profile_picture= Util.getHttpBitmap(placelist.get(i).url);
                    place_list.add(item);
                }*/


            handler.sendEmptyMessage(0x11);
        }
    }


    public Handler handler=new Handler()
    {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);

            mTitle.add("user");
            mTitle.add("page");
            mTitle.add("event");
            mTitle.add("place");
            mTitle.add("group");

            user_favorite_frag=new FavoriteFrag();
            user_favorite_frag.item_list=user_list;

            page_favorite_frag=new FavoriteFrag();
            page_favorite_frag.item_list=page_list;


            event_favorite_frag=new FavoriteFrag();
            event_favorite_frag.item_list=event_list;

            place_favorite_frag=new FavoriteFrag();
            place_favorite_frag.item_list=page_list;

            group_favorite_frag=new FavoriteFrag();
            group_favorite_frag.item_list=group_list;

            mFragment.add(user_favorite_frag);
            mFragment.add(page_favorite_frag);
            mFragment.add(event_favorite_frag);
            mFragment.add(place_favorite_frag);
            mFragment.add(group_favorite_frag);


            MyAdapter adapter = new MyAdapter(getSupportFragmentManager(), mTitle, mFragment);
            viewPager.setAdapter(adapter);
            tabs.setupWithViewPager(viewPager);

            setupTabIcons();

            viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
                                                  @Override
                                                  public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

                                                  }

                                                  @Override
                                                  public void onPageSelected(int position) {
                                                      Toast.makeText(FavoriteActivity.this, "you select" + position, Toast.LENGTH_SHORT).show();

                                                  }

                                                  @Override
                                                  public void onPageScrollStateChanged(int state) {

                                                  }
                                              }

            );
        }
    };



    //以下为方法区

    private void setupTabIcons() {
        tabs.getTabAt(0).setCustomView(getTabView(0));
        tabs.getTabAt(1).setCustomView(getTabView(1));
        tabs.getTabAt(2).setCustomView(getTabView(2));
        tabs.getTabAt(3).setCustomView(getTabView(3));
        tabs.getTabAt(4).setCustomView(getTabView(4));
    }


    public View getTabView(int position) {
        View view = LayoutInflater.from(this).inflate(R.layout.tab_item, null);
        TextView txt_title = (TextView) view.findViewById(R.id.icon_title);
        ImageView img_title = (ImageView) view.findViewById(R.id.icon_pic);
        img_title.setImageResource(icons[position]);
        txt_title.setText(titles[position]);
        return view;
    }


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.favorite_drawer);
        Toolbar toolbar=(Toolbar)this.findViewById(R.id.favoritetoolbar);
        setSupportActionBar(toolbar);
       // getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        DrawerLayout drawerLayout=(DrawerLayout)this.findViewById(R.id.favorite_drawer);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        //绑定控件tab和viewpager并且将fragment全部保存在mFragment list中

        tabs = (TabLayout) findViewById(R.id.favoritetabs);

        viewPager = (ViewPager) findViewById(R.id.favoriteviewPager);

        ds=new DataStorage();
        new getFavoriteThread().start();

    }
}