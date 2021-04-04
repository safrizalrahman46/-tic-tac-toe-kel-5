import greenfoot.*; 
import java.awt.Graphics2D;
import java.awt.BasicStroke;

public class Kotak extends Actor
{
    public int ID=0,delta=200;
    
    public Kotak(int delta)
    {
        this.delta=delta;
    }
    public Kotak(int id,int delta)
    {
        ID=id;
        this.delta=delta;
    }
    public void addedToWorld(World world)
    {
        GreenfootImage image=new GreenfootImage(delta,delta);
        int d=30;
        if(ID==0){
        image.setColor(Color.RED);
        image.fillRect(0,(int)(0.5*(delta-d)),delta,d);
        image.fillRect((int)(0.5*(delta-d)),0,d,delta);
        setRotation(45);
        }else{
            Graphics2D g2=image.getAwtImage().createGraphics();
            g2.setStroke(new BasicStroke(d));
            g2.setColor(java.awt.Color.BLUE);
            g2.drawArc(d,d,image.getWidth()-2*d,image.getHeight()-2*d,0,360);
            g2.dispose();
        }
        setImage(image);
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
