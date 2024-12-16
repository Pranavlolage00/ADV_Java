//  Write a program in which thread sleep for 6 sec in the loop in reverse order from 100 
// to 1 and change the name of thread. 
class A implements Runnable
{
    Thread th;
    A()
    {
        th=new Thread(this);
        th.start();
    }
    public void run()
    {
        th.setName("CDJ");
        System.out.println("Thread="+Thread.currentThread());
        for(int i=100; i>0; i--) 
        {
            try{
              th.sleep(6000);
              System.out.println("Value of i="+i);
            }catch(Exception e)
            {
               System.out.println(e);
            }
        }
    }
}
class Demo
{
    public static void main(String arg[])
    {
        A ob=new A();
    }
}