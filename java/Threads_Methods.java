
/*
Below are the commonly used constructors of the thread class:

 Thread ( ) --> Used in Previous
Thread ( string )
Thread ( Runnable r ) --> Used in previous
Thread ( Runnable r, String name )
 */

//Thread(String)
class MyThr extends Thread{
    MyThr(String name){
        super(name);
    }
    public void run(){
        int i =1;
        while(true){
            System.out.println("I am Thread");
           // i++;
        }

    }
}
class MyThr2 implements Runnable{
    MyThr2( String name){
        super();
    }
    public void run(){
        while (true){
            System.out.println("I am Runnable Thread");
        }

    }
}

//Sleep Method
//Make the thread sleep for certain amount of time
/*
try{
Thread.sleep(long time in milis)
}
catch(Exception e){
sout();
}
 */
class threadMethod extends Thread{
    public void run(){
        int i =0;
        while (i<1000){
            try{
                Thread.sleep(500);
            }catch (Exception e){
                System.out.println(e);
            }
            System.out.println("I am method 1");
            i++;
        }
    }
}
class threadMethod2 extends Thread {
    public void run() {
        int i = 0;
        while (i < 1000) {
            System.out.println("I am method 2");
            i++;
        }
    }
}
    //Priority
/*
MIN_PRIORITY: Minimum priority that a thread can have. Value is 1.
NORM_PRIORITY: This is the default priority automatically assigned by JVM to a thread if a programmer does not explicitly set the priority of that thread.
 Value is 5.
MAX_PRIORITY: Maximum priority that a thread can have. Value is 10.
 */
//setPriority(Thread.max/min): This method is used to set the priority of a thread.
//getPriority(): This method is used to display the priority of a given thread.
    public class Threads_Methods {
        public static void main(String[] args) {
            MyThr th = new MyThr("ashu");
            //Setting Priorities to max
            th.setPriority(Thread.MAX_PRIORITY);
            th.start();
            //th.stop();
            System.out.println("The id of the thread is: " + th.getId());
            System.out.println("The name of the thread is: " + th.getName());
            System.out.println("The Priority of the thread is" + th.getPriority());


            MyThr2 th2 = new MyThr2("ashu");
            Thread t = new Thread(th2);
            //Setting Priorities to Min
            t.setPriority(Thread.MIN_PRIORITY);
            t.start();
            //t.stop();
            System.out.println("The id of the thread is: " + th.getId());
            System.out.println("The name of the thread is: " + th.getName());
            //Getting the priority
            System.out.println("The Priority of the thread is" + t.getPriority());

            //Join method
            // The method to which join method is used is executed and the other methods wait till its excution et finish
        /*
        try{
        object.join();
        }
        catch(exception e){
        sout(e);
        }
         */
            threadMethod tm = new threadMethod();
            threadMethod2 tm2 = new threadMethod2();
            tm.start();
//            tm.interrupt();
//            try {
//                tm.join();
//            } catch (Exception e) {
//                System.out.println(e);
//            }
            tm2.start();
        }
    }

