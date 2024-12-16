// 5. Write a java program to display the characters from a given string into the TextField. 
// Each character should be displayed after 1 second.
import java.awt.*;
import java.awt.event.*;
class Demo extends Frame implements Runnable,ActionListener
{
    Thread th;
    TextField t1,t2;
    Label l1,l2;
    Button b1;

    Demo()
    {
        setVisible(true);
        setSize(500,500);
        setLayout(new FlowLayout());

        t1=new TextField(10);
        t2=new TextField(10);

        l1=new Label("Enter String:");
        l2=new Label("Result:");

        b1=new Button("submit");
        add(l1);add(t1);
        add(l2);add(t2);
        add(b1);
        b1.addActionListener(this);
    }
    public void run()
    {
        String s1=t1.getText();
        try{
              for(int i=0; i<s1.length(); i++)
              {
                 th.sleep(1000);
                 t2.setText(""+s1.charAt(i));
              }
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
        {
            th=new Thread(this);
            th.start();
        }
    }
}
class MDemo
{
    public static void main(String arg[])
    {
       Demo ob=new Demo();
    }
}