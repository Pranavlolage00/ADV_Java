import java.sql.*;
class Demo
{
    public static void main(String arg[])throws Exception
    {
          Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
          Connection con=DriverManager.getConnection("Jdbc:Odbc:CDJ");
          Statement st=con.createStatement();
          ResultSet rs=st.executeQuery("select * from student");
          while(rs.next())
          {
            System.out.println("Student No="+rs.getInt(1));
            System.out.println("Student Name="+rs.getString(2));
            System.out.println("Student Percentage="+rs.getInt(3));
          }
        st.close();
        con.close();
    }
}