package chickens.org.dimilife.front;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;

import chickens.org.dimilife.Fragment.FirstFragment;
import chickens.org.dimilife.Fragment.SecondFragment;
import chickens.org.dimilife.Fragment.ThirdFragment;
import chickens.org.dimilife.R;

public class MainActivity extends AppCompatActivity implements FirstFragment.OnFragmentInteractionListener,SecondFragment.OnFragmentInteractionListener,ThirdFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        ViewPager viewPager = (ViewPager)findViewById(R.id.view_pager);
        viewPager.setAdapter(new PagerAdapter(getSupportFragmentManager()));




    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}