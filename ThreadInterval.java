//Question: Write a program to create two threads. The first thread should print number 1 to 10 at intervals of 0.5 sec. 
// and the second thread should print numbers from 11 to 20 at the interval of 1 second.
class First extends Thread{
    public void  run()
    {
        for( int i=1;i<=10;i++)
        {
            try{
            
               System.out.println("1 to 10:  "+i);
               Thread.sleep(500);
            }
            catch(InterruptedException e)
            {
                System.out.println(e.getMessage());
            }
        }
    }
}

class Second extends Thread{
    public void run(){
        for( int i=11;i<=20;i++)
        {
            try{
              System.out.println("11 to 20: "+i);
              Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                System.out.println(e.getMessage());
            }

        }
    }

}
public class ThreadInterval {
    public static void main(String[] args)
    {
        Thread f =new First();
        Thread s= new Second();
        f.start();
        s.start();
    }
    
}
