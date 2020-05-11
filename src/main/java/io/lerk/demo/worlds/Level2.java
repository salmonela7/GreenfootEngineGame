package io.lerk.demo.worlds;

import greenfoot.*;
import io.lerk.demo.actors.*;

public class Level2 extends World
{

    public static final int WIDE = 800;
    public static final int HIGH = 600;
    public int rate = 7;
    public int dsx;
    public int dsy = 0;
    public int charX;

    Scroller scroller;
    Adventurer character = new Adventurer();

    public Level2()
    {
        super(WIDE, HIGH, 1, false);
        GreenfootImage image = new GreenfootImage ("bgaa2.png");
        scroller = new Scroller (this, image, 2000, 600);
        CreateGround();
        character.getImage().scale(60,50);
        addObject(character, 150, 420);
        NextLevel newLevel1 = new NextLevel();
        addObject(newLevel1, 1950, 450);

        Platform platform = new Platform();
        addObject(platform, 635, 380);
        Bat Enemy0 = new Bat();
        addObject(Enemy0, 535, 350);

        Platform platform0 = new Platform();
        addObject(platform0, 935, 380);
        Bat Enemy1 = new Bat();
        addObject(Enemy1, 835, 350);

        Platform platform1 = new Platform(25, 100);
        addObject(platform1, 785, 430);

        Platform platform2 = new Platform();
        addObject(platform2, 785, 250);
        Bat Enemy2 = new Bat();
        addObject(Enemy2, 685, 220);

        Platform platform3 = new Platform();
        addObject(platform3, 1185, 250);

        Platform platform4 = new Platform();
        addObject(platform4, 1585, 250);
        Bat Enemy3 = new Bat();
        addObject(Enemy3, 1485, 220);

        Platform platform5 = new Platform();
        addObject(platform5, 1435, 380);
        Bat Enemy4 = new Bat();
        addObject(Enemy4, 1335, 350);

        Platform platform6 = new Platform();
        addObject(platform6, 1735, 380);
        Bat Enemy5 = new Bat();
        addObject(Enemy5, 1635, 350);

        Platform platform7 = new Platform(25, 100);
        addObject(platform7, 1585, 430);
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
            platform.setImage("granite-light.jpg");
            dup += platform.getImage().getWidth();
            addObject(platform, -54+dup, 550);
        }
    }
}
