import java.sql.*;
class Pstatement
{
    public static void main(String arg[])throws Exception
    {
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        Connection con=DriverManager.getConnection("Jdbc:Odbc:CDJ");
        PreparedStatement pst=con.prepareStatement("insert into emp values(?,?,?)");

        pst.setInt(1,504);
        pst.setString(2,"ram");
        pst.setInt(3,50000);

        int k=pst.executeUpdate();
        System.out.println("Record Inserted.."+k);
    }
}