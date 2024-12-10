class A extends Thread
{
    public void run()
    {
        for(int i=1; i<=5; i++)
        {
            System.out.println("value of i="+i);
        }
    }
}
public class Thread4
{
    public static void main(String arg[])
    {
        A ob=new A();
        ob.start();
    }
}