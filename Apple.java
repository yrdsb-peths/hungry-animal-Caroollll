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
        /**
         * remove apple and change world into game over when apple gets to the bottom
         */
        MyWorld world = (MyWorld) getWorld();
        if(getY() >= world.getHeight())
        {
            world.gameOver();
            world.removeObject(this);
        }
    }
    
    /**
     * sets apple speed
     */
    public void setSpeed(int spd)
    {
        speed = spd;
    }
}
