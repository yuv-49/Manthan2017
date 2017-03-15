package com.example.shivam.manthan.model;

/**
 * Created by Shivam on 15-03-2017.
 */

public class Event {
    final String DRAWABLE = "@drawable/";
    private String eventName;
    private String imgUri;

    public Event(String eventName, String imgUri) {
        this.eventName = eventName;
        this.imgUri = imgUri;
    }

    public String getEventName() {
        return eventName;
    }

    public String getImgUri() {
        return imgUri;
    }
}
