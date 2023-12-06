import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends World
{

    /**
     * Constructor for objects of class GameOver.
     * 
     */
    public GameOver()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        Label gameOver = new Label("Game Over", 100);
        addObject(gameOver, getWidth()/2, getHeight()/2);
        
        Label restart = new Label("Click to restart", 60);
        addObject(restart, getWidth()/2, 250);
        
        /**Label score = new Label("Final score: ", 80);
        addObject(score, getWidth()/2, 300);
        addObject(scoreLabel, 400, 300); **/
        
    }
    
    public void act() {
        if(Greenfoot.mouseClicked(null)){
            Greenfoot.setWorld(new Titlescreen());
        }
    }
}
