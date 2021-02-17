package com.dkit.gd2.johnloane;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Cinema dundalkOmniplex = new Cinema("Dundalk Omniplex", 8, 12);
        //List<Seat> seatCopy = new ArrayList<>(dundalkOmniplex.getSeats());
        //dundalkOmniplex.printSeats();
        //printList(seatCopy);
        //seatCopy.get(1).reserve();
        bookSeat(dundalkOmniplex, "A02");
        dundalkOmniplex.getSeats().add(new Seat("B00", 13.00));
        dundalkOmniplex.getSeats().add(new Seat("A00", 13.00));
        Collections.sort(dundalkOmniplex.getSeats(), new PriceComparator());

        printList(dundalkOmniplex.getSeats());

//        Collections.shuffle(seatCopy);
//        printList(seatCopy);
//        System.out.println("The original seats are...");
//        printList(dundalkOmniplex.getSeats());
//
//        Seat minSeat = Collections.min(seatCopy);
//        Seat maxSeat = Collections.max(seatCopy);
//        System.out.println("Min seat is: " + minSeat.getSeatNumber());
//        System.out.println("Max seat is: " + maxSeat.getSeatNumber());

        //bookSeat(dundalkOmniplex, "H11");
        //bookSeat(dundalkOmniplex, "H11");
//        sortList(seatCopy);
//        System.out.println("The sorted list follows.....");
//        printList(seatCopy);
//        System.out.println(seatCopy);
//        System.out.println(dundalkOmniplex.getSeats());

        //List<Seat> newList = new ArrayList<>(dundalkOmniplex.getSeats().size());
        //Collections.copy(newList, dundalkOmniplex.getSeats());

    }

    private static void sortList(List<Seat> seatCopy)
    {
        for(int i=0; i < seatCopy.size()-1; i++)
        {
            for(int j=i+1; j < seatCopy.size(); j++)
            {
                if(seatCopy.get(i).compareTo(seatCopy.get(j))>0)
                {
                    Collections.swap(seatCopy, i, j);
                }
            }
        }
    }

    private static void printList(List<Seat> seatCopy)
    {
        for(Seat seat : seatCopy)
        {
            System.out.println(seat.getSeatNumber() + " " + seat.getPrice());
        }
    }

    private static void bookSeat(Cinema dundalkOmniplex, String seatToBook)
    {
        if(dundalkOmniplex.reserveSeat(seatToBook))
        {
            System.out.println("Please pay");
        }
        else
        {
            System.out.println("Sorry, that seat is taken");
        }
    }


}
