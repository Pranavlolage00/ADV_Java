class A implements Runnable
{
    synchronized public void run()
    {
        for(int i=1; i<=5; i++)
        {
           System.out.println("A of i="+i);
        }
    }
}
class B implements Runnable
{
    synchronized public void run()
    {
        for(int i=1; i<=5; i++)
        {
           System.out.println("B of i="+i);
        }
    }
}
class C implements Runnable
{
    synchronized public void run()
    {
        for(int i=1; i<=5; i++)
        {
           System.out.println("C of i="+i);
        }
    }
}
class Demo
{
    public static void main(String arg[])
    {
        A ob1=new A();
        B ob2=new B();
        C ob3=new C();
        Thread th1=new Thread(ob1);
        Thread th2=new Thread(ob2);
        Thread th3=new Thread(ob3);
        th1.start();
        th2.start();
        th3.start();
    }
}