package chickens.org.dimilife;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by songhyemin on 2016. 12. 9..
 */

public class PagerAdapter extends FragmentPagerAdapter {

    private List<Fragment> listFragments;

    public PagerAdapter(FragmentManager fm, List<Fragment>listFragments) {
        super(fm);
        this.listFragments = listFragments;

    }

    @Override
    public Fragment getItem(int position) {
        return listFragments.get(position);
    }

    @Override
    public int getCount() {
        return listFragments.size();
    }
}
