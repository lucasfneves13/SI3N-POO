import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cang here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cang extends Actor
{
    /**
     * Act - do whatever the Cang wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(3);
        
        if(Greenfoot.isKeyDown("left")){
            turn(-2);
        }
        else if(Greenfoot.isKeyDown("right")){
            turn(2);
        }
    }
}
