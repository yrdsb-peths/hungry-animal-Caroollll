import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Bomb extends Actor
{
    /**
     * Act - do whatever the Bomb wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Bomb()
    {
        GreenfootImage bomb = new GreenfootImage("images/bomb.png");
        bomb.scale(150,150);
    }
    
    public void act()
    {
        int x = getX();
        int y = getY() + 1; 
        setLocation(x, y);
        
        /** if(getY() >= world.getHeight())
        {
            Bomb bomb = new Bomb();
            addObject(bomb, x, y);
        }  **/
        
        
        if(isTouching(Seal.class))
        {
            MyWorld world = (MyWorld) getWorld();
            world.gameOver();
        }
    }
}
