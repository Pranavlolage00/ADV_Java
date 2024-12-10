class A extends Thread
{
    Thread th;
    A()
    {
        th=new Thread(this);
        th.start();
    }
    public void run()
    {
        for(int i=1; i<=5; i++)
        {
            System.out.println("value of A="+i);
        }
    }
}
public class Thread2
{
    public static void main(String arg[])
    {
        A ob=new A();
    }
}