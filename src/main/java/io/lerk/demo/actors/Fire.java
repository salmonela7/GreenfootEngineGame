package io.lerk.demo.actors;

import greenfoot.*;

public class Fire extends Actor
{
    private GreenfootImage fire1 =new GreenfootImage("fire1.png");
    private GreenfootImage fire2 =new GreenfootImage("fire2.png");
    private GreenfootImage fire3 =new GreenfootImage("fire3.png");
    private GreenfootImage fire4 =new GreenfootImage("fire4.png");
    private GreenfootImage fire5 =new GreenfootImage("fire5.png");
    private GreenfootImage fire6 =new GreenfootImage("fire6.png");
    private GreenfootImage fire7 =new GreenfootImage("fire7.png");
    private GreenfootImage fire8 =new GreenfootImage("fire8.png");
    private GreenfootImage fire9 =new GreenfootImage("fire9.png");
    private GreenfootImage fire10 =new GreenfootImage("fire10.png");
    private GreenfootImage fire11 =new GreenfootImage("fire11.png");
    private GreenfootImage fire12 =new GreenfootImage("fire12.png");
    private GreenfootImage fire13 =new GreenfootImage("fire13.png");
    private GreenfootImage fire14 =new GreenfootImage("fire14.png");
    private GreenfootImage fire15 =new GreenfootImage("fire15.png");
    private GreenfootImage fire16 =new GreenfootImage("fire16.png");
    private int frame = 1;
    private int Counter = 0;

    public void act()
    {
        if (getX()>0 && getX()<800)
        {
            if (Counter % 4 == 0)
            {
                Animate();
            }
            Counter++;
        }
    }
    public void Animate()
    {
        if (frame == 1)
        {
            fire1.scale(60,70);
            setImage(fire1);
        }
        else if (frame == 2)
        {
            fire2.scale(60,70);
            setImage(fire2);
        }
        else if (frame == 3)
        {
            fire3.scale(60,70);
            setImage(fire3);
        }
        else if (frame == 4)
        {
            fire4.scale(60,70);
            setImage(fire4);
        }
        else if (frame == 5)
        {
            fire5.scale(60,70);
            setImage(fire5);
        }
        else if (frame == 6)
        {
            fire6.scale(60,70);
            setImage(fire6);
        }
        else if (frame == 7)
        {
            fire7.scale(60,70);
            setImage(fire7);
        }
        else if (frame == 8)
        {
            fire8.scale(60,70);
            setImage(fire8);
        }
        else if (frame == 9)
        {
            fire9.scale(60,70);
            setImage(fire9);
        }
        else if (frame == 10)
        {
            fire10.scale(60,70);
            setImage(fire10);
        }
        else if (frame == 11)
        {
            fire11.scale(60,70);
            setImage(fire11);
        }
        else if (frame == 12)
        {
            fire12.scale(60,70);
            setImage(fire12);
        }
        else if (frame == 13)
        {
            fire13.scale(60,70);
            setImage(fire13);
        }
        else if (frame == 14)
        {
            fire14.scale(60,70);
            setImage(fire14);
        }
        else if (frame == 15)
        {
            fire15.scale(60,70);
            setImage(fire15);
        }
        else if (frame == 16)
        {
            fire16.scale(60,70);
            setImage(fire16);
            frame = 1;
        }
        frame ++;
    }

}