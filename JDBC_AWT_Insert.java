import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
class Demo extends Frame implements ActionListener
{
    TextField t1,t2,t3;
    Button b1,b2;
    Label l1,l2,l3;
    Connection con;
    Statement st;
    Demo()
    {
         try{
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
             con=DriverManager.getConnection("Jdbc:Odbc:CDJ");
             st=con.createStatement();
        }catch(Exception e){}
        setVisible(true);
        setSize(500,500);
        setLayout(new FlowLayout());

        t1=new TextField(10);
        t2=new TextField(10);
        t3=new TextField(10);
      //   t4=new TextField(10);
        
        l1=new Label("Enter Roll no:");
        l2=new Label("Enter Student Name:");
        l3=new Label("Enter Student per:");

        b1=new Button("Insert");
        b2=new Button("Exit");

        add(l1);add(t1);
        add(l2);add(t2);
        add(l3);add(t3);
      //   add(t4);add(l4);
        add(b1);add(b2);        
        b1.addActionListener(this);
        b2.addActionListener(this);
        
    }
   public void actionPerformed(ActionEvent ae)
   {
       if(ae.getSource()==b1)
       {
          try{
                int rno=Integer.parseInt(t1.getText());
                String sname=t2.getText();
                float per=Float.parseFloat(t3.getText());
                String sql="insert into student values("+rno+",'"+sname+"',"+per+")";
                int k=st.executeUpdate(sql);
              if(k>0)
                   JOptionPane.showMessageDialog(this,"Record Insert..");
              else
               JOptionPane.showMessageDialog(this,"Record Not Inserted.."); 
          }catch(Exception e){}
       }
       if(ae.getSource()==b2)
       {
           dispose();
       }
   }
}
class MDemo
{
    public static void main(String arg[])
   {
       new Demo();
   }
}