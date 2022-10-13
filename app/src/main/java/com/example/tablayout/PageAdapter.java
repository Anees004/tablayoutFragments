package com.example.tablayout;

import android.widget.Switch;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PageAdapter extends FragmentPagerAdapter {

    int count;
    public PageAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    public PageAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        count = behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch(position)
        {
            case 0:
                return new Camera_fragment();
            case 1:
                return new Chat_fragment();
            case 2:
                return new Status_fragment();
            case 3:
                return new Call_fragment();
            default: return  new Chat_fragment();

        }
    }

    @Override
    public int getCount() {
        return count;
    }
}
