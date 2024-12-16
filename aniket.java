import java.sql.*;
class InsertDemo
{
   public static void main(String arg[])throws Exception
   {
     Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
     Connection con=DriverManager.getConnection("Jdbc:Odbc:CDJ");
     Statement st=con.createStatement();
     int k=st.executeUpdate("insert into student values(1,'om',66)");
     if(k>=1)
        System.out.println("Record Inserted.........");
     st.close();
     con.close();
   }
}