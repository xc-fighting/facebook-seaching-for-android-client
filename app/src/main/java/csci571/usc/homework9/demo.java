package csci571.usc.homework9;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import csci571.usc.homework9.common.Util;

/**
 * Created by xuchen on 2017/4/18.
 */

public class demo extends Activity {
    TextView test;
    String content="";
    private Handler handler = new Handler()
    {
        public void handleMessage(android.os.Message msg)
        {
            super.handleMessage(msg);
            test.setText(content);
        }
    };
    class dthread extends  Thread{
        private String url;

        public void run()
        {
            content= Util.getJsonFromPHP("usc","place");

            handler.sendEmptyMessage(0x101);
        }

    }
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.demo);
        test=(TextView)this.findViewById(R.id.textView3);
        new dthread().start();
      //  img=(ImageView)this.findViewById(R.id.imageView2);
      //  String url="https://scontent.xx.fbcdn.net/v/t31.0-1/c104.117.979.979/s720x720/11154997_985696921454760_2198316150351235477_o.jpg?oh=60a03db9523bc4519715c3fb2272805e&oe=59811D63";
     //   new dthread(url).start();
      //  img.setImageBitmap(Util.getHttpBitmap(url));
       // new DownLoadTask().execute(url);
    }
 /*   class DownLoadTask extends AsyncTask<String,Integer,Bitmap>
    {

        protected Bitmap doInBackground(String[] params) {
            String url=params[0];
            return Util.getHttpBitmap(url);

        }

        protected void onPostExecute(Bitmap input)
        {
            img.setImageBitmap(input);
        }
    }*/


}
