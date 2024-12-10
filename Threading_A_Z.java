import java.util.*;
class A extends Thread
{
    A()
    {
        start();
    }
    public void run()
    {
       for(char ch='A'; ch<='Z'; ch++)
       {
           try{
             sleep(1000);
             System.out.println("Value of ch="+ch);
           }catch(Exception e)
           {

           }
       }
    }
}
class Demo1
{
    public static void main(String arg[])
    {
        A ob=new A();
    }
}