//  Write a java program to display all the vowels from a given String. Each vowel 
// should display after 3 seconds.
import java.util.*;
class A implements Runnable
{
    String s1;
    Thread th;
    A(String s1)
    {
        this.s1=s1;
        th=new Thread(this);
        th.start();
    }
          public void run()
       {
          try{
               for(int i=0; i<s1.length(); i++)           
               {
                   if(s1.charAt(i)=='A' || s1.charAt(i)=='a'|| s1.charAt(i)=='E' ||
                    s1.charAt(i)=='e' || s1.charAt(i)=='I' || s1.charAt(i)=='i' ||
                    s1.charAt(i)=='O' || s1.charAt(i)=='o' || s1.charAt(i)=='U' || s1.charAt(i)=='u')
                   {
                       th.sleep(3000);
                       System.out.println("Vowel in String="+s1.charAt(i));
                   }
               }
          }catch(Exception e)
          {
               System.out.println(e);
          }
       }
}
class Demo
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String To check:");
        String s1=sc.next();
        A ob=new A(s1);
    }
}