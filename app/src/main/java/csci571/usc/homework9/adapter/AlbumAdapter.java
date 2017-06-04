package csci571.usc.homework9.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import csci571.usc.homework9.R;
import csci571.usc.homework9.entity.AlbumItem;


/**
 * Created by xuchen on 2017/4/21.
 */

public class AlbumAdapter extends BaseExpandableListAdapter {


    public List<AlbumItem> dataSet;
    Context context;
    LayoutInflater layoutInflater;

    public AlbumAdapter(List<AlbumItem> data,Context context)
    {
        this.context=context;
        this.dataSet=data;
        this.layoutInflater=LayoutInflater.from(context);
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        Bitmap item=dataSet.get(groupPosition).albumList.get(childPosition);
        if(convertView==null)
        {
            convertView=layoutInflater.inflate(R.layout.child_item,null);
        }
        ImageView iv=(ImageView)convertView.findViewById(R.id.album_child);
        iv.setImageBitmap(item);
        return iv;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
       if(convertView==null)
       {
           convertView=layoutInflater.inflate(R.layout.parent_item,null);
       }
        TextView albumtitle=(TextView)convertView.findViewById(R.id.album_parent);
        albumtitle.setText(dataSet.get(groupPosition).name);
        return albumtitle;
    }



    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }

    @Override
    public int getGroupCount() {
        return dataSet.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return dataSet.get(groupPosition).albumList.size();
    }

    @Override
    public boolean hasStableIds() {
        return true;
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return dataSet.get(groupPosition).albumList.get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public Object getGroup(int groupPosition) {
        return dataSet.get(groupPosition);
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }




}
