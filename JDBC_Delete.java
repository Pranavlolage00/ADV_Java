import java.sql.*;
import java.util.*;
class Delete
{
    public static void main(String arg[])throws Exception
    {
        Scanner sc=new Scanner(System.in);
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        Connection con=DriverManager.getConnection("Jdbc:Odbc:CDJ");
        Statement st=con.createStatement();
        System.out.println("Enter Roll NO to Delete Record:");
        int no=sc.nextInt();
        int k=st.executeUpdate("delete from student where sno="+no);
        if(k>0)
            System.out.println("Record Delete Succesfully..");
        else
           System.out.println("Record Not Found...");
        
        st.close();
        sc.close();
        con.close();
    }
}