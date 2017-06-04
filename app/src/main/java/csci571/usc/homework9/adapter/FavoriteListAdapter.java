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
import csci571.usc.homework9.activity.FavoriteDetailActivity;
import csci571.usc.homework9.entity.ListItemView;
import csci571.usc.homework9.entity.ProfileItem;

/**
 * Created by xuchen on 2017/4/21.
 */

public class FavoriteListAdapter extends BaseAdapter {

    public List<ProfileItem> favorite_list;
    Context context;
    LayoutInflater inflater;
    public FavoriteListAdapter(Context context,List<ProfileItem> data)
    {
        favorite_list=new ArrayList<ProfileItem>();
        this.context=context;
        this.favorite_list=data;
        inflater=LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return favorite_list.size();
    }

    @Override
    public Object getItem(int position) {
        return favorite_list.get(position);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ListItemView item=null;

        if(convertView==null)
        {
            item=new ListItemView();
            convertView=inflater.inflate(R.layout.favorite_listitem,null);
            item.profilephoto=(ImageView)convertView.findViewById(R.id.favorite_item_photo);
            item.favoritebtn=(ImageView)convertView.findViewById(R.id.favorite_item_like);
            item.profilename=(TextView)convertView.findViewById(R.id.favorite_item_name);
            item.detailbtn=(ImageView)convertView.findViewById(R.id.favorite_item_detail);
            convertView.setTag(item);
        }
        else
        {
            item=(ListItemView) convertView.getTag();
        }
        item.profilephoto.setImageBitmap(favorite_list.get(position).profile_picture);
        item.profilename.setText(favorite_list.get(position).profile_name);
        item.detailbtn.setOnClickListener(new btnlistener(position));

        return convertView;
    }
    class btnlistener implements  View.OnClickListener
    {
        int position;
        public btnlistener(int position)
        {
            this.position=position;
        }

        @Override
        public void onClick(View v) {
            Intent intent=new Intent();
            intent.setClass(context, FavoriteDetailActivity.class);
            Bundle bundle=new Bundle();
            bundle.putString("userID",favorite_list.get(position).profile_id);
            bundle.putString("type",favorite_list.get(position).type);
            bundle.putBoolean("islike",favorite_list.get(position).isFavorite);
            intent.putExtras(bundle);
            context.startActivity(intent);
        }
    }


    @Override
    public long getItemId(int position) {
        return position;
    }
}
