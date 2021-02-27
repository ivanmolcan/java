package sk.ivanmolcan.lambda;

public class HelloWorld {
    public void printHelloWorld(){
        System.out.println("Hello World1");
    }

    public void printHelloWorld2(HelloWorldFunctions helloWorldFunctions){
        helloWorldFunctions.sayHello();
    }

    public static void main(String[] args) {
        HelloWorld helloWorld1 = new HelloWorld();
        helloWorld1.printHelloWorld();

//        helloWorld1.printHelloWorld2(helloWorld1.new HelloWorldC());
        helloWorld1.printHelloWorld2(() -> System.out.println("Hello World impls"));
    }

    class HelloWorldC implements HelloWorldFunctions{

        @Override
        public void sayHello() {
            System.out.println("Hello World2");
        }
    }
}
