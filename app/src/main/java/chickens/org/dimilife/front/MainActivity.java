package chickens.org.dimilife.front;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
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
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Calendar;

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

        alarm_on();





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

    public void alarm_on(){
        // 알람 등록하기
        Log.i("alarm", "setAlarm");
        AlarmManager am = (AlarmManager)getSystemService(Context.ALARM_SERVICE);
        Intent intent = new Intent(this, AlarmReceive.class);   //AlarmReceive.class이클레스는 따로 만들꺼임 알람이 발동될때 동작하는 클레이스임

        PendingIntent sender = PendingIntent.getBroadcast(this, 0, intent, 0);

        Calendar calendar = Calendar.getInstance();
        //알람시간 calendar에 set해주기

        //시간을 11시 28분으로 일단 set했음
        calendar.set(Calendar.DAY_OF_WEEK,2);
        calendar.set(Calendar.HOUR_OF_DAY,20);
        calendar.set(Calendar.MINUTE,0);
        calendar.set(Calendar.SECOND, 0);

        //알람 예약
        //am.set(AlarmManager.RTC, calendar.getTimeInMillis(), sender);//이건 한번 알람
        am.setRepeating(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), 24*60*60*1000*7, sender);//이건 여러번 알람 24*60*60*1000 이건 일주일에한번 계속 알람한다는 뜻.
    }
}