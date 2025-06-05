package Mulitthreading;

class  Mythread extends Thread{
    public void run(){
//        System.out.println("Mera thread chal raha hai : "+ Thread.currentThread().getName());
        for (int i =1; i<=5; i++){
            System.out.println(getName() + " : " + i);
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println("Thread interrupted");
            }
        }

    }
}




public class Main {
    public static void main(String[] args) throws InterruptedException{
        Mythread t1= new Mythread();
        t1.setName("FirstThread");
        t1.start();

        t1.join();

        System.out.println("Main thread finished");

    }
}
