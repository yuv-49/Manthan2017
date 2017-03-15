package com.example.shivam.manthan.fragments;


import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.shivam.manthan.R;
import com.example.shivam.manthan.adapters.EventsAdapter;
import com.example.shivam.manthan.services.DataService;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link EventsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class EventsFragment extends Fragment {

    private static final String ARG_EVENT_TYPE = "event_type";

    public static final int EVENT_TYPE_FLAG = 0;
    public static final int EVENT_TYPE_FUN = 1;
    public static final int EVENT_TYPE_TECHNICAL = 2;
    public static final int EVENT_TYPE_CULTURAL = 3;

    private int eventType;

    public EventsFragment() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static EventsFragment newInstance(int eventType) {
        EventsFragment fragment = new EventsFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_EVENT_TYPE,eventType);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments()!=null){
            eventType =getArguments().getInt(ARG_EVENT_TYPE);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_events, container, false);

        RecyclerView recyclerView = (RecyclerView)view.findViewById(R.id.recycler_events);
        recyclerView.setHasFixedSize(true);

        EventsAdapter eventsAdapter;
        if (eventType == EVENT_TYPE_FLAG){
            eventsAdapter = new EventsAdapter(DataService.getInstance().getFlagShipEvents());

        }else if (eventType == EVENT_TYPE_FUN){
            eventsAdapter = new EventsAdapter(DataService.getInstance().getFunEvents());

        }else if (eventType == EVENT_TYPE_TECHNICAL){
            eventsAdapter = new EventsAdapter(DataService.getInstance().getTechnicalEvents());

        }else{
            eventsAdapter = new EventsAdapter(DataService.getInstance().getCulturalEvents());
        }
        recyclerView.setAdapter(eventsAdapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(layoutManager);
        return view;
    }

}
