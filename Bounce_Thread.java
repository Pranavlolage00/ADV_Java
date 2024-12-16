//Write a java program in multithreading to create 3 balls and bounce them vertically. 
import java.applet.*;
import java.util.*;
import java.awt.*;
public class Bounce extends Applet implements Runnable
{
    Thread th;
    public void init()
    {
        th=new Thread(this);
        th.start();
    }
    public void run()
    {
        while(true)
        {
            try{
                 th.sleep(1000);
                 repaint();
            }catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }
    public void paint(Graphics g)
          {
                Random r1=new Random();
                int y1=r1.nextInt(500);
                int y2=r1.nextInt(500);
                int y3=r1.nextInt(500);
                g.fillOval(100,y1,100,100); 
                g.fillOval(300,y2,100,100); 
                g.fillOval(500,y3,100,100); 
          }
}


/* <applet code=Bounce height='500' width='800'>
 </applet>*/