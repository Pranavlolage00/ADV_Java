// Write a program that implements a multi-thread application that has three threads. 
// First thread generates random integer every 1 second and if the value is even, second 
// thread computes the square of the number and prints. If the value is odd, the third 
// thread will print the value of cube of the number. 
import java.util.*;
class A implements Runnable
{
    public int num;
    Thread th1;
    A()
    {
        th1=new Thread(this);
         th1.start();
    }
    public void run()
    {
        Random r1=new Random();
        try{
             while(true)
             {
                th1.sleep(1000);
               int num=r1.nextInt(100);
               this.num=num;
             }
        }catch(Exception e)
        {
           System.out.println(e);
        }
    }
}
class B extends A implements Runnable
{
    Thread th2;
   
    B()
    {
        th2=new Thread(this);
         th2.start();
    }
     public void run()    
     {
        if(num%2==0)
        {
            int ans=num*num;
            System.out.println("Square of Number="+ans);
        }
     }
}
class C extends B implements Runnable
{
    Thread th3;
    C()
    {
        th3=new Thread(this);
         th3.start();
    }
   
    public void run()    
     {
        if(num%2==0)
        {
            int ans=(num*num*num);
            System.out.println("cube of Number="+ans);
        }
     }
}
public class Demo
{
    public static void main(String arg[])
    {
         A ob1=new A();
         B ob2=new B();
        C ob3=new C();

        // Thread t1=new Thread(ob1);
        // Thread t2=new Thread(ob2);
        // Thread t3=new Thread(ob3);

        // t1.start();
        // t2.start();
        // t3.start();
    }
}