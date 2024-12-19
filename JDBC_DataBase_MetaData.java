import java.sql.*;
class Metadata
{
    public static void main(String arg[])throws Exception
    {
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        Connection con=DriverManager.getConnection("Jdbc:Odbc:CDJ");
        
        DatabaseMetaData dmd=con.getMetaData();
        System.out.println("DataBase Name="+dmd.getDatabaseProductName());
        System.out.println("DataBase Diver Name="+dmd.getDriverName());
        System.out.println("Database Version="+dmd.getDatabaseProductVersion());
        System.out.println("Databse UserName="+dmd.getUserName());
        System.out.println("DataBase Diver version="+dmd.getDriverVersion());
        

    }
}