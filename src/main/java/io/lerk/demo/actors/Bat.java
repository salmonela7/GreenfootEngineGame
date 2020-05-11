package io.lerk.demo.actors;

import greenfoot.*;

public class Bat extends Actor
{
    private GreenfootImage bat1i =new GreenfootImage("0.png");
    private GreenfootImage bat2i =new GreenfootImage("1.png");
    private GreenfootImage bat3i =new GreenfootImage("2.png");
    private GreenfootImage bat1l =new GreenfootImage("3.png");
    private GreenfootImage bat2l =new GreenfootImage("4.png");
    private GreenfootImage bat3l =new GreenfootImage("5.png");
    private GreenfootImage bat1r =new GreenfootImage("6.png");
    private GreenfootImage bat2r =new GreenfootImage("7.png");
    private GreenfootImage bat3r =new GreenfootImage("8.png");
    private int frame = 1;
    private int lframe = 1;
    private int rframe = 1;
    private int animationCounter1 = 0;
    private int animationCounter2 = 0;
    private int animationCounter3 = 0;
    private boolean allowRight = true;
    private boolean allowLeft =  false;
    private int counter = 200;
    public void act()
    {
        if (getX() > 0 && getX() < 800)
        {
            goRight();
            goLeft();
        }
    }
    public void goRight()
    {
        if (allowRight == true)
        {
            if(counter > 0)
            {
                move(1);
                counter -= 1;
                if(animationCounter1 % 8 == 0)
                {
                    AnimateRight();
                }
                animationCounter1++;
            }
            else
            {
                allowRight = false;
                allowLeft = true;
            }
        }
    }
    public void goLeft()
    {
        if (allowLeft == true)
        {
            if (counter < 200)
            {
                move(-1);
                counter += 1;
                if(animationCounter2 % 8 == 0)
                {
                    AnimateLeft();
                }
                animationCounter2++;
            }
            else
            {
                allowRight = true;
                allowLeft = false;
            }
        }
    }
    public void AnimateIdle()
    {
        if (frame == 1)
        {
            setImage(bat1i);
        }
        else if (frame == 2)
        {
            setImage(bat2i);
        }
        else if (frame == 3)
        {
            setImage(bat3i);
            frame = 1;
        }
        frame++;
    }
    public void AnimateLeft()
    {
        if (lframe == 1)
        {
            setImage(bat1l);
        }
        else if (lframe == 2)
        {
            setImage(bat2l);
        }
        else if (lframe == 3)
        {
            setImage(bat3l);
            lframe = 1;
        }
        lframe++;
    }

    public void AnimateRight()
    {
        if (rframe == 1)
        {
            setImage(bat1r);
        }
        else if (rframe == 2)
        {
            setImage(bat2r);
        }
        else if (rframe == 3)
        {
            setImage(bat3r);
            rframe = 1;
        }
        rframe++;
    }
}
