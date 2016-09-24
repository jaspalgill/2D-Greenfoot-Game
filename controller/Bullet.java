import greenfoot.*;
import java.util.*;

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Ammunition
{
   private GreenfootImage image1;
    private GreenfootImage image2;
    private Actor collidedVehicle;
    private ConcreteSubject subject;

    public Bullet()
    {
        GreenfootImage image=getImage();
        image.scale(20,40);
       image1 = new GreenfootImage("explosion.png");
       image2 = new GreenfootImage("explosion-big.png");
    }
   
    public void act() 
    {
       moveUp();
       check();
    }    
    public void moveUp()
    {
       if(((MyWorld) getWorld()).getState().toString() == "OnGoingGame")
       {
          setLocation(getX(), getY()-4);
       }
    }
    public void check()
    {
       collidedVehicle = getOneIntersectingObject(Blocker.class);
  
       if(collidedVehicle != null || getY() == 0)
       {
          Greenfoot.playSound("Explosion.wav");
          if(collidedVehicle != null)
          {
            ArrayList<ConcreteSubject> listOfSubs = (ArrayList<ConcreteSubject>)(((MyWorld)getWorld()).getObjects(ConcreteSubject.class));
               if(listOfSubs.size()>0){
                   subject = listOfSubs.get(0);
                   subject.setScore(50);
                }
            // ((CarWorld) getWorld()).addScore(50);
             getWorld().removeObject(collidedVehicle);
          }
        
            getWorld().removeObject(this);
       }
    }
}
