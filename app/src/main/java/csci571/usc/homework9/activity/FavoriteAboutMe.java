package csci571.usc.homework9.activity;

import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import csci571.usc.homework9.R;

/**
 * Created by xuchen on 2017/4/24.
 */

public class FavoriteAboutMe extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_me);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
      /*  try
        {
            PackageInfo info=getPackageManager().getPackageInfo("csci571.usc.homework9.AboutMeActivity", PackageManager.GET_SIGNATURES);
            for(Signature signature:info.signatures)
            {
                MessageDigest md = MessageDigest.getInstance("SHA");
                md.update(signature.toByteArray());
                Log.d("KeyHash:", Base64.encodeToString(md.digest(), Base64.DEFAULT));
                Toast.makeText(AboutMeActivity.this,Base64.encodeToString(md.digest(), Base64.DEFAULT),Toast.LENGTH_LONG).show();
            }
        }
        catch(PackageManager.NameNotFoundException e)
        {
            e.printStackTrace();

        }
        catch (NoSuchAlgorithmException e) {
            e.printStackTrace();

        }*/
    }

    public boolean onOptionsItemSelected(MenuItem item){
        switch(item.getItemId())
        {
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
