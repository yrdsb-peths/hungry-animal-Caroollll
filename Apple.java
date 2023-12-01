import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Apple extends Actor
{
    int speed = 1;
    
    public void act()
    {
        // Add your action code here.
        int x = getX();
        int y = getY() + speed; 
        setLocation(x, y);
        
        //remove apple and draw game over when apple gets to the bottom
        MyWorld world = (MyWorld) getWorld();
        if(getY() >= world.getHeight())
        {
            world.gameOver();
            world.removeObject(this);
        }
    }
    
    public void setSpeed(int spd)
    {
        speed = spd;
    }
}
