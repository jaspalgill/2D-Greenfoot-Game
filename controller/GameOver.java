import greenfoot.*;

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends GameState
{
     /**
     * Act - do whatever the GameOverState wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }
    public void handle()
    {
        System.out.println("Player is in pause state");
         ((MyWorld)getWorld()).setState(this);
    }
    public String toString()
    {
        return "GameOverState";
    }
}
