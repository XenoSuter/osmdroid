package org.osmdroid.samplefragments.layouts;

import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.osmdroid.R;
import org.osmdroid.samplefragments.BaseSampleFragment;
import org.osmdroid.samplefragments.layouts.pager.MapSliderAdapter;

/**
 * Created by alex on 10/22/16.
 */

public class MapInAViewPagerFragment extends BaseSampleFragment {
    ViewPager mPager;
    PagerAdapter mPagerAdapter;

    @Override
    public String getSampleTitle() {
        return "Map in a view pager";
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.map_viewpager, null);
        mPager = (ViewPager) v.findViewById(R.id.pager);
        mPagerAdapter = new MapSliderAdapter(getActivity().getSupportFragmentManager());
        mPager.setAdapter(mPagerAdapter);
        return v;
    }
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d(TAG, "onActivityCreated");

    }

    @Override
    public void onDestroyView(){
        super.onDestroyView();
        Log.d(TAG, "onDetach");

    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.d(TAG, "onDestroy");

    }

    @Override
    public void runTestProcedures(){
        getActivity().runOnUiThread(new Runnable() {
            @Override
            public void run() {
                mPager.setCurrentItem(0, true);
            }
        });
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        getActivity().runOnUiThread(new Runnable() {
            @Override
            public void run() {
                mPager.setCurrentItem(1, true);
            }
        });
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        getActivity().runOnUiThread(new Runnable() {
            @Override
            public void run() {
                mPager.setCurrentItem(2, true);
            }
        });
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        getActivity().runOnUiThread(new Runnable() {
            @Override
            public void run() {
                mPager.setCurrentItem(1, true);
            }
        });

        getActivity().runOnUiThread(new Runnable() {
            @Override
            public void run() {
                mPager.setCurrentItem(0, true);
            }
        });
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


}
