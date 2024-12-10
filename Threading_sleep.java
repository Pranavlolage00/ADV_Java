class A extends Thread
{
    A()
    {
        start();
    }
    public void run()
    {
        for(int i=0; i<=5; i++)
    {
        try{
            sleep(1000);
            System.out.println("value of A="+i);
        }catch(Exception e){}
    }
    }
}
class B extends Thread
{
    B()
    {
        start();
    }
    public void run()
    {
    for(int i=0; i<=5; i++)
    {
        try{
            sleep(1000);
            System.out.println("value of B="+i);
        }catch(Exception e){}
    }
    }
}
class C extends Thread
{
    C()
    {
        start();
    }
    public void run()
    {
    for(int i=0; i<=5; i++)
    {
        try{
            sleep(1000);
            System.out.println("value of C="+i);
        }catch(Exception e){}
    }
    }
}
class MD
{
    public static void main(String arg[])
    {
        A ob1=new A();
        B ob2=new B();
        C ob3=new C();
    }
}