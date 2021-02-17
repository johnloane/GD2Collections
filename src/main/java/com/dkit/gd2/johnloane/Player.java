package com.dkit.gd2.johnloane;

public class Player implements Cloneable
{
    private int hitPoints;
    private int score;
    private String userName;

    public Player(int hitPoints, int score, String userName)
    {
        this.hitPoints = hitPoints;
        this.score = score;
        this.userName = userName;
    }

    public Player()
    {
        this(0, 0, "Default");
    }

    //Copy constructor - will copy all of the attributes over to the new object
    public Player(Player playerOne)
    {
        this.hitPoints = playerOne.hitPoints;
        this.score = playerOne.score;
        this.userName = playerOne.userName;
    }

    public int getHitPoints()
    {
        return hitPoints;
    }

    public int getScore()
    {
        return score;
    }

    public String getUserName()
    {
        return userName;
    }

    public void setHitPoints(int hitPoints)
    {
        if(hitPoints < 0 || hitPoints > 100)
        {
            this.hitPoints = hitPoints;
        }
    }

    public void setScore(int score)
    {
        if(score < 0)
        {
            this.score = score;
        }
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    @Override
    public String toString()
    {
        return "Player{" +
                "hitPoints=" + hitPoints +
                ", score=" + score +
                ", userName='" + userName + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}
