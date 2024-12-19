import javax.swing.*;
class Demo extends JFrame
{
     JTable t1;
      Demo()
      {
           setVisible(true);
           setSize(500,500);
           setLayout(null);
           String data[][]={{"101","om","500"},
                          {"102","sai","500"},
                          {"103","ram","4500"}
                         };
           String cols[]={"eno","ename","sal"};
           t1=new JTable(data,cols);
           JScrollPane jsp=new JScrollPane(t1);
           t1.setBounds(100,100,200,200);
           add(t1);
           add(jsp);
      }
    public static void main(String arg[])
    {
        new Demo();
    }
}