package chickens.org.dimilife.front;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.view.LayoutInflater;

import java.util.List;

/**
 * Created by songhyemin on 2016. 12. 9..
 */

public class PagerAdapter extends FragmentStatePagerAdapter {

    Context context;
    List<Fragment> listFragments;
    LayoutInflater inflater;


    public PagerAdapter(FragmentManager fm) {
        super(fm);
        listFragments.add();
        listFragments.add();
        listFragments.add();

    }

    @Override
    public Fragment getItem(int position) {
        return Fragment.;
    }

    @Override
    public int getCount() {
        return 0;
    }
}
