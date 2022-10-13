package com.example.tablayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.TableLayout;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
TabLayout tabLayout;
TabItem tb1,tb2,tb3,tb4;
    ViewPager vpagr;
    PageAdapter fragmentAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout = findViewById(R.id.tablayout);
        tb1 = findViewById(R.id.tab1);
        tb2 = findViewById(R.id.tab2);
        tb3 = findViewById(R.id.tab3);
        vpagr = findViewById(R.id.vpager);
        fragmentAdapter = new PageAdapter(getSupportFragmentManager(),tabLayout.getTabCount());
        vpagr.setAdapter(fragmentAdapter);

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                vpagr.setCurrentItem(tab.getPosition());

                if(tab.getPosition()==0||tab.getPosition() == 2||tab.getPosition() == 3||tab.getPosition() == 1)
          fragmentAdapter.notifyDataSetChanged();
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        vpagr.setOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
    }
}