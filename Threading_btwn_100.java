import java.util.*;
class A extends Thread
{
    A()
    {
        start();
    }
    public void run()
    {
    
        while(true)
        {
         Random r1=new Random();
         int n=r1.nextInt(100);
        try{
             sleep(1000);
        System.out.println("value of n ="+n);
        }catch(Exception e){}
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