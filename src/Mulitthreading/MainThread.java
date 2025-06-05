package Mulitthreading;


//by implements keyword using
//class mythread implements Runnable{
//    public void run(){
//
//            System.out.println("First thread running :" + Thread.currentThread().getName());
//
//    }
//}

//by extends keyword using
class mythread2 extends Thread{
    public void run(){
        for (int i = 1 ;i<=5 ; i++){
            System.out.println( i +" => " + Thread.currentThread().getName());
        }
    }
}
public class MainThread {
    public static void main(String[] args) {

//        Thread t1 = new Thread(new mythread());
//        t1.start();

       mythread2 t1 = new mythread2();
       mythread2 t2 = new mythread2();

        t1.start();
        t2.start();
    }

}
