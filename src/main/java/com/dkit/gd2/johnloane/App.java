package com.dkit.gd2.johnloane;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Cinema dundalkOmniplex = new Cinema("Dundalk Omniplex", 8, 12);
        dundalkOmniplex.printSeats();

        bookSeat(dundalkOmniplex, "H11");
        bookSeat(dundalkOmniplex, "H11");


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
