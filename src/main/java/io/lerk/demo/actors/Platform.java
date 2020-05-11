package io.lerk.demo.actors;

import greenfoot.*;

public class Platform extends Actor
{
    public Platform()
    {
        this(200, 25);
    }
    public Platform(int width, int height)
    {
        GreenfootImage image = getImage();
        image.scale(width, height);
        setImage(image);
    }
    public void act()
    {

    }
}
