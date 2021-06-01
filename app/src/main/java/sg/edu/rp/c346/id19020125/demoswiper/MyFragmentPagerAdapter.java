package sg.edu.rp.c346.id19020125.demoswiper;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class MyFragmentPagerAdapter extends FragmentPagerAdapter {

    ArrayList<Fragment> fragments;

    public MyFragmentPagerAdapter(FragmentManager fm, ArrayList<Fragment> al) {
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        fragments = al;
    }

    @Override
    public Fragment getItem(int postion) {
        return fragments.get(postion);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }
}
