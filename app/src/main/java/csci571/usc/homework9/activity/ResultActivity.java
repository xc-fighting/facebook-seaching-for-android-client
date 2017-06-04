package csci571.usc.homework9.activity;



import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.NavUtils;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import csci571.usc.homework9.R;
import csci571.usc.homework9.adapter.MyAdapter;
import csci571.usc.homework9.fragments.EventFrag;
import csci571.usc.homework9.fragments.GroupFrag;
import csci571.usc.homework9.fragments.PageFrag;
import csci571.usc.homework9.fragments.PlaceFrag;
import csci571.usc.homework9.fragments.UserFrag;

/**
 * Created by xuchen on 2017/4/16.
 */

public class ResultActivity extends AppCompatActivity {

    //表示上边的tab
    private TabLayout tabs;
    //下方内容
    private ViewPager viewPager;
    //保存所有title
    private List<String> mTitle=new ArrayList<String>();
    //保存所有fragment
    private List<Fragment> mFragment=new ArrayList<Fragment>();


    public int[] icons={R.drawable.users,R.drawable.pages,R.drawable.events,R.drawable.places,R.drawable.groups};
    public String[] titles={"Users","Pages","Events","Places","Groups"};

    private UserFrag user_Fragment;
    private PageFrag page_Fragment;
    private EventFrag event_Fragment;
    private PlaceFrag place_Fragment;
    private GroupFrag group_Fragment;

    public static String searchContent=null;

    //以下为方法区

    private void setupTabIcons()
    {
        tabs.getTabAt(0).setCustomView(getTabView(0));
        tabs.getTabAt(1).setCustomView(getTabView(1));
        tabs.getTabAt(2).setCustomView(getTabView(2));
        tabs.getTabAt(3).setCustomView(getTabView(3));
        tabs.getTabAt(4).setCustomView(getTabView(4));
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





    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result_show);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

      //  Bundle bundle=this.getIntent().getExtras();
       // searchContent=bundle.getString("searchContent");

        //绑定控件tab和viewpager并且将fragment全部保存在mFragment list中

        tabs=(TabLayout)findViewById(R.id.tabs);

        viewPager=(ViewPager)findViewById(R.id.viewPager);


        mTitle.add("user");
        mTitle.add("page");
        mTitle.add("event");
        mTitle.add("place");
        mTitle.add("group");

        user_Fragment=new UserFrag();
        page_Fragment=new PageFrag();
        event_Fragment=new EventFrag();
        place_Fragment=new PlaceFrag();
        group_Fragment=new GroupFrag();

        mFragment.add(user_Fragment);
        mFragment.add(page_Fragment);
        mFragment.add(event_Fragment);
        mFragment.add(place_Fragment);
        mFragment.add(group_Fragment);





        MyAdapter adapter=new MyAdapter(getSupportFragmentManager(),mTitle,mFragment);
        viewPager.setAdapter(adapter);
        tabs.setupWithViewPager(viewPager);

        setupTabIcons();

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
                                              @Override
                                              public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

                                              }

                                              @Override
                                              public void onPageSelected(int position) {
                                                  Toast.makeText(ResultActivity.this,"you select"+position,Toast.LENGTH_SHORT).show();

                                              }

                                              @Override
                                              public void onPageScrollStateChanged(int state) {

                                              }
                                          }

        );

    }




    public boolean onOptionsItemSelected(MenuItem item){
        switch(item.getItemId())
        {
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
