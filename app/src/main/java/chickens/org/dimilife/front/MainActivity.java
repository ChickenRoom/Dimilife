package chickens.org.dimilife.front;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import chickens.org.dimilife.Fragment.FirstFragment;
import chickens.org.dimilife.Fragment.SecondFragment;
import chickens.org.dimilife.Fragment.ThirdFragment;
import chickens.org.dimilife.R;
import me.relex.circleindicator.CircleIndicator;

public class MainActivity extends AppCompatActivity implements FirstFragment.OnFragmentInteractionListener,SecondFragment.OnFragmentInteractionListener,ThirdFragment.OnFragmentInteractionListener {

    chickens.org.dimilife.front.SetResourceEffect setResourceEffect;
    Button alreadyBtn = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setResourceEffect = new chickens.org.dimilife.front.SetResourceEffect();

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        if (Build.VERSION.SDK_INT >= 21) {   //상태바 색
            getWindow().setStatusBarColor(Color.parseColor("#000000"));
        }


        ViewPager viewPager = (ViewPager)findViewById(R.id.viewpager_default);
        CircleIndicator indicator = (CircleIndicator)findViewById(R.id.indicator_default);
        chickens.org.dimilife.front.PagerAdapter adapter = new chickens.org.dimilife.front.PagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        indicator.setViewPager(viewPager);
        adapter.registerDataSetObserver(indicator.getDataSetObserver());





    }

    public void onClickTab(View v){

        Drawable ic;
        if(alreadyBtn != null){
            alreadyBtn.setTextColor(getResources().getColor(R.color.buttonUnSelected));
            ic = getDrawable(R.drawable.ic_event_note_unselected_24dp);
            alreadyBtn.setCompoundDrawablesWithIntrinsicBounds(ic, null, null, null);

        }

        Button newBtn = (Button) v.findViewById(v.getId());

        newBtn.setTextColor(getResources().getColor(R.color.buttonSelected));
        ic = getDrawable(R.drawable.ic_event_note_selected_24dp);
        newBtn.setCompoundDrawablesWithIntrinsicBounds(ic, null, null, null);
        alreadyBtn = newBtn;
    }



    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}