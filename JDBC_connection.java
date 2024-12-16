import java.sql.*;
class Jdbc
{
    public static void main(String arg[])throws Exception
    {
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        Connection con=DriverManager.getConnection("Jdbc:Odbc:CDJ");
        Statement st=con.createStatement();
        int k=st.executeUpdate("insert into student values(201,'ram',50.3)");
        if(k>=1)
            System.out.println("Record insert Successfully");

        st.close();
        con.close();
    }
}