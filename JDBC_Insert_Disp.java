import java.sql.*;
import java.util.*;
class Insert_Disp
{
   public static void main(String arg[])throws Exception
   {
      Scanner sc=new Scanner(System.in);
      Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
      Connection con=DriverManager.getConnection("Jdbc:Odbc:CDJ");

      PreparedStatement pst=con.prepareStatement("insert into emp values(?,?,?)");
      System.out.println("Enter Employee Number:");
      int eno=sc.nextInt();
      System.out.println("Enter Employee Name:");
      String ename=sc.next();
      System.out.println("Enter Employee salary:");
      int sal=sc.nextInt();

      pst.setInt(1,eno);
      pst.setString(2,ename);
      pst.setInt(3,sal);

      int k=pst.executeUpdate();
      if(k>0)
           System.out.println("Record Inserted..");
     
      Statement st=con.createStatement();
      ResultSet rs=st.executeQuery("select * from emp");
       while(rs.next())
       {
           System.out.println("Employee Number="+rs.getString(1));
           System.out.println("Employee Name="+rs.getString(2));
           System.out.println("Employee Salary="+rs.getString(3));
       }     
   }
}