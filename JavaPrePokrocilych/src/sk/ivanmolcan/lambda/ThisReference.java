package sk.ivanmolcan.lambda;

public class ThisReference {

    public static void main(String[] args) {
        ThisReference thisReference = new ThisReference();
        thisReference.callProcess(1, i -> {
            System.out.println(i);
        });
    }

    public void callProcess(int i, Process process){
        process.process(i);
    }

    interface Process{
        void process(int i);
    }

}
