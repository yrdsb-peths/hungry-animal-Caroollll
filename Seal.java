import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Seal extends Actor
{
    public void act()
    {
        if(Greenfoot.isKeyDown("a"))
        {
            move(-2);
        }
        if(Greenfoot.isKeyDown("d"))
        {
            move(2);
        }
        
        removeTouching(Apple.class);
    }
}
