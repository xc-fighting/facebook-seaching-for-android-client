package csci571.usc.homework9.common;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import csci571.usc.homework9.entity.FavoriteItem;

/**
 * Created by xuchen on 2017/4/21.
 */

public class DataStorage {


    public  SQLiteDatabase database;

    private final String db_path=android.os.Environment.getExternalStorageDirectory().getAbsolutePath()+"/fbsearch";
    private final String db_name="favorite.db";
    private final String db_table="favorite_table";
    public DataStorage()
    {

        File dir=new File(db_path);
        if(dir.exists()==false)dir.mkdir();
        database=SQLiteDatabase.openOrCreateDatabase(db_path+"/"+db_name,null);


    }
    public void initDB()
    {
        database.execSQL("create table if not exists "+db_table+"(userID text not null,url text not null,name text not null,type text not null);");
    }

    public void insertRecord(FavoriteItem item)
    {

        database.execSQL("insert into favorite_table(userID,url,name,type) values(\""+item.ID+"\",\""+item.url+"\",\""+item.Name+"\",\""+item.type+"\")");
    }
    public void deleteRecord(String id)
    {
        database.execSQL("delete from favorite_table where userID='"+id+"'");
    }
    public List<FavoriteItem> Query(String type)
    {
        Cursor cursor=database.rawQuery("select * from favorite_table where type='"+type+"'",null);
        List<FavoriteItem> itemlist=new ArrayList<FavoriteItem>();
        if(cursor.getCount()==0||cursor.moveToFirst()==false)
        {
            return null;
        }
        for(int i=0;i<cursor.getCount();i++)
        {
            FavoriteItem item=new FavoriteItem();
            item.type=cursor.getString(cursor.getColumnIndex("type"));
            item.Name=cursor.getString(cursor.getColumnIndex("name"));
            item.url=cursor.getString(cursor.getColumnIndex("url"));
            item.ID=cursor.getString(cursor.getColumnIndex("userID"));
            itemlist.add(item);
            cursor.moveToNext();
        }
        return itemlist;
    }
    public boolean isRecordExist(String id)
    {
        Cursor cursor=database.rawQuery("select * from favorite_table where userID='"+id+"'",null);
        if(cursor.getCount()==0)return false;
        else return true;
    }


    public void closeDB()
    {
        this.database.close();
    }




}
