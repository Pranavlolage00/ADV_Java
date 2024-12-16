import java.util.*;
import java.sql.*;
class Demo
{
    public static void main (String arg[])throws Exception
    {
        Scanner sc=new Scanner(System.in);
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        Connection con=DriverManager.getConnection("Jdbc:Odbc:CDJ");
        Statement st=con.createStatement();
        System.out.println("Enter Studdent no to Search Record:");
        int sno=sc.nextInt();
        ResultSet rs=st.executeQuery("select * from student where sno="+sno);
        if(rs.next())  
        {
            System.out.println("Student Name="+rs.getString(2));
            System.out.println("Student Percentage="+rs.getString(3));
        }
        else
           System.out.println("Record not Found");

    st.close();
    sc.close();
    con.close();

                                 
    }
}