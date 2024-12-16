//Write a java program in multithreading to create 3 balls and bounce them vertically. 
import java.applet.*;
import java.util.*;
import java.awt.*;
public class Line extends Applet implements Runnable
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
                int x2=r1.nextInt(500);
                int y3=r1.nextInt(500);
                int y4=r1.nextInt(500);
                int y5=r1.nextInt(500);
                
                g.drawLine(100,y1,100,100); 
                g.drawLine(300,y2,100,100); 
                g.drawLine(500,y3,100,100); 
                g.drawLine(700,y4,100,100); 
                g.drawLine(900,y5,100,100); 
          }
}


/* <applet code=Line.class height='500' width='800'>
 </applet>*/