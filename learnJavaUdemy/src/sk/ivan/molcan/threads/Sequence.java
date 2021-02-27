package sk.ivan.molcan.threads;

public class Sequence {

    private int value = 0;

    public synchronized int getNext(){
            value++;
            return value;
    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence();

        Worker worker1 = new Worker(sequence);
        worker1.start();

        Worker worker2 = new Worker(sequence);
        worker2.start();
    }
}




class Worker extends Thread{
    Sequence sequence = null;

    public Worker(Sequence sequence){
        this.sequence = sequence;
    }

    @Override
    public void run() {
        for(int i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName() + " - " + sequence.getNext());
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
