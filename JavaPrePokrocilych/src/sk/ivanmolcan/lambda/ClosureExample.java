package sk.ivanmolcan.lambda;

public class ClosureExample {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        addToIt(a, i -> System.out.println(i+b));
    }

    static void addToIt(int i, Process process){
        process.process(i);
    }

    interface Process{
        void process(int i);
    }

}
