package queue;

public class Queue {
    private int maxSize;
    private long[] queArray;
    private int front;
    private int rear;
    private int nItems; //counter to maintain the number of items in our queue

    public Queue(int size){
        this.maxSize = size;
        this.queArray = new long[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void insert(long j){
        if(rear == maxSize-1){
            rear = -1;
        }
        rear++;
        queArray[rear] = j;
        nItems++;
    }

    public void view(){
        System.out.print("[ ");
        for(int i =0; i< queArray.length;i++){
            System.out.print(queArray[i] + " ");
        }
        System.out.print("]");
    }

    public long remove(){
        long temp = queArray[front];
        front++;
        if (front == maxSize){
            front = 0;
        }
        nItems--;
        return temp;
    }

    public long peekFront(){
        return queArray[front];
    }

    public boolean isEmpty(){
        return (nItems == 0);
    }

    public boolean isFull(){
        return (nItems == maxSize);
    }

    public static void main(String[] args) {
        Queue myQueue = new Queue(5);
        myQueue.insert(100);
        myQueue.insert(1000);
        myQueue.insert(14);
        myQueue.insert(44);
        myQueue.view();
    }


}
