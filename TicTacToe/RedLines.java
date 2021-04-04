import greenfoot.*; 

public class RedLines extends Lines
{
     public void addedToWorld(World world)
    {
        int d=20;
        GreenfootImage image=new GreenfootImage(world.getWidth()-10,d);
        image.setColor(Color.GREEN);
        image.fill();
        setImage(image);
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
}
