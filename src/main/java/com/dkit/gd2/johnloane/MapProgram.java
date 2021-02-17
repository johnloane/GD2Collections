package com.dkit.gd2.johnloane;

import java.util.HashMap;
import java.util.Map;

public class MapProgram
{
    public static void main(String[] args)
    {
        Map<String, String> languages = new HashMap<>();

        populateMap(languages);
        accessingAndUpdatingCarefully(languages);
        removeItemsFromMap(languages);
        replaceValuesForKey(languages);
        printAllKeysForAMap(languages);
    }

    private static void printAllKeysForAMap(Map<String, String> languages)
    {
        for(String key : languages.keySet())
        {
            System.out.println(key + " : " + languages.get(key));
        }
    }

    private static void replaceValuesForKey(Map<String, String> languages)
    {
        if(languages.replace("Python", "An interpreted, oop, high level", "Something new"))
        {
            System.out.println("Python replaced");
        }
        else
        {
            System.out.println("Python not replaced");
        }
    }

    private static void removeItemsFromMap(Map<String, String> languages)
    {
        if(languages.remove("Haskell", "A functional language"))
        {
            System.out.println("Haskell removed");
        }
        else
        {
            System.out.println("Haskell not removed, key value pair not found");
        }
    }

    private static void accessingAndUpdatingCarefully(Map<String, String> languages)
    {
        System.out.println(languages.get("C++"));
        //Keys in a map need to be unique
        if(languages.containsKey("C++"))
        {
            System.out.println("Already contains C++, not going to overwrite");
        }
        else
        {
            languages.put("C++", "The best programming language of all time");
        }
        System.out.println(languages.get("C++"));
    }

    private static void populateMap(Map<String, String> languages)
    {
        languages.put("Java", "A compiled high level, object oriented language");
        System.out.println(languages.put("C++", "A compiled high level, object oriented language, which is really important for Games because it is fast and efficient"));
        languages.put("Javascript", "high level, backend web development language");
        languages.put("Python", "A interpreted, oop, high level");
    }

}
