
/*
Ways To Create A Thread In Java
1.By extending the thread class
2.By implementing Runnable interface
 */

// By extending the thread class
/*
class name extends Thread{
@override
public void run(){
 //Code
 }
 main method{
 Classname name = new Classname();
 name.start();
 */
class Mythread1 extends Thread{
    public void run(){
        int i =1;
        while (i<=1000){
            System.out.println("Thread 1 extends Thread class running ");
            i++;
        }
    }
}
class Mythread2 extends Thread{
    public void run(){
        int i =1;
        while (i<=1000){
            System.out.println("Thread 2 extends Thread class running");
            i++;
        }
    }
}

//By implementing Runnable interface
/*
class name implements Runnable{
@override
public void run(){
//Code
}
}
main method{
class name object = new classname();
Thread newobj = new Thread(object);
newobj.start();
*/
class Method1 implements Runnable{
    public void run(){
        int i=0;
        while (i<=1000){
            System.out.println("I am runnable of method1");
            i++;
        }
    }
}
class Method2 implements Runnable{
    public void run(){
        int i =0;
        while(i<=1000){
            System.out.println("I am runnable of method2");
            i++;
        }
    }
}
public class Threads {
    public static void main(String[] args) {
        //Method to start threads that extends thread class
        Mythread1 m1 = new Mythread1();
        Mythread2 m2 = new Mythread2();
        m1.start();
        m2.start();

        //Method to start thread that implements runnabele
        Method1 mt1 = new Method1();
        Thread t1 = new Thread(mt1);
        Method2 mt2 = new Method2();
        Thread t2 = new Thread(mt2);
        t1.start();
        t2.start();
    }
}
