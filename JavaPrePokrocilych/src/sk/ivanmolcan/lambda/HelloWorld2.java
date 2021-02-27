package sk.ivanmolcan.lambda;

public class HelloWorld2 {

//    public void printHelloWorld(){
//        System.out.println("Hello World");
//    }

    public void printHelloWorld2(Lambda printHello){
        printHello.print();
    }

    public static void main(String[] args) {
        Lambda printHello = () -> System.out.println("Hello World");
        HelloWorld2 helloWorld2 = new HelloWorld2();
        helloWorld2.printHelloWorld2(printHello);
    }
}
