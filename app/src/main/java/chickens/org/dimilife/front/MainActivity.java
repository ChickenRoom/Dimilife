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
import me.relex.circleindicator.CircleIndicator;

public class MainActivity extends AppCompatActivity implements FirstFragment.OnFragmentInteractionListener,SecondFragment.OnFragmentInteractionListener,ThirdFragment.OnFragmentInteractionListener {

    chickens.org.dimilife.front.SetResourceEffect setResourceEffect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setResourceEffect = new chickens.org.dimilife.front.SetResourceEffect();

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();



        ViewPager viewPager = (ViewPager)findViewById(R.id.viewpager_default);
        CircleIndicator indicator = (CircleIndicator)findViewById(R.id.indicator_default);
        chickens.org.dimilife.front.PagerAdapter adapter = new chickens.org.dimilife.front.PagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        indicator.setViewPager(viewPager);
        adapter.registerDataSetObserver(indicator.getDataSetObserver());





    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}