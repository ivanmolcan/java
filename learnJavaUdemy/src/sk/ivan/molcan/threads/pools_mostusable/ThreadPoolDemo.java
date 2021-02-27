package sk.ivan.molcan.threads.pools_mostusable;

import java.util.concurrent.*;

public class ThreadPoolDemo {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        Runnable processor = new MessageProcessor(2);
        executor.execute(processor);

        Runnable processor2 = new MessageProcessor(4);
        executor.execute(processor2);

        Runnable processor3 = new MessageProcessor(3);
        executor.execute(processor3);

        executor.shutdown(); //Rejects any new tasks from being submitted. Gracefully shuts down
//        executor.shutdownNow(); //Terminate immediately

        try {
            executor.awaitTermination(10, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("END");

    }

}
