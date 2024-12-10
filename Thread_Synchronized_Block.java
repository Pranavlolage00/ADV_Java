class A implements Runnable
{
    public void run()
    {
        for(int i=1; i<=5; i++)
        {
            System.out.println("A of i="+i);
        }
    }
}
class B implements Runnable
{
    public void run()
    {
        for(int i=1; i<=5; i++)
        {
            
            System.out.println("B of i="+i);
        }
        synchronized(this)
        {
        for(int i=1; i<=5; i++)
        {
            System.out.println("BB of i="+i);
        }
        }
    }
}
class Demo
{
    public static void main(String arg[])
    {
        A ob1=new A();
        B ob2=new B();
        Thread th1=new Thread(ob1);
        Thread th2=new Thread(ob2);
        th1.start();
        th2.start();
    }
}