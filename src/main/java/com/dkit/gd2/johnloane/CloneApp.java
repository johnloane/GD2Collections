package com.dkit.gd2.johnloane;

public class CloneApp
{
    public static void main(String[] args)
    {
        Player playerOne = new Player(10, 0, "Stephen");

//        makeShallowCopy(playerOne);
//        makeDeepCopyHardWay(playerOne);
//        copyUsingCopyConstructor(playerOne);
        makeCloneCopy(playerOne);
    }

    private static void makeCloneCopy(Player playerOne)
    {
        try
        {
            Player playerTwo = (Player)playerOne.clone();
            System.out.println(System.identityHashCode(playerOne));
            System.out.println(System.identityHashCode(playerTwo));

            System.out.println(playerOne);
            System.out.println(playerTwo);
            playerTwo.setHitPoints(333);
            System.out.println("Player Two" + playerTwo);
            System.out.println("Player One" + playerOne);
        }
        catch(CloneNotSupportedException cnse)
        {
            System.out.println("Problem cloning " + cnse.getMessage());
        }
    }

    private static void copyUsingCopyConstructor(Player playerOne)
    {
        Player playerTwo = new Player(playerOne);

        System.out.println(System.identityHashCode(playerOne));
        System.out.println(System.identityHashCode(playerTwo));

        System.out.println(playerOne);
        System.out.println(playerTwo);
        playerTwo.setHitPoints(333);
        System.out.println("Player Two" + playerTwo);
        System.out.println("Player One" + playerOne);
    }

    private static void makeDeepCopyHardWay(Player playerOne)
    {
        Player playerTwo = new Player();
        playerTwo.setHitPoints(playerOne.getHitPoints());
        playerTwo.setScore(playerOne.getScore());
        playerTwo.setUserName(playerOne.getUserName());

        System.out.println(System.identityHashCode(playerOne));
        System.out.println(System.identityHashCode(playerTwo));

        System.out.println(playerOne);
        System.out.println(playerTwo);
        playerTwo.setHitPoints(333);
        System.out.println("Player Two" + playerTwo);
        System.out.println("Player One" + playerOne);
    }

    private static void makeShallowCopy(Player playerOne)
    {
        Player playerTwo = playerOne;

        System.out.println(System.identityHashCode(playerOne));
        System.out.println(System.identityHashCode(playerTwo));

        System.out.println(playerOne);
        playerTwo.setHitPoints(100000);
        System.out.println("Player Two" + playerTwo);
        System.out.println("Player One" + playerOne);
    }
}
