import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class Nature here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Background  extends Component
{
    private Actor collided;
    private GreenfootImage image1;
    private GreenfootImage image2;
    private GreenfootImage image3;
    private GreenfootImage image4;
    private GreenfootImage image5;
    private GreenfootImage image6;
    private int collidedOn;
    private boolean moveFasterFlag = false;
     
    public Background()
    {
       collidedOn = 0;
       GreenfootImage image=getImage();
     //  image.scale(550,600);  
       image.scale(200,50);  
       setImage(image);
       setRotation(90);

     //  randomImage();
       //collided = getOneIntersectingObject(Background.class);
       //if (collided != null)
       //{
       //   collidedOn = 1;
       //}
    }
     /**
     * Act - do whatever the House4 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(moveFasterFlag){
            moveFaster();
        }
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
          setLocation(getX(), getY()+ 8);
       }
    }
    
    public void randomImage()
    {
      
          setImage(image1);
       
    }
     public void check()
    {
        if (getY()>=(getWorld().getHeight()-1))
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
