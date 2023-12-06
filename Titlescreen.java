import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Titlescreen extends World
{
    Label titleLabel = new Label("Hungry Seal Don't Touch the Bomb!", 40);
    Label instructions = new Label("Click to begin!", 60);
    
    /**
     * constructor for objects of class Titlescreen
     * creates titlelabel, instructions, prepare 
     **/
    public Titlescreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        addObject(titleLabel, getWidth()/2, getHeight()/2);
        addObject(instructions, 300, 280);
        prepare();
        
        Sfx sfx = new Sfx();
        addObject(sfx, 550, 350);
    }

    /**
     * the main world act loop
     * when the space or screen is pressed the next world will appear
     */
    public void act()
    {
        //start the game if user presses space bar
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
        
        if(Greenfoot.mouseClicked(null)) 
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Label label = new Label("Use keys A and D to move!", 40);
        addObject(label,300,240);
        Seal seal = new Seal();
        addObject(seal,491,82);
    }
}
