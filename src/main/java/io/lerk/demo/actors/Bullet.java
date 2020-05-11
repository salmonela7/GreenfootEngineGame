package io.lerk.demo.actors;

import greenfoot.*;

public class Bullet extends Adventurer
{

    private int x;
    private int y;
    public int time = -20;
    public int speed;
    public void act()
    {
        move (20);
        String key = Greenfoot.getKey();
        if (canSee(Bat.class))
        {
            eat(Bat.class);
            getWorld().removeObject(this);
            return;
        }
    }

    public boolean canSee(Class clss)
    {
        return getOneObjectAtOffset(0, 0, clss) != null;
    }
    public void eat(Class clss)
    {
        Actor actor = getOneObjectAtOffset(0, 0, clss);
        if(actor != null) {
            getWorld().removeObject(actor);
        }
    }
}

