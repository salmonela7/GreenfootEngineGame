package io.lerk.demo.actors;

import greenfoot.*;

public class Ground extends Actor
{
    public int width = getImage().getWidth();

    public void act()
    {
        TransformLocation();
    }
    public void TransformLocation()
    {
        if (getX() < -width/2 - width)
        {
            setLocation(getX() + 800 + width*2 + (width / 2), getY());
        }
        if (getX() > width/2 + 800 + width)
        {
            setLocation(getX() - 800 - width*2 - (width / 2), getY());
        }
    }
}
