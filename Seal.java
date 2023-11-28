import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Seal extends Actor
{
    GreenfootSound sealSound = new GreenfootSound("seal.mp3");
    GreenfootImage[] idle = new GreenfootImage[8];
    /**
     * constructor
     */
    public Seal()
    {
        for(int i = 0; i < idle.length; i++)
        {
            idle[i] = new GreenfootImage("images/seal_idle/idle" + i + ".png");
        }
        setImage(idle[0]);
    }
    /**
     * animate the seal
     */
    int imageIndex = 0;
    public void animateSeal()
    {
        setImage(idle[imageIndex]);
        imageIndex = (imageIndex + 1) % idle.length;
    }
    
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
        
        //remove apple if seal eats it
        eat();
        
        //animate the seal
        animateSeal();
    }
    
    /**
     * eat the apple and spwan new apple
     */
    public void eat()
    {
        if(isTouching(Apple.class))
        {
            removeTouching(Apple.class);
            MyWorld world = (MyWorld) getWorld();
            world.createApple();
            world.increaseScore();
            sealSound.play();
        }
    }
}
