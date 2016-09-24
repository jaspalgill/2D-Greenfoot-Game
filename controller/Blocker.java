import greenfoot.*;  
import java.util.*;

/**
 * Write a description of class Vehicle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Blocker extends Component
{
    private GreenfootImage image1;
    private GreenfootImage image2;
    private GreenfootImage image3;
    private GreenfootImage image4;
    private Actor collided;
    private boolean collision;
    private Actor collidedVehicle;
    private boolean moveFasterFlag = false;
    
    public Blocker()
    {
       
       image1 = new GreenfootImage("police.png");
       image2 = new GreenfootImage("barrier1.png");
       image1.scale(150,150);  
       image2.scale(100,100);  
       randomImage();
     //  setRotation(90);
    }
    /**
     * Act - do whatever the Vehicle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        this.removeTouching(SpeedBooster.class);
        this.removeTouching(Blocker.class);
        if(moveFasterFlag)
            moveFaster();
        else
            moveDown();
        check();
    }
    public void moveDown()
    {
        if(((MyWorld) getWorld()).getState().toString() == "OnGoingGame")
       {
         
             setLocation(getX(), getY()+4);
 
       }
    }
    
     public void moveFaster()
    {
       if(((MyWorld) getWorld()).getState().toString() == "OnGoingGame")
       {
          setLocation(getX(), getY()+8);
       }
    }
    
    public void randomImage()
    {
       if (Greenfoot.getRandomNumber(5)<2)
       {
          setImage(image1);
       }
       
       else
       {
          setImage(image2);
       }
    }
    public void check()
    {
        
    // collided = getOneIntersectingObject(Vehicle.class);
        if (collided != null || getY()>=(getWorld().getHeight()-1))
        {
           getWorld().removeObject(this);
          
        }
        
    }
    
    public void setFasterFlag(){
        moveFasterFlag = true;
    }
    
    public void addChild(Component c) {}
    public void removeChild(Component c) {}
    public Component getChild(int i) {
        return null;
    }
    public List<Component> getAllChild(){
        return null;
    }
    public void unsetFasterFlag() {
        moveFasterFlag = false;
    }
    public void addCoinScore() {}
}
