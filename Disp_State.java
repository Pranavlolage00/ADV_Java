class A implements Runnable
{
    Thread th1;
    A()
    {
        th1=new Thread(this);
        th1.start();
        System.out.println("State of Thread="+th1.getState());
    }
    public void run()
    {
        for(int i=1; i<=15; i++)
        {
            try{
                th1.sleep(1000);
                th1.setPriority(Thread.MAX_PRIORITY);
                System.out.println("State of Thread="+th1.getState());
                System.out.println("Value of A="+i);
                if(i==6)
                    th1.wait();
            }catch(Exception e){} 
        }
    }
}
class B implements Runnable
{
    Thread th2;
    B()
    {
        th2=new Thread(this);
        th2.start();
        System.out.println("State of Thread="+th2.getState());
    }
    public void run()
    {
        for(int i=1; i<=5; i++)
        {
            try{
                th2.sleep(1000);
                th2.setPriority(Thread.MIN_PRIORITY);
                System.out.println("State of Thread="+th2.getState());
                System.out.println("Value of B="+i);
                if(i==4)
                    th2.notify();

            }catch(Exception e){} 
        }
    }
}class C implements Runnable
{
    Thread th3;
    C()
    {
        th3=new Thread(this);
        th3.start();
        System.out.println("State of Thread="+th3.getState());
    }
    public void run()
    {
        for(int i=1; i<=10; i++)
        {
            try{
                th3.sleep(1000);
                th3.setPriority(Thread.NORM_PRIORITY);
                System.out.println("State of Thread="+th3.getState());
                System.out.println("Value of C="+i);
            }catch(Exception e){} 
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
    }
}