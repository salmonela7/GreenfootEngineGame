package io.lerk.demo.worlds;

import greenfoot.*;
import io.lerk.demo.actors.*;

public class KeyScrollWorld extends World
{

    public static final int WIDE = 800;
    public static final int HIGH = 600;
    public int rate = 7;
    public int dsx;
    public int dsy = 0;
    public int charX;

    Scroller scroller;
    Adventurer character = new Adventurer();

    public KeyScrollWorld()
    {
        super(WIDE, HIGH, 1, false);
        GreenfootImage image = new GreenfootImage ("bgaa.png");
        scroller = new Scroller (this, image, 2000, 600);
        CreateGround();
        character.getImage().scale(60,50);
        addObject(character, 150, 420);
        NextLevel newLevel = new NextLevel();
        addObject(newLevel, 1950, 450);

        Platform platform = new Platform();
        addObject(platform, 635, 420);
        Bat Enemy = new Bat();
        addObject(Enemy, 535, 390);

        Platform platform0 = new Platform();
        addObject(platform0, 970, 350);
        Bat Enemy0 = new Bat();
        addObject(Enemy0, 870, 320);

        Platform platform1 = new Platform(400, 25);
        addObject(platform1, 1435, 280);
        Bat Enemy1 = new Bat();
        addObject(Enemy1, 1335, 250);

        Platform platform2 = new Platform(25, 230);
        addObject(platform2, 1635, 384);
    }

    public void act ()
    {
        scroll();
    }

    public void scroll()
    {
        dsx = 0;
        charX = character.getX();
        if (Greenfoot.isKeyDown("d") && charX > 250) dsx++;
        if (Greenfoot.isKeyDown("a") && charX < 200) dsx--;
        scroller.scroll(dsx*character.movSpeed);
    }

    public void CreateGround()
    {
        int dup = 0;
        for(int i = 0; i<13; i++)
        {
            Ground platform = new Ground();
            dup += platform.getImage().getWidth();
            addObject(platform, -54+dup, 550);
        }
    }
}
