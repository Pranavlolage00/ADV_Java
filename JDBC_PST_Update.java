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

        System.out.println("Enter eno to update the record");
        int eno=sc.nextInt();
        System.out.println("Enter new Employee Name:");
        String ename=sc.next();

        pst.setInt(2,eno);
        pst.setString(1,ename);

        int k=pst.executeUpdate();
        if(k>0)
              System.out.println("Update Record Sucessfully..");

    }
}