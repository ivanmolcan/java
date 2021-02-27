package sk.ivan.molcan.threads.concurrencyutil;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable{
    BlockingQueue<Integer> questionQueue;
    int questionNo;

    public Producer(BlockingQueue<Integer> questionQueue) {
        this.questionQueue = questionQueue;
    }

    @Override
    public void run() {

        try {
            synchronized (this){
                int nextQuestion = questionNo++;
                System.out.println("Got new Question: " + nextQuestion);
                questionQueue.put(questionNo);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
