package csci571.usc.homework9.adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import csci571.usc.homework9.R;

import csci571.usc.homework9.entity.PostItem;
import csci571.usc.homework9.entity.PostListItemView;


/**
 * Created by xuchen on 2017/4/20.
 */

public class PostListAdapter extends BaseAdapter{

    public List<PostItem> dataSet;
    Context context;
    LayoutInflater layoutInflater;

    public PostListAdapter(List<PostItem> data,Context context)
    {
        this.context=context;
        this.dataSet=data;
        layoutInflater=LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return dataSet.size();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        PostListItemView item=null;
        if(convertView==null)
        {
            item=new PostListItemView();
            convertView=layoutInflater.inflate(R.layout.post_item,null);
            item.postPic=(ImageView)convertView.findViewById(R.id.postPic);
            item.postTitle=(TextView)convertView.findViewById(R.id.postTitle);
            item.postTime=(TextView)convertView.findViewById(R.id.postTime);
            item.postContent=(TextView)convertView.findViewById(R.id.postContent);
            convertView.setTag(item);
        }
        else
        {
            item=(PostListItemView)convertView.getTag();
        }
        //下边进行view的数据绑定

        PostItem temp=dataSet.get(position);

        item.postPic.setImageBitmap(PostItem.post_pic);
        item.postTitle.setText(temp.name);
        item.postTime.setText(temp.time);
        item.postContent.setText(temp.message);
        return convertView;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }
}
