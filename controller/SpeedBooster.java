import greenfoot.*;

/**
 * Write a description of class SpeedBooster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SpeedBooster extends Actor
{
    public SpeedBooster(){
        GreenfootImage image=getImage();
        image.scale(50,50);  
    }
    
    public void act() 
    {
        this.removeTouching(SpeedBooster.class);
        moveDown();
        check();
    }
   
    public void moveDown()
    {
       if(((MyWorld) getWorld()).getState().toString() == "OnGoingGame")
       {         
             setLocation(getX(), getY()+5);
       }
    } 
    public void moveFaster()
    {
       if(((MyWorld) getWorld()).getState().toString() == "OnGoingGame")
       {
          setLocation(getX(), getY()+ 10);
       }
    }
    public void check()
    {
  
       // collided = getOneIntersectingObject(Coin.class);
        if (getY()>=(getWorld().getHeight()-1))
        {
           getWorld().removeObject(this);
        }
 
    }  
}
