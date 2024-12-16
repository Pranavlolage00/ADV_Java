import java.sql.*;
class Demo
{
    public static void main(String arg[])throws Exception
    {
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        Connection con=DriverManager.getConnection("Jdbc:Odbc:CDJ");
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select Count(*) from student");
        if(rs.next())
        {
              System.out.println("Count Of Records="+rs.getString(1));
        }
        else
           System.out.println("Record not Found");
       st.close();
      con.close();
    }
 
}