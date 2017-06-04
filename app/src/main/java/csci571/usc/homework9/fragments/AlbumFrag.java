package csci571.usc.homework9.fragments;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import csci571.usc.homework9.R;
import csci571.usc.homework9.adapter.AlbumAdapter;
import csci571.usc.homework9.entity.AlbumItem;

/**
 * Created by xuchen on 2017/4/20.
 */

public class AlbumFrag extends Fragment {
    ExpandableListView albumlistview=null;
    TextView noalbumtip;
    AlbumAdapter adapter=null;
    public List<AlbumItem> item_list=null;
    public AlbumFrag()
    {
        item_list=new ArrayList<AlbumItem>();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        View view=inflater.inflate(R.layout.album_frag,null);
        albumlistview=(ExpandableListView)view.findViewById(R.id.albumlist);
        noalbumtip=(TextView)view.findViewById(R.id.noalbumtips);
        if(item_list.size()==0)
        {
            noalbumtip.setVisibility(View.VISIBLE);
        }
        else
        {
            noalbumtip.setVisibility(View.GONE);
        }
        adapter=new AlbumAdapter(item_list,getActivity());
        albumlistview.setAdapter(adapter);
        return view;
    }
}
