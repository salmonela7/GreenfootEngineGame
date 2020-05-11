package io.lerk.demo.actors;

import greenfoot.*;

public class Scroller extends Actor
{
    private World world;
    private GreenfootImage scrollImage;
    private int scrolledX;
    private int wide, high;

    public Scroller(World viewWorld, GreenfootImage image, int wide, int high)
    {
        this.wide = wide;
        this.high = high;
        world = viewWorld;
        if (image != null)
        {
            scrollImage = new GreenfootImage(image);
            scroll(0);
        }
    }

    public void scroll(int dsx)
    {
        int maxX = wide-world.getWidth();
        if (scrolledX+dsx < 0) dsx = -scrolledX;
        if (scrolledX+dsx >= maxX) dsx = maxX-scrolledX;
        scrolledX += dsx;
        if (scrollImage != null)
        {
            world.getBackground().drawImage(scrollImage, -scrolledX*world.getCellSize(), 0);
        }
        for (Object obj : world.getObjects(null))
        {
            Actor actor = (Actor) obj;
            actor.setLocation(actor.getX()-dsx, actor.getY());
        }
    }
}
