import java.util.*;
import java.sql.*;
class Upadte
{
   public static void main(String arg[])throws Exception
   {
        Scanner sc=new Scanner(System.in);
    
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        Connection con=DriverManager.getConnection("Jdbc:Odbc:CDJ");
        Statement st=con.createStatement();

        System.out.println("Enter Student Roll no to upadte Record:");
        int rno=sc.nextInt();
        System.out.println("Enter Student new Name:");
        String sname=sc.next();
        System.out.println("Enter Student new Percentage:");
        int per=sc.nextInt();
        int k=st.executeUpdate("UPDATE student SET sname = '"+sname+"', per = "+per+" WHERE sno="+rno);
        if(k>0)
            System.out.println("Update Record Successfully...");
        else
            System.out.println("Record Not Found...");
        
        st.close();
        con.close();
        sc.close();       
   }
}