import java.util .*;
import java.sql.*;
class Update
{
    public static void main(String arg[])throws Exception
    {
        Scanner sc=new Scanner(System.in);
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        Connection con=DriverManager.getConnection("Jdbc:Odbc:CDJ");
        PreparedStatement pst=con.prepareStatement("UPDATE emp set ename=? where eno=?");

        System.out.println("Enter eno to delete the record");
        int eno=sc.nextInt();

        pst.setInt(1,eno);

        int k=pst.executeUpdate();
        if(k>0)
              System.out.println("Update Record Sucessfully..");

    }
}