import greenfoot.*;

/**
 * Write a description of class OngoingGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OngoingGame extends GameState
{
     /**
     * Act - do whatever the OnGoingGame wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
   public void handle()
    {
        System.out.println("Player is in ongoing state");
        ((MyWorld)getWorld()).setState(this);
    }
    public String toString(){
       return "OnGoingGame";
    }
}
