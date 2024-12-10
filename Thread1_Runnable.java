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
        for(int i=1; i<=5; i++)
        {try{
         th.sleep(1000);
            System.out.println("A ob i="+i);
        }catch(Exception e){}
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