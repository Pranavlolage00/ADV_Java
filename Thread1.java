class A extends Thread
{
    A()
    {
        System.out.println("i am now in default constructr");
        start();
    }
    public void run()
    {
       System.out.println("i am now in Run");
        for(int i=1; i<=5; i++)
        {
            System.out.println("Value of i="+i);
        }
    }
}
public class Thread1
{
    public static void main(String arg[])
    {
        A ob=new A();
    }
}