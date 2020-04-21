package com.ak.myCovid_19;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class OrderDeceiderFragment extends FragmentStateAdapter {

    public OrderDeceiderFragment(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new TrackFragment();
            case 1:
                return new DOandDontFragment();
            case 2:
                return new HelplineNoFragment();
            default:
                return new WHOFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
