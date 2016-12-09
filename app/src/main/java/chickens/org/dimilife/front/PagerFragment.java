package chickens.org.dimilife.front;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;

import chickens.org.dimilife.R;

/**
 * Created by songhyemin on 2016. 12. 9..
 */

public class PagerFragment extends FragmentActivity {

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = (ViewPager) findViewById(R.id.view_pager);
        PagerAdapter adapter = new chickens.org.dimilife.front.PagerAdapter(getSupportFragmentManager());
        
        viewPager.setAdapter(adapter);
    }

}
