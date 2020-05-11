package io.lerk.demo.worlds;

import greenfoot.*;
import io.lerk.demo.actors.*;

public class Level3 extends World
{

    public static final int WIDE = 800;
    public static final int HIGH = 600;
    public int rate = 7;
    public int dsx;
    public int dsy = 0;
    public int charX;

    Scroller scroller;
    Adventurer character = new Adventurer();

    public Level3()
    {
        super(WIDE, HIGH, 1, false);
        GreenfootImage image = new GreenfootImage ("bgaa3.png");
        scroller = new Scroller (this, image, 2000, 600);
        CreateGround();
        character.getImage().scale(60,50);
        addObject(character, 150, 420);
        NextLevel newLevel = new NextLevel();
        addObject(newLevel, 1950, 430);

        Platform platform = new Platform();
        addObject(platform, 635, 380);
        Bat Enemy = new Bat();
        addObject(Enemy, 535, 350);

        Platform platform0 = new Platform();
        addObject(platform0, 935, 280);
        Bat Enemy0 = new Bat();
        addObject(Enemy0, 835, 250);

        Platform platform1 = new Platform();
        addObject(platform1, 1235, 380);
        Bat Enemy1 = new Bat();
        addObject(Enemy1, 1135, 350);

        Platform platform2 = new Platform();
        addObject(platform2, 1535, 280);
        Bat Enemy2 = new Bat();
        addObject(Enemy2, 1435, 250);

        Platform platform3 = new Platform(25, 205);
        addObject(platform3, 1635, 370);

        Platform platform4 = new Platform(25, 205);
        addObject(platform4, 1725, 370);
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
            platform.setImage("bluerock.jpg");
            dup += platform.getImage().getWidth();
            addObject(platform, -54+dup, 550);
        }
    }
}

