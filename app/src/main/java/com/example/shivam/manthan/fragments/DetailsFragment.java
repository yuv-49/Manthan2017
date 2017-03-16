package com.example.shivam.manthan.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.shivam.manthan.R;
import com.example.shivam.manthan.adapters.ViewPagerAdapter;

import java.util.Timer;
import java.util.TimerTask;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DetailsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DetailsFragment extends Fragment {

    private static final String ARG_EVENT_DETAIL_TYPE = "event_detail_type";
    public static final String DETAIL_EVENT_TYPE_FLAG = "Flag Event";
    public static final String DETAIL_EVENT_TYPE_FUN = "Fun Event";
    public static final String DETAIL_EVENT_TYPE_TECHNICAL = "Technical Event";
    public static final String DETAIL_EVENT_TYPE_CULTURAL = "Cultural Event";
    private TextView detailText;
    private String eventDetailType;
    private ViewPager viewPager;


    public DetailsFragment() {
        // Required empty public constructor
    }


    public static DetailsFragment newInstance(String eventDetailType) {
        DetailsFragment fragment = new DetailsFragment();
        Bundle args = new Bundle();
        args.putString(ARG_EVENT_DETAIL_TYPE, eventDetailType);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            eventDetailType = getArguments().getString(ARG_EVENT_DETAIL_TYPE);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_details, container, false);
        detailText =(TextView)v.findViewById(R.id.detailTextId);
        viewPager = (ViewPager)v.findViewById(R.id.viewPagerId);
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getContext());
        viewPager.setAdapter(viewPagerAdapter);

        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new MyTimerTask(),2000,4000);
//        if (eventDetailType.equals(DETAIL_EVENT_TYPE_FUN)){
//
//        }else{
//
//        }

        return v;
    }

    public class MyTimerTask extends TimerTask{
        @Override
        public void run() {
            getActivity().runOnUiThread(new Runnable() {
                @Override
                public void run() {
                       if(viewPager.getCurrentItem()==0) {
                           viewPager.setCurrentItem(1);
                       }else if (viewPager.getCurrentItem() == 1){
                           viewPager.setCurrentItem(2);
                       }else if (viewPager.getCurrentItem() == 2){
                           viewPager.setCurrentItem(3);
                       }else if (viewPager.getCurrentItem() == 3){
                           viewPager.setCurrentItem(4);
                       }else if (viewPager.getCurrentItem() == 4){
                           viewPager.setCurrentItem(5);
                       }else if (viewPager.getCurrentItem() == 5){
                           viewPager.setCurrentItem(0);
                       }

                }
            });
        }

    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
}
