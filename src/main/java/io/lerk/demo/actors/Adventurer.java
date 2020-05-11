package io.lerk.demo.actors;

import greenfoot.*;

public class Adventurer extends Actor
{
    private GreenfootImage run0 =new GreenfootImage("adventurer-run-00.png");
    private GreenfootImage run1 =new GreenfootImage("adventurer-run-01.png");
    private GreenfootImage run2 =new GreenfootImage("adventurer-run-02.png");
    private GreenfootImage run3 =new GreenfootImage("adventurer-run-03.png");
    private GreenfootImage run4 =new GreenfootImage("adventurer-run-04.png");
    private GreenfootImage run5 =new GreenfootImage("adventurer-run-05.png");
    private GreenfootImage run0l =new GreenfootImage("adventurer-run-00-ConvertImage.png");
    private GreenfootImage run1l =new GreenfootImage("adventurer-run-01-ConvertImage.png");
    private GreenfootImage run2l =new GreenfootImage("adventurer-run-02-ConvertImage.png");
    private GreenfootImage run3l =new GreenfootImage("adventurer-run-03-ConvertImage.png");
    private GreenfootImage run4l =new GreenfootImage("adventurer-run-04-ConvertImage.png");
    private GreenfootImage run5l =new GreenfootImage("adventurer-run-05-ConvertImage.png");
    private GreenfootImage idle =new GreenfootImage("adventurer-idle-03.png");
    private int frame = 1;
    private int lframe = 1;
    private int animationCounter1 = 0;
    private int animationCounter2 = 0;
    private int SPEED = 0;
    private int GRAVITY = 1;
    public int movSpeed = 7;
    private int jumpHeight = -18;
    public boolean keyDown = true;
    public static boolean done = true;

    public void act()
    {
        String key = Greenfoot.getKey();
        if (Greenfoot.isKeyDown("d") && getX() < 800 && canMoveRight() == true)
        {
            if((animationCounter1 % 6 == 0))
                AnimateRight();
            setLocation(getX()+movSpeed, getY());
        }
        else if (Greenfoot.isKeyDown("a") && getX() > 0 && canMoveLeft() == true)
        {
            if((animationCounter2 % 6 == 0))
                AnimateLeft();
            setLocation(getX()-movSpeed, getY());
        }
        else if (key == null)
        {
            idle.scale(60,50);
            setImage(idle);
            frame = 1;
        }
        animationCounter1++;
        animationCounter2++;
        fall();
        jump();
        shoot();
    }

    public void jump()
    {
        if (Greenfoot.isKeyDown("space") && (onGround() == true || onPlatform() == true))
        {
            /*if (belowPlatform() == true)
            {
                SPEED = 0;
                fall();
            }*/
            SPEED = jumpHeight;
            fall();
        }
    }

    public void fall()
    {
        setLocation(getX(), getY() + SPEED);
        if (onGround() || onPlatform())
        {
            SPEED = 0;
            while (onGround() || onPlatform())
            {
                setLocation(getX(), getY()-1);
            }
            setLocation(getX(), getY()+1);
        }
        else if (SPEED < 0 && belowPlatform()) SPEED = 0;
        else SPEED = SPEED + GRAVITY;
    }

    boolean onGround()
    {
        Actor under = getOneObjectAtOffset(0, getImage().getHeight()/2, Ground.class);
        return under!=null;
    }

    boolean onPlatform()
    {
        Actor under = getOneObjectAtOffset(0, getImage().getHeight()/2, Platform.class);
        return under!=null;
    }
    boolean belowPlatform()
    {
        Actor under = getOneObjectAtOffset(0, getImage().getHeight()/-2, Platform.class);
        return under!=null;
    }
    boolean canMoveLeft()
    {
        boolean canMoveLeft = true;
        if (getOneObjectAtOffset(getImage().getWidth()/-2, 0, Platform.class) != null)
        {
            canMoveLeft = false;
        }
        return canMoveLeft;
    }

    boolean canMoveRight()
    {
        boolean canMoveRight = true;
        if (getOneObjectAtOffset(getImage().getWidth()/2, 0, Platform.class) != null)
        {
            canMoveRight = false;
        }
        return canMoveRight;
    }

    public void AnimateRight()
    {
        if (frame == 1)
        {
            run0.scale(60,50);
            setImage(run0);
        }
        else if (frame == 2)
        {
            run1.scale(60,50);
            setImage(run1);
        }
        else if (frame == 3)
        {
            run2.scale(60,50);
            setImage(run2);
        }
        else if (frame == 4)
        {
            run3.scale(60,50);
            setImage(run3);
        }
        else if (frame == 5)
        {
            run4.scale(60,50);
            setImage(run4);
        }
        else if (frame == 6)
        {
            run5.scale(60,50);
            setImage(run5);
            frame = 1;
        }
        frame ++;
    }

    public void AnimateLeft()
    {
        if (lframe == 1)
        {
            run0l.scale(60,50);
            setImage(run0l);
        }
        else if (lframe == 2)
        {
            run1l.scale(60,50);
            setImage(run1l);
        }
        else if (lframe == 3)
        {
            run2l.scale(60,50);
            setImage(run2l);
        }
        else if (lframe == 4)
        {
            run3l.scale(60,50);
            setImage(run3l);
        }
        else if (lframe == 5)
        {
            run4l.scale(60,50);
            setImage(run4l);
        }
        else if (lframe == 6)
        {
            run5l.scale(60,50);
            setImage(run5l);
            lframe = 1;
        }
        lframe ++;
    }
    public void shoot()
    {
        if (!keyDown && Greenfoot.isKeyDown("f"))
        {
            keyDown = true;
            Bullet bul = new Bullet();
            bul.getImage().scale(10, 5);
            if (Greenfoot.isKeyDown("a"))
            {
                bul.setRotation(-180);
            }
            getWorld().addObject(bul, getX(), getY());
        }
        if (keyDown && !Greenfoot.isKeyDown("f"))
        {
            keyDown = false;
        }
    }
}
