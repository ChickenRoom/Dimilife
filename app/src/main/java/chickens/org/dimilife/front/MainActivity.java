package chickens.org.dimilife.front;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import InsideFragment.InsideFragmentFirst;
import InsideFragment.InsideFragmentFourth;
import InsideFragment.InsideFragmentSecond;
import InsideFragment.InsideFragmentThird;
import chickens.org.dimilife.Fragment.FirstFragment;
import chickens.org.dimilife.Fragment.SecondFragment;
import chickens.org.dimilife.Fragment.ThirdFragment;
import chickens.org.dimilife.R;
import me.relex.circleindicator.CircleIndicator;

public class MainActivity extends AppCompatActivity implements FirstFragment.OnFragmentInteractionListener,SecondFragment.OnFragmentInteractionListener,ThirdFragment.OnFragmentInteractionListener,
InsideFragmentFirst.OnFragmentInteractionListener, InsideFragmentSecond.OnFragmentInteractionListener, InsideFragmentThird.OnFragmentInteractionListener, InsideFragmentFourth.OnFragmentInteractionListener{

    Button alreadyBtn = null;
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentManager = getSupportFragmentManager();


        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();



        ViewPager viewPager = (ViewPager)findViewById(R.id.viewpager_default);
        CircleIndicator indicator = (CircleIndicator)findViewById(R.id.indicator_default);
        chickens.org.dimilife.front.PagerAdapter adapter = new chickens.org.dimilife.front.PagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        indicator.setViewPager(viewPager);
        adapter.registerDataSetObserver(indicator.getDataSetObserver());





    }

    public void onClickTab(View v){
        fragmentTransaction = fragmentManager.beginTransaction();

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



        switch (v.getId()){
            case R.id.day_tab:
                InsideFragmentFirst first = new InsideFragmentFirst();
                fragmentTransaction.replace(R.id.contents, first).addToBackStack(null).commit();

                break;
            case R.id.week_tab:
                InsideFragmentSecond second = new InsideFragmentSecond();
                fragmentTransaction.replace(R.id.contents, second).addToBackStack(null).commit();
                break;

            case R.id.month_tab:
                InsideFragmentThird third = new InsideFragmentThird();
                fragmentTransaction.replace(R.id.contents, third).addToBackStack(null).commit();
                break;
            case R.id.borrow_tab:
                InsideFragmentFourth fourth = new InsideFragmentFourth();
                fragmentTransaction.replace(R.id.contents, fourth).addToBackStack(null).commit();
                break;
        }



    }




    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}