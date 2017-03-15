package com.example.shivam.manthan.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.shivam.manthan.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MainFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MainFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match


    public MainFragment() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static MainFragment newInstance() {
        MainFragment fragment = new MainFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =inflater.inflate(R.layout.fragment_main, container, false);

        FragmentManager fm = getActivity().getSupportFragmentManager();
        EventsFragment flagShipEvent;
        EventsFragment funEvent;
        EventsFragment technicalEvent;
        EventsFragment culturalEvent;

        flagShipEvent = EventsFragment.newInstance(EventsFragment.EVENT_TYPE_FLAG);
        fm.beginTransaction().add(R.id.container_flagShipEvent,flagShipEvent).commit();

        funEvent = EventsFragment.newInstance(EventsFragment.EVENT_TYPE_FUN);
        fm.beginTransaction().add(R.id.container_funEvent,funEvent).commit();

        technicalEvent = EventsFragment.newInstance(EventsFragment.EVENT_TYPE_TECHNICAL);
        fm.beginTransaction().add(R.id.container_technicalEvent,technicalEvent).commit();

        culturalEvent = EventsFragment.newInstance(EventsFragment.EVENT_TYPE_CULTURAL);
        fm.beginTransaction().add(R.id.container_culturalEvent,culturalEvent).commit();
        return v;
    }

}
