package chickens.org.dimilife.front;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import chickens.org.dimilife.Fragment.FirstFragment;
import chickens.org.dimilife.Fragment.SecondFragment;
import chickens.org.dimilife.Fragment.ThirdFragment;

/**
 * Created by songhyemin on 2016. 12. 9..
 */

public class PagerAdapter extends FragmentPagerAdapter {

    private int MAX_PAGE=3;
    private Fragment cur_fragment=new Fragment();

    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position<0 || MAX_PAGE<=position)
            return null;
        switch (position){
            case 0:
                cur_fragment=new FirstFragment();
                break;
            case 1:
                cur_fragment=new SecondFragment();
                break;
            case 2:
                cur_fragment=new ThirdFragment();
                break;
        }
        return cur_fragment;
    }
    @Override
    public int getCount() {
        return MAX_PAGE;
    }
}
