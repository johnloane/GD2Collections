package com.dkit.gd2.johnloane;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Adventure
{
    private static Map<Integer , Location> locations = new HashMap<>();

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        initalizeGame();
        runGame(keyboard);
    }

    private static void runGame(Scanner keyboard)
    {

        Map<String, String> vocabulary = new HashMap<>();
        vocabulary.put("QUIT", "Q");
        vocabulary.put("NORTH", "N");
        vocabulary.put("SOUTH", "S");
        vocabulary.put("WEST", "W");
        vocabulary.put("EAST", "E");

        int loc = 1;
        while(true)
        {
            System.out.println(locations.get(loc).getDescription());
            if(loc == 0)
            {
                break;
            }
            Map<String, Integer> exits = locations.get(loc).getExits();
            System.out.println("Available exits");
            for(String exit:exits.keySet())
            {
                System.out.println(exit + ", ");
            }
            System.out.println();
            String direction = keyboard.nextLine().toUpperCase();
            if(direction.length() > 1)
            {
                String[] words = direction.split(" ");
                for(String word : words)
                {
                    if(vocabulary.containsKey(word))
                    {
                        direction = vocabulary.get(word);
                        break;
                    }
                }
            }

            if(exits.containsKey(direction))
            {
                loc = exits.get(direction);
            }
            else
            {
                System.out.println("No exit in that direction");
            }
        }
    }

    private static void initalizeGame()
    {
        Map<String, Integer> tempExit = new HashMap<>();
        locations.put(0, new Location(0, "You are in a forest", tempExit));
        tempExit = new HashMap<>();
        tempExit.put("W", 2);
        tempExit.put("E", 3);
        tempExit.put("S", 4);
        tempExit.put("N", 5);

        locations.put(1, new Location(1, "A dark cave", tempExit));

        tempExit = new HashMap<>();
        tempExit.put("N", 5);
        locations.put(2, new Location(2, "A crumbling tunnel", tempExit));
        tempExit = new HashMap<>();
        tempExit.put("W", 1);
        locations.put(3, new Location(3, "McDonalds", tempExit));
        tempExit = new HashMap<>();
        tempExit.put("N", 1);
        tempExit.put("W", 2);
        locations.put(4, new Location(4, "McDonalds carpart", tempExit));
        tempExit = new HashMap<>();
        tempExit.put("S", 1);
        tempExit.put("W", 2);
        locations.put(5, new Location(5, "DKIT campus", tempExit));

    }
}
