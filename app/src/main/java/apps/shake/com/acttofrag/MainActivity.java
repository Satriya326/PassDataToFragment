package apps.shake.com.acttofrag;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import apps.shake.com.acttofrag.Fragments.FragmentLogin;
import apps.shake.com.acttofrag.Fragments.FragmentPagerAdapter;
import apps.shake.com.acttofrag.Fragments.FragmentReceiveLogin;

public class MainActivity extends AppCompatActivity {

    private FragmentPagerAdapter mFragmentPagerAdapter;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //to acquire fragment manager
        mFragmentPagerAdapter = new FragmentPagerAdapter(getSupportFragmentManager());
        //setup pager
        mViewPager = findViewById(R.id.viewPager);
        setupViewPager(mViewPager);


    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    private void setupViewPager (ViewPager viewPager)
    {
        FragmentPagerAdapter adapter = new FragmentPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new FragmentLogin(), "Fragment1");
        adapter.addFragment(new FragmentReceiveLogin(), "FragmentReceiveLogin");

        viewPager.setAdapter(adapter);
    }

    public void setViewPager(int fragmentNumber)
    {
        mViewPager.setCurrentItem(fragmentNumber);
    }
}
