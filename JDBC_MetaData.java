import java.sql.*;
class MetaData
{
    public static void main(String arg[])throws Exception
    {
         Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
         Connection con=DriverManager.getConnection("Jdbc:Odbc:CDJ");
         Statement st=con.createStatement();
         ResultSet rs=st.executeQuery("select * from student");
         ResultSetMetaData rsm=rs.getMetaData();
         int n=rsm.getColumnCount();
         System.out.println("Number of Columns="+n);
         for(int i=1; i<=n; i++)
         {
            System.out.println("Column Name="+rsm.getColumnName(i));
            System.out.println("Column DataType="+rsm.getColumnTypeName(i));
            System.out.println("Column Size="+rsm.getColumnDisplaySize(i));
         }
         st.close();
         con.close();
    }
}