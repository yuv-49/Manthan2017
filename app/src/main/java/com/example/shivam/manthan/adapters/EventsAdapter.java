package com.example.shivam.manthan.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.example.shivam.manthan.holders.EventsViewHolder;
import com.example.shivam.manthan.model.Event;

import java.util.ArrayList;

/**
 * Created by Shivam on 15-03-2017.
 */

public class EventsAdapter extends RecyclerView.Adapter<EventsViewHolder> {

    private ArrayList<Event> events;

    public EventsAdapter(ArrayList<Event> events) {
        this.events = events;
    }

    @Override
    public EventsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(EventsViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
