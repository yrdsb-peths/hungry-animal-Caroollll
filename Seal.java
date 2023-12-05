import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Seal extends Actor
{
    GreenfootSound sealSound = new GreenfootSound("seal.mp3");
    GreenfootImage[] idleRight = new GreenfootImage[9];
    GreenfootImage[] idleLeft = new GreenfootImage[9];

    
    //direction the seal is facing
    String facing = "right";
    SimpleTimer animationTimer = new SimpleTimer();
    
    /**
     * mirroring the seal 
     */
    public Seal()
    {
        for(int i = 0; i < idleRight.length; i++)
        {
            idleRight[i] = new GreenfootImage("images/seal_idle/idle" + i + ".png");
            idleRight[i].scale(150, 150);
        }
        
        for(int i = 0; i <idleLeft.length; i++)
        {
            idleLeft[i] = new GreenfootImage("images/seal_idle/idle" + i + ".png");
            idleLeft[i].mirrorHorizontally();
            idleLeft[i].scale(150, 150);
        }
        
        animationTimer.mark();
        
        //initial seal image
        setImage(idleRight[0]);
    }
    /**
     * animate the seal
     */
    int imageIndex = 0;
    public void animateSeal()
    {
        if(animationTimer.millisElapsed() < 80)
        {
            return;
        }
        animationTimer.mark();
        
        if(facing.equals("right"))
        {
            setImage(idleRight[imageIndex]);
            imageIndex = (imageIndex + 1) % idleRight.length;
        }
        else 
        {
            setImage(idleLeft[imageIndex]);
            imageIndex = (imageIndex + 1) % idleLeft.length;
        }
    }
    
    /**
     * seal moves left or right when the keys a and d are pressed
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("a"))
        {
            move(-3);
            animateSeal();
            facing = "left";
        }
        if(Greenfoot.isKeyDown("d"))
        {
            move(3);
            animateSeal();
            facing = "right";
        }
        
        //remove apple if seal eats it
        eat();
        
        
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
