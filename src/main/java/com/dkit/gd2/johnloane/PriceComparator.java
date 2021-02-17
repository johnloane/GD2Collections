package com.dkit.gd2.johnloane;

import java.util.Comparator;

//Orderings have to be consistent with equals
//B00 13 == A00 13?
//Homework: Edit this PriceComparator to make it consistent with equals
//Hint: After comparing prices add an additional check to compare seatnums
public class PriceComparator implements Comparator<Seat>
{
    @Override
    public int compare(Seat seat1, Seat seat2)
    {
        if(seat1.getPrice() < seat2.getPrice())
        {
            return -1;
        }
        else if(seat1.getPrice() > seat2.getPrice())
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
}
