package Mulitthreading;

class MyRunnable implements Runnable{
    public void run(){
//        System.out.println("Runnable thread chal rha hai : "+Thread.currentThread().getName());
        for (int i  =1 ; i<=5 ; i++){
            System.out.println(i);

            try {
                Thread.sleep(2000);   //Blocked / Waiting / Sleeping
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
public class RunnableUsing {
    public static void main(String[] args) {
        MyRunnable myRun = new MyRunnable();
        Thread t1 = new Thread(myRun); // new stage

        t1.start();  //Runnable stage
        try {
            t1.join();  //Blocked / Waiting / Sleeping
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if (t1.isAlive()){
            System.out.println("Thread is alive");
        }

    }
}
