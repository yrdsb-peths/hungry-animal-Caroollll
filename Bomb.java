import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Bomb extends Actor
{
    /**
     * create the bomb and upload the image and sized accordingly 
     */
    public Bomb()
    {
        GreenfootImage bomb = new GreenfootImage("images/bomb.png");
        bomb.scale(150,150);
    }
    
    /** 
     * if bomb is touching seal then the game will be over 
     */
    public void act()
    {
        int x = getX();
        int y = getY() + 2; 
        setLocation(x, y);
        
        MyWorld world = (MyWorld) getWorld();
        if(isTouching(Seal.class))
        {
            //MyWorld world = (MyWorld) getWorld();
            world.gameOver();
        }
    }
}
