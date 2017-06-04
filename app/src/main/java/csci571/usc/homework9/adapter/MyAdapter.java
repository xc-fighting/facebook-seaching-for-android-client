package csci571.usc.homework9.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentManager;
import java.util.List;

/**
 * Created by xuchen on 2017/4/17.
 */

public class MyAdapter extends FragmentPagerAdapter {
    private List<String> title;
    private List<Fragment> views;

    public MyAdapter(FragmentManager fm,List<String> title,List<Fragment> views)
    {
        super(fm);
        this.title=title;
        this.views=views;
    }

    public Fragment getItem(int position)
    {
        return views.get(position);
    }

    public int getCount()
    {
        return views.size();
    }

    @Override
     public CharSequence getPageTitle(int position)
     {
         return title.get(position);
     }


}
