package chickens.org.dimilife.front;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import chickens.org.dimilife.InsideFragment.InsideFragmentFirst;
import chickens.org.dimilife.InsideFragment.InsideFragmentFourth;
import chickens.org.dimilife.InsideFragment.InsideFragmentSecond;
import chickens.org.dimilife.InsideFragment.InsideFragmentThird;
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
    private long backKeyPressedTime = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentManager = getSupportFragmentManager();


        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        if (Build.VERSION.SDK_INT >= 21) {   //상태바 색
            getWindow().setStatusBarColor(Color.parseColor("#000000"));
        }


        putBitmap(R.id.dimi_imageview,R.drawable.dimigo,8);


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
    public void onBackPressed() {
        if (System.currentTimeMillis() > backKeyPressedTime + 2000) {
            backKeyPressedTime = System.currentTimeMillis();
            Toast.makeText(this, "\'뒤로\'버튼을 한번 더 누르시면 종료됩니다.", Toast.LENGTH_SHORT).show();
            return;
        }
        if (System.currentTimeMillis() <= backKeyPressedTime + 2000) {
            finish();
        }
        super.onBackPressed();
    }




    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        recycleView(R.id.dimi_imageview);
    }

    private void putBitmap(int imageViewId, int drawableId, int scale) {
        ImageView imageView = (ImageView)findViewById(imageViewId);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = scale;

        imageView.setImageBitmap(BitmapFactory.decodeResource(getResources(), drawableId, options));
    }

    private void recycleView(int id) {
        ImageView view = (ImageView)findViewById(id);

        Drawable d = view.getDrawable();
        if(d instanceof BitmapDrawable) {
            Bitmap b = ((BitmapDrawable) d).getBitmap();
            view.setImageBitmap(null);
            b.recycle();
            b = null;
        }
        d.setCallback(null);
        System.gc();
        Runtime.getRuntime().gc();
    }
}