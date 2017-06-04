package csci571.usc.homework9.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import csci571.usc.homework9.R;
import csci571.usc.homework9.adapter.PostListAdapter;
import csci571.usc.homework9.entity.PostItem;

/**
 * Created by xuchen on 2017/4/20.
 */

public class PostFrag extends Fragment {

    public List<PostItem> data;
    public PostListAdapter adapter;
    ListView postlist;
    TextView noposttip;
    public PostFrag(){
        data=new ArrayList<PostItem>();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
     //   data=new ArrayList<PostItem>();
        View view=inflater.inflate(R.layout.post_frag,null);
        postlist=(ListView)view.findViewById(R.id.postlistview);
        noposttip=(TextView)view.findViewById(R.id.noposttips);
        if(data.size()!=0)
        {
            noposttip.setVisibility(View.GONE);
        }
        else
        {
            noposttip.setVisibility(View.VISIBLE);
        }
        adapter=new PostListAdapter(data,getActivity());
        postlist.setAdapter(adapter);

        return view;

    }
}
