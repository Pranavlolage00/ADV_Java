import java.sql.*;
import java.util.*;
class Insert
{
    public static void main(String arg[])throws Exception
    {
        Scanner sc=new Scanner(System.in);
         Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
         Connection con=DriverManager.getConnection("Jdbc:Odbc:CDJ");
         PreparedStatement pst=con.prepareStatement("insert into emp values(?,?,?)");
         System.out.println("Enter How many Record Insert in table");
         int n=sc.nextInt();
         for(int i=1; i<=n; i++)
         {
             System.out.println("Enter Employee Number:");
             int eno=sc.nextInt();
             System.out.println("Enter Employee name:");
             String ename=sc.next();
             System.out.println("Enter Salary:");
             int sal=sc.nextInt();

             pst.setInt(1,eno);
             pst.setString(2,ename);
             pst.setInt(3,sal);

           int k=pst.executeUpdate();
           if(k>0)
               System.out.println("Record Inserted");
         }
    
    }
}