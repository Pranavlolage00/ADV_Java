import java.util.*;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class Lamp extends Applet implements ActionListener
{
   Button b1;
   public void init()
   {
       b1=new Button("OK");
     add(b1); 
    b1.addActionListener(this);
   }
  public void actionPerformed(ActionEvent ae)
  {
     if(ae.getSource()==b1)
     {
       repaint();
     }
  }
   public void paint(Graphics g)
   {
     Random r1=new Random();
    int r=r1.nextInt(200);
    int g1=r1.nextInt(200);
    int b=r1.nextInt(200);
      Color c1=new Color(r,g1,b);
  g.setColor(c1);
  int x=r1.nextInt(500);
  int y=r1.nextInt(500);
     g.fillOval(x,y,100,100);
   }
}

/*
  <applet code="Lamp" width="500" height="500">
  </applet>
*/