package chickens.org.dimilife.front;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import InsideFragment.InsideFragmentFirst;
import InsideFragment.InsideFragmentFourth;
import InsideFragment.InsideFragmentSecond;
import InsideFragment.InsideFragmentThird;

/**
 * Created by songhyemin on 2016. 12. 9..
 */


public class InsidePagerAdapter extends FragmentPagerAdapter {

    private int MAX_PAGE = 4;
    private Fragment cur_fragment = new Fragment();


    public InsidePagerAdapter(FragmentManager fm) {
        super(fm);
    }


    @Override
    public Fragment getItem(int position) {
        if(position<0 || MAX_PAGE<=position)
            return null;
        switch (position){
            case 0:
                cur_fragment=new InsideFragmentFirst();
                break;
            case 1:
                cur_fragment=new InsideFragmentSecond();
                break;
            case 2:
                cur_fragment=new InsideFragmentThird();
                break;
            case 3:
                cur_fragment=new InsideFragmentFourth();
                break;
        }
        return cur_fragment;
    }
    @Override
    public int getCount() {
        return MAX_PAGE;
    }
}
