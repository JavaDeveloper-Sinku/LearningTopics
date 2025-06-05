package Mulitthreading;

class Shared{
    boolean flag = false;
    synchronized void produce() throws InterruptedException{
        if (flag) wait();
        System.out.println("Producing item...");
        flag = true;
        notify();
    }

    synchronized void consume()throws InterruptedException{
    if (!flag) wait();
        System.out.println("Consuming item...");
        flag = false;
        notify();
    }
}
public class InterThreadCommunication {
    public static void main(String[] args) {
        Shared s = new Shared();

        Thread producer = new Thread(() -> {
            try{
                for (int i = 0; i < 5; i++) s.produce();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
          }
        );

        Thread consumer = new Thread(() -> {
            try {
                for (int i = 0; i < 5; i++) s.consume();

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        producer.start();
        consumer.start();


    }
}
