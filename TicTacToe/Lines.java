import greenfoot.*; 

public class Lines extends Actor
{
    public void addedToWorld(World world)
    {
        int d=20;
        GreenfootImage image=new GreenfootImage(world.getWidth()-50,d);
        image.setColor(Color.BLACK);
        image.fill();
        setImage(image);
    }
    public void act() 
    {
        // Add your action code here.
    }    
}

