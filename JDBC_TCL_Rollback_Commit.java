import java.util.*;
import java.sql.*;
class Tcl
{
    public static void main(String arg[])throws Exception
    {
         Scanner sc=new Scanner(System.in);
         Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
         Connection con=DriverManager.getConnection("Jdbc:Odbc:CDJ");
         con.setAutoCommit(false);

         PreparedStatement pst=con.prepareStatement("delete from emp where eno=?");

         System.out.println("Enter Emp Number To delete Record:");
         int eno=sc.nextInt();

         pst.setInt(1,eno);
         int k=pst.executeUpdate();
         System.out.println("Are You sure Y Or N");
         String ans=sc.next();
         if(ans.equals("Y"))
         {
              con.commit();
              if(k>0)
                   System.out.println("Reord Deleted...");
         }
         else
         {
              con.rollback();
              System.out.println("Reord Rollbacked......");
         }
    }
}