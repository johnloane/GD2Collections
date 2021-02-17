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
        int loc = 0;
        while(true)
        {
            System.out.println(locations.get(loc).getDescription());
            if(loc == 5)
            {
                break;
            }
            loc = keyboard.nextInt();
            if(!locations.containsKey(loc))
            {
                System.out.println("You can't go in that direction");
            }
        }
    }

    private static void initalizeGame()
    {
        locations.put(0, new Location(0, "You are in a forest"));
        locations.put(1, new Location(1, "A dark cave"));
        locations.put(2, new Location(2, "A crumbling tunnel"));
        locations.put(3, new Location(3, "McDonalds"));
        locations.put(4, new Location(4, "McDonalds carpart"));
        locations.put(5, new Location(5, "DKIT campus"));

    }
}
