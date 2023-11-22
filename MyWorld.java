import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class MyWorld extends World
{
    public int score = 0;
    Label scoreLabel;
    
    /**
     * constructor for objects of class MyWorld
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false);
        
        //create the seal object
        Seal seal = new Seal();
        addObject(seal, 300, 300);
        
        //create a label
        scoreLabel = new Label(0, 80);
        addObject(scoreLabel, 50, 50);
        
        createApple();
        
    }
    
    /**
     * end the game and draw "gameover"
     */
    public void gameOver()
    {
        Label gameOverLabel = new Label("Game Over", 100);
        addObject(gameOverLabel, 300, 200);
    }
    
    /**
     * increase score 
     */
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
    }
    
    /** 
    * create a new apple at random location at top of the screen
    */
    public void createApple()
    {
        Apple apple = new Apple();
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(apple, x, y);
    }
}
