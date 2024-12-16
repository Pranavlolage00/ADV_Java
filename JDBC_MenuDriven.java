import java.sql.*;
import java.util.*;
// create table and perform following operations
// 1-Insert 2-Modify 3-Delete 4-Search 5-viewAll 6 exit
class Menu
{
    public static void main(String arg[])throws Exception
    {
        Scanner sc=new Scanner(System.in);
         Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
         Connection con=DriverManager.getConnection("Jdbc:Odbc:CDJ");
         Statement st=con.createStatement();
         ResultSet rs;
         String sql=""; int k=0;
         int ch=0;
         do{
              System.out.println("1-Insert \n 2-Modify \n 3-Delete \n 4-Search \n 5-viewAll \n 6 exit");
              System.out.println("Enter Choice:");
              ch=sc.nextInt();
              switch(ch)
              {
                  case 1:System.out.println("Enter Employee Number:");
                         int eno2=sc.nextInt();
                         System.out.println("enter Employee Name:");
                         String ename=sc.next();
                         System.out.println("Enter Employee Salary:");
                         int sal=sc.nextInt();
                          sql="insert into emp values("+eno2+",'"+ename+"',"+sal+")";
                          k=st.executeUpdate(sql);
                         if(k>0)
                             System.out.println("Record Insert...");
                        break;

                  case 2:System.out.println("Enter ColumnName to Drop:");
                         String cname=sc.next();
                          sql="ALTER table emp DROP column "+cname;
                          k=st.executeUpdate(sql);
                         if(k>0)
                             System.out.println("Alter table SuccessFully...");
                         break;
                  case 3:System.out.println("Enter Empoyee Number to Delete the Record :");
                         int eno3=sc.nextInt();
                          sql="delete from emp where eno="+eno3;
                          k=st.executeUpdate(sql);
                         if(k>0)
                            System.out.println("Delete Record ");
                        break;
                 case 4:System.out.println("Enter eno to search Record");
                        int eno1=sc.nextInt();
                         sql="select * from emp where eno="+eno1;
                        rs=st.executeQuery(sql);
                        if(rs.next())
                        {
                            System.out.println("Employee Name="+rs.getString(2));
                            System.out.println("Employee salary="+rs.getString(3));
                        }
                        else
                           System.out.println("Record Not Found");
                        break;
                 case 5: sql="select * from emp";
                        rs=st.executeQuery(sql);
                        while(rs.next())
                        {
                            
                                System.out.println("Employee Number="+rs.getString(1));
                                System.out.println("Employee Name="+rs.getString(2));
                                System.out.println("Employee salary="+rs.getString(3));
                           
                        }
                       break;
                        
              }
         }while(ch<6);
    }
}
