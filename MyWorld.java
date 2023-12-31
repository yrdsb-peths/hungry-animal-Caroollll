import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

public class MyWorld extends World
{
    public int score = 0;
    public Label scoreLabel;
    int level = 1;
    
    /**
     * constructor for objects of class MyWorld, creates seal, scorelabel, apple, bomb
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
        
        createBomb();
    }
    
    /**
     * end the game and draw "gameover"
     */
    public void gameOver()
    {
        //Label gameOverLabel = new Label("Game Over", 100);
        //addObject(gameOverLabel, 300, 200);
        World gameOver = new GameOver();
        Greenfoot.setWorld(gameOver);
    }
    
    /**
     * increase score 
     */
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
        
        if(score % 5 == 0)
        {
            level += 1;
        }
    }
    
    /** 
    * create a new apple at random location at top of the screen
    */
    public void createApple()
    {
        Apple apple = new Apple();
        apple.setSpeed(level);
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(apple, x, y);
    }
    
    /**
     * create a new bomb at random location at top of the screen
     */
    public void createBomb()
    {
        Bomb bomb = new Bomb();
        //bomb.setSpeed(level);
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(bomb, x, y);
        
    }
}
