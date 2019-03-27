package com.example.sachin.dtures;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {
    int NoofTabs;
    public PagerAdapter(FragmentManager fm,int NoofTabs) {
        super(fm);
        this.NoofTabs=NoofTabs;
    }


    @Override
    public Fragment getItem(int i) {
        switch (i){
            case  0:
                return new dtuHome();
            case  1:
                return new DTU_News();
            case 2:
                return new DtuMaps();
            case 3:
                return new Help_Desk();
            default: return null;
        }
    }

    @Override
    public int getCount() {
        return NoofTabs;
    }
}
