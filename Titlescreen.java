import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Titlescreen extends World
{
    Label titleLabel = new Label("Hungry Seal", 70);
    Label instructions = new Label("Press space to begin!", 60);
    public Titlescreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        addObject(titleLabel, getWidth()/2, getHeight()/2);
        addObject(instructions, 300, 250);
    }
    
    
    /**
     * the main world act loop
     */
    public void act()
    {
        //start the game if user presses space bar
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
}
