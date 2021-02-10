package com.dkit.gd2.johnloane;

import java.util.*;

public class Cinema
{
    private final String name;
    private List<Seat> seats = new ArrayList<>();

    public Cinema(String name, int numRows, int seatsPerRow)
    {
        this.name = name;

        int lastRow = 'A' + (numRows-1);
        for(char row = 'A'; row <= lastRow; row++)
        {
            for(int seatNum=1; seatNum <= seatsPerRow; seatNum++)
            {
                Seat seat = new Seat(row+String.format("%02d", seatNum));
                seats.add(seat);
            }
        }
    }

    public String getName()
    {
        return name;
    }

    public Collection<Seat> getSeats()
    {
        return seats;
    }

    public void printSeats()
    {
        for(Seat seat : this.seats)
        {
            System.out.println(seat.getSeatNumber());
        }
    }

    public boolean reserveSeat(String seatNumber)
    {
        Seat requestedSeat = new Seat(seatNumber);
        int low = 0;
        int high = seats.size()-1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            T midVal = l.get(mid);
            int cmp = c.compare(midVal, key);

            if (cmp < 0)
                low = mid + 1;
            else if (cmp > 0)
                high = mid - 1;
            else
                return mid; // key found
        }
        return -(low + 1);  // key not found
//        int count = 0;
//        for(Seat seat : seats)
//        {
//            System.out.print(".");
//            count++;
//            if(seat.getSeatNumber().equals(seatNumber))
//            {
//                requestedSeat = seat;
//                System.out.println(count);
//                break;
//            }
//        }
//        if(requestedSeat == null)
//        {
//            System.out.println(count);
//            System.out.println("There is no seat " + seatNumber);
//            return false;
//        }
//        return requestedSeat.reserve();
    }
}