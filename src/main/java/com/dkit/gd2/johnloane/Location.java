package com.dkit.gd2.johnloane;

//Location in a text based adventure

import java.util.HashMap;
import java.util.Map;

public final class Location
{
    private final int locationID;
    private final String description;
    private final Map<String, Integer> exits;

    public Location(int locationID, String description, Map<String, Integer> exits )
    {
        this.locationID = locationID;
        this.description = description;
        if(exits != null)
        {
            this.exits = new HashMap<String, Integer>(exits);
        }
        else
        {
            this.exits = new HashMap<>();
        }
    }

    //public void addExit(String direction, int location)
//    {
//        exits.put(direction, location);
//    }

    public int getLocationID()
    {
        return locationID;
    }

    public String getDescription()
    {
        return description;
    }

    public Map<String, Integer> getExits()
    {
        return new HashMap<String, Integer>(exits);
    }
}
