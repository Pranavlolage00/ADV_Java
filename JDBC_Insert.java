import java.sql.*;
import java.util.*;
class Insert
{
    public static void main(String arg[])throws Exception
    {
        Scanner sc=new Scanner(System.in);
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        Connection con=DriverManager.getConnection("Jdbc:Odbc:CDJ");
        Statement st=con.createStatement();
        System.out.println("Enter Roll No:");
        int rno=sc.nextInt();
        System.out.println("Enter Student name:");
        String sname=sc.next();
        System.out.println("Enter Student percentage:");
        int per=sc.nextInt();
        int k=st.executeUpdate("insert into student values("+rno+",'"+sname+"',"+per+")");
        if(k>0)
           System.out.println("Record Insert successfully...");
        st.close();
        sc.close();
        con.close();
    }
}