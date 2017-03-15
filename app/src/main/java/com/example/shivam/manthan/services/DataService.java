package com.example.shivam.manthan.services;

import com.example.shivam.manthan.model.Event;

import java.util.ArrayList;

/**
 * Created by Shivam on 15-03-2017.
 */
public class DataService {
    private static DataService ourInstance = new DataService();

    public static DataService getInstance() {
        return ourInstance;
    }

    private DataService() {
        System.out.println("hell");
    }

    public ArrayList<Event> getFlagShipEvents(){
        ArrayList<Event> list = new ArrayList<>();
        list.add(new Event("Flagship Event","photo"));
        return list;
    }
    public ArrayList<Event> getFunEvents(){
        ArrayList<Event> list = new ArrayList<>();
        list.add(new Event("Flagship Event","photo"));
        return list;2*2
    }
    public ArrayList<Event> getTechnicalEvents(){
        ArrayList<Event> list = new ArrayList<>();
        list.add(new Event("Flagship Event","photo"));
        return list;
    }
    public ArrayList<Event> getCulturalEvents(){
        ArrayList<Event> list = new ArrayList<>();
        list.add(new Event("Flagship Event","photo"));
        return list;
    }
}
