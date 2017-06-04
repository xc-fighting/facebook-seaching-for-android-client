package csci571.usc.homework9.entity;

import android.graphics.Bitmap;

/**
 * Created by xuchen on 2017/4/18.
 */

public class ProfileItem {
    public Bitmap profile_picture;
    public String profile_name;
    public String profile_id;
    public boolean isFavorite=false;
    public String profile_pic_url;
    public String type;//user,page,event,group,place

    public ProfileItem()
    {

    }
    public ProfileItem(Bitmap _pic, String _name,String _id,boolean favorite,String _url,String type)
    {
        this.profile_picture=_pic;
        this.profile_name=_name;
        this.profile_id=_id;
        this.isFavorite=favorite;
        this.profile_pic_url=_url;
        this.type=type;
    }

    public ProfileItem(Bitmap _pic, String _name,String _id,boolean favorite,String type)
    {
        this.profile_picture=_pic;
        this.profile_name=_name;
        this.profile_id=_id;
        this.isFavorite=favorite;
        this.type=type;
    }

}
