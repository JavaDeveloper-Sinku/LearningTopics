package Lamda;

public class LambdaExample {
    public static void main(String[] args) {

        //Traditional way
        Runnable t1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Traditional Way of Runnable interface using ");
            }
        };

        t1.run();

        //Lambda Expression way
        Runnable t2 = () ->
            System.out.println("Lambda with Runnable interface using ");

            t2.run();

        Runnable t3 = () ->
                System.out.println(" basic testing for my side ");
            t3.run();



    }
}
