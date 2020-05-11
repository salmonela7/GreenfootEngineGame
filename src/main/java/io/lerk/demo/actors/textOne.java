package io.lerk.demo.actors;

import greenfoot.*;

public class textOne extends Actor
{
    public void act()
    {
        getImage().scale(800, 50);
        if (getY() < 350)
        {
            setLocation(400, getY()+5);
        }
        setLocation(400, getY());
    }
}