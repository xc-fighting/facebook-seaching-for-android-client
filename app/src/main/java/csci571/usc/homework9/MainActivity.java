package csci571.usc.homework9;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Handler;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import csci571.usc.homework9.activity.AboutMeActivity;
import csci571.usc.homework9.activity.FavoriteActivity;
import csci571.usc.homework9.activity.ResultActivity;
import csci571.usc.homework9.common.AppConfig;
import csci571.usc.homework9.common.DataStorage;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {


    Button clearbtn;
    Button searchbtn;
    EditText inputbox;
    LocationManager locationManager=null;



    private void getLocation() {

        Location location = locationManager.getLastKnownLocation(LocationManager.GPS_PROVIDER);

        if (location != null) {

            AppConfig.latitude = location.getLatitude();

            AppConfig.longitude = location.getLongitude();
       //     Toast.makeText(this,"经纬度:"+AppConfig.latitude+" "+AppConfig.longitude,Toast.LENGTH_LONG).show();

        } else {



            locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 1000, 0, locationListener);

        }

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DataStorage ds = new DataStorage();
        ds.initDB();
        ds.closeDB();

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        clearbtn=(Button)this.findViewById(R.id.clearbtn);
        searchbtn=(Button)this.findViewById(R.id.searchbtn);
        inputbox=(EditText)this.findViewById(R.id.inputbox);
        clearbtn.setOnClickListener(new clicklistener());
        searchbtn.setOnClickListener(new clicklistener());
      //  new LocationDetectThread(this).start();
        locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);

        if (locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER))
        {
            getLocation();
        }
        else
        {
            new Handler(){}.postDelayed(new Runnable()
            {

                @Override
                public void run() {
                    getLocation();
                }
            }, 2000);
        }




    }

    LocationListener locationListener=new LocationListener() {
        @Override
        public void onLocationChanged(Location location) {
             AppConfig.latitude=location.getLatitude();
            AppConfig.longitude=location.getLongitude();
          //  Toast.makeText(MainActivity.this,"经纬度:"+AppConfig.latitude+" "+AppConfig.longitude,Toast.LENGTH_LONG).show();
        }

        @Override
        public void onStatusChanged(String provider, int status, Bundle extras) {

        }

        @Override
        public void onProviderEnabled(String provider) {

        }

        @Override
        public void onProviderDisabled(String provider) {

        }
    };


    class clicklistener implements View.OnClickListener
    {
        @Override
        public void onClick(View v) {
            switch(v.getId())
            {
                case R.id.clearbtn:
                {
                   inputbox.setText("");
                    Toast.makeText(MainActivity.this,"clear all",Toast.LENGTH_SHORT).show();
                   /* Intent intent=new Intent();
                    intent.setClass(MainActivity.this,demo.class);
                    MainActivity.this.startActivity(intent);*/
                }break;
                case R.id.searchbtn:
                {
                   if(inputbox.getText().toString().equals("")==true)
                   {
                       Toast.makeText(MainActivity.this,"input can not be empty",Toast.LENGTH_SHORT).show();
                   }
                    else
                   {
                       Intent intent=new Intent();
                       intent.setClass(MainActivity.this,ResultActivity.class);
                    //   Bundle bundle=new Bundle();
                    //   bundle.putString("searchContent",inputbox.getText().toString());
                   //    intent.putExtras(bundle);
                       ResultActivity.searchContent=inputbox.getText().toString();
                       MainActivity.this.startActivity(intent);
                   }
                }break;
            }
        }
    }



    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        Intent intent=new Intent();
        switch(id){
            case R.id.AboutMe:
            {
                intent.setClass(MainActivity.this,AboutMeActivity.class);
                MainActivity.this.startActivity(intent);
            }break;
            case R.id.Favorites:
            {
                intent.setClass(MainActivity.this, FavoriteActivity.class);
                MainActivity.this.startActivity(intent);
            }
        }


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);

        return true;
    }
}
