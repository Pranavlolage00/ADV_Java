import java.sql.*;
import java.util.*;
class AddColumn
{
    public static void main(String arg[])throws Exception
    {
        Scanner sc=new Scanner(System.in);
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        Connection con=DriverManager.getConnection("Jdbc:Odbc:CDJ");
        Statement st=con.createStatement();
        System.out.println("Enter table Name:");
        String tbl=sc.next();
        System.out.println("Enter new Column Name & datatype:");
        String col=sc.next();
        String dt=sc.next();
        String sql="Alter table "+tbl+" add column "+col+" "+dt+"";
          int k=st.executeUpdate(sql);

        // if(k>0)
        //      System.out.println("Table is altered....");
        // else
            System.out.println(" Table is Updated...."+k);
    }
}