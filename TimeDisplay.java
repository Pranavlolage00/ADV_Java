import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Date;

public class TimeDisplay extends Thread{
    JTextField jtf;
    TimeDisplay(JTextField tf){
        jtf=tf;
    }
    public void run(){
        while (true){
            try{
                Date d=new Date();
                int h=d.getHours();
                int m=d.getMinutes();
                int s=d.getSeconds();
                jtf.setText("Current Time:"+h+":"+m+":"+s);
                Thread.sleep(100);
            }catch(InterruptedException ie){}
        }
    }
}
    class window extends JFrame implements ActionListener{
        JTextField tf;
        JButton b1,b2;
        TimeDisplay tt;
        window(){
            setVisible(true);
            setLayout(new FlowLayout());
            setLocationRelativeTo(null);
            setSize(400,400);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            tf=new JTextField(30);
            b1=new JButton("Start");
            b2=new JButton("Stop");
            tt=new TimeDisplay(tf);
            
            add(tf);
            add(b1);
            add(b2);
            b2.setEnabled(false);

            b1.addActionListener(this);
            b2.addActionListener(this);
        }
    
        
        public void actionPerformed(ActionEvent e) {
           if(e.getSource()==b1){
                if(!tt.isAlive())
                {
                    tt.start();
                    b1.setEnabled(false);
                    b2.setEnabled(true);
                }
                else{
                    tt.resume();
                    b1.setEnabled(false);
                    b2.setEnabled(true);
                }
           }
           if(e.getSource()==b2){
            tt.suspend();
            b1.setEnabled(true);
            b2.setEnabled(false);
       }
    }
}
class timedemo{
    public static void main(String[] abc){
        window ob=new window();
    }
}