
class Demo
{
    public static void main(String arg[])
    {
        Thread th=Thread.currentThread();
        System.out.println(th);
        th.setPriority(Thread.MAX_PRIORITY);
        System.out.println(th);
        th.setName("RBNB");
        System.out.println("Name of Thread="+th.getName());
        System.out.println(th);
        System.out.println(th.getId());
        System.out.println(th.getState());
        
        
    }
}