package sk.ivan.molcan.threads;

public class AppThread {

    public static void main(String[] args) {

        System.out.println("Starting Thread 1");
        Task taskRunner = new Task("A");
        taskRunner.start();

        System.out.println("Starting Thread 2");
        Task taskRunner2 = new Task("B");
        taskRunner2.start();

    }
}

class Task extends Thread {

    String name;

    public Task(String name) {
        this.name = name;
        setName(this.name);
    }

    public void run(){
        for(int i =0; i<1000;i++){
            System.out.println("Number: " + i + " - " + Thread.currentThread().getName());
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
