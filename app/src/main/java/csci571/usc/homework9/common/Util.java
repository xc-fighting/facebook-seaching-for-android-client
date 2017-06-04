package csci571.usc.homework9.common;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

import csci571.usc.homework9.common.AppConfig;
import csci571.usc.homework9.entity.DetailEntry;
import csci571.usc.homework9.entity.ProfileEntry;


/**
 * Created by xuchen on 2017/4/18.
 */

public class Util {
    public static Bitmap getHttpBitmap(String url)
    {
        URL myFileUrl=null;
        Bitmap bitmap=null;
        try
        {
            myFileUrl=new URL(url);
            HttpURLConnection conn=(HttpURLConnection)myFileUrl.openConnection();
            conn.setConnectTimeout(6000);
            conn.setDoInput(true);
            conn.setUseCaches(false);
            InputStream is=conn.getInputStream();
            bitmap= BitmapFactory.decodeStream(is);
            bitmap=Bitmap.createScaledBitmap(bitmap,150,150,false);
           // bitmap.setWidth(100);
           // bitmap.setHeight(100);
            is.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return bitmap;
    }


    public static Bitmap getHttpBitmapEx(String id)
    {
        String url="https://graph.facebook.com/v2.8/"+id+"/picture?access_token=EAAFEQ3QaLo4BAFhb8ttZBC7pevj16spW3pZCnxBfD1EUy8MZAG6XofJppyLfrazwTMrE59QO7GTDCexzIW13aPtDIGmb9fy0wI0xB9TqwpDbDDBTCwOKG2kZCR5bF6vkcZBrWq0HezIQju4TDqKMBP3L8taCl3AQZD";
        URL myFileUrl=null;
        Bitmap bitmap=null;
        try
        {
            myFileUrl=new URL(url);
            HttpURLConnection conn=(HttpURLConnection)myFileUrl.openConnection();
            conn.setConnectTimeout(6000);
            conn.setDoInput(true);
            conn.setUseCaches(false);
            InputStream is=conn.getInputStream();
            bitmap= BitmapFactory.decodeStream(is);
           // bitmap=Bitmap.createScaledBitmap(bitmap,150,150,false);
            // bitmap.setWidth(100);
            // bitmap.setHeight(100);
            is.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return bitmap;
    }











    public static String getJsonFromPHP(String input,String type)
    {
        String url=null;
        StringBuilder sb=null;
        switch(type)
        {
            case "user":
            {
               url= AppConfig.requestURL+"?type=Users&content="+input;
            }break;
            case "page":
            {
               url=AppConfig.requestURL+"?type=Pages&content="+input;
            }break;
            case "event":
            {
               url=AppConfig.requestURL+"?type=Events&content="+input;
            }break;
            case "place":
            {
               url=AppConfig.requestURL+"?type=Places&content="+input+"&latitude="+AppConfig.latitude+"&longitude="+AppConfig.longitude;
            }break;
            case "group":
            {
              url=AppConfig.requestURL+"?type=Groups&content="+input;
            }break;
            case "previouspage":
            {
                url=input;
            }break;
            case "nextpage":
            {
               url=input;
            }break;
            case "detail":
            {
                url=AppConfig.requestURL+"?userID="+input;
            }break;
        }
        try
        {
            URL myFileUrl=new URL(url);
            HttpURLConnection conn=(HttpURLConnection)myFileUrl.openConnection();
            conn.setConnectTimeout(6000);
            conn.setDoInput(true);
            conn.setUseCaches(false);
            InputStream is=conn.getInputStream();
            BufferedReader reader=new BufferedReader(new InputStreamReader(is));
            sb=new StringBuilder();
            String line=null;
            while((line=reader.readLine())!=null)
            {
                sb.append(line);
            }
            is.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }



        return sb.toString();
    }

    public static ProfileEntry GetProfileJason(String input){
        Gson json=new Gson();
        ProfileEntry pe=json.fromJson(input, ProfileEntry.class);
        return pe;
    }

    public static DetailEntry GetDetailJason(String input){
        Gson json=new Gson();
        DetailEntry de=json.fromJson(input,DetailEntry.class);
        return de;
    }

    public static String ConvertToDateFormat(String str){
       // SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS Z");
        SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d=new Date();
        try
        {
            d=format.parse(str);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

        return d.toString();
    }

}
