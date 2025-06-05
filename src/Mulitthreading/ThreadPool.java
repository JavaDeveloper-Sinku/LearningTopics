package Mulitthreading;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
    public static void main(String[] args) {

        //Creat a thread pool of 3 threads
        ExecutorService executor = Executors.newFixedThreadPool(3);


        //submit 5 tasks
        for (int i =1; i <= 10; i++){
            int taskId = i;

            executor.submit(() -> {
                System.out.println("Running task " + taskId + " by " + Thread.currentThread().getName());

            });
        }

        //Shutdown the executor
        executor.shutdown();

    }
}
