//Write a program to execute multiple threads in priority base..
class First extends Thread{
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
                System.out.println(i);
        }
    }
}
class Second extends Thread{
    public void run()
    {
        for(int i=11; i<=20;i++)
        {
            System.out.println(i);
        }
    }
}
class Third extends Thread{
    public void run()
    {
        for(int i=21;i<=30;i++)
        {
            System.out.println(i);
        }
    }

}
public class ThreadPriority {
    public static void main(String[] args) throws InterruptedException{
        Thread t1 = new First();
        Thread t2 = new Second();
        Thread t3 = new Third();
        // t1.setPriority(1);
        // t2.setPriority(10);
        // t3.setPriority(5);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
    }
    
}
