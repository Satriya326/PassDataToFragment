package apps.shake.com.acttofrag.Fragments;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class FragmentPagerAdapter extends FragmentStatePagerAdapter {


    private List<Fragment> fragmentList = new ArrayList();
    private List<String> fragmentTitleList = new ArrayList<>();

    public FragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    public void addFragment (Fragment fragment, String title)
    {
        fragmentList.add(fragment);
        fragmentTitleList.add(title);

    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }
}

