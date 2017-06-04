package csci571.usc.homework9.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import csci571.usc.homework9.R;
import csci571.usc.homework9.adapter.FavoriteListAdapter;
import csci571.usc.homework9.entity.ProfileItem;

/**
 * Created by xuchen on 2017/4/21.
 */

public class FavoriteFrag extends Fragment {

    ListView  listview;
    public List<ProfileItem> item_list=new ArrayList<ProfileItem>();
    FavoriteListAdapter adapter;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.favorite_frag,null);
        listview=(ListView)view.findViewById(R.id.favorite_listview);
        adapter=new FavoriteListAdapter(getActivity(),item_list);
        listview.setAdapter(adapter);
        return view;

    }
}
