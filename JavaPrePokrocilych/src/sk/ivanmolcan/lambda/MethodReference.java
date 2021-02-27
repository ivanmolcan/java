package sk.ivanmolcan.lambda;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class MethodReference {

//    public static void main(String[] args) {
//        doSomething("Jaro", a-> System.out.println(a));
//    }

    public static void main(String[] args) {
        doSomething("Jaro", System.out::println);

        sumIt(10,5, (a,b)-> System.out.println(a+b));
    }

    public static<T> void doSomething(T item, Consumer<T> consumer){
        consumer.accept(item);
    }

    public static void sumIt(int a, int b, BiConsumer<Integer,Integer> biConsumer){
        biConsumer.accept(a,b);
    }
}
