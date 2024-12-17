import java.util.*;
import java.sql.*;
class Rset
{
    public static void main(String arg[])throws Exception
    {
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        Connection con=DriverManager.getConnection("Jdbc:Odbc:CDJ");
//        Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATEABLE);
       Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);


        ResultSet rs=st.executeQuery("select * from emp;");

        if(rs.last())
        {
              System.out.println("Employee Number="+rs.getString(1));
              System.out.println("Employee Name="+rs.getString(2));
              System.out.println("Employee salary="+rs.getString(3));
        }
        if(rs.previous())
        {
              System.out.println("Employee Number="+rs.getString(1));
              System.out.println("Employee Name="+rs.getString(2));
              System.out.println("Employee salary="+rs.getString(3));
        }   
    }
    
}