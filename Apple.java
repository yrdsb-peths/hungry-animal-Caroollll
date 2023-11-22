import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Apple extends Actor
{
    public void act()
    {
        // Add your action code here.
        setLocation(getX(), getY() +2);
        
        //remove apple and draw game over when apple gets to the bottom
        MyWorld world = (MyWorld) getWorld();
        if(getY() >= world.getHeight())
        {
            world.gameOver();
            world.removeObject(this);
        }
    }
}
