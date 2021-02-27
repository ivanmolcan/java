package sk.ivanmolcan.lambda;

public class LambdaVnutorneTriedy {

    public static void main(String[] args) {
//        Lambda lambda = () -> System.out.println("Hello world from inner class");

        Lambda lambda2 = new Lambda() {
            @Override
            public void print() {
                System.out.println("Hello wolrd from inner class lambda 2");
            }
        };

        printIt(() -> System.out.println("Hello world from inner class"));
        printIt(lambda2);
    }

    public static void printIt(Lambda lambda){
        lambda.print();
    }

}
