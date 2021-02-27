package sk.ivanmolcan.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaVynimky {

//1.  vytvor si zoznam miest
//2.  zotried zoznam
//3.  napis metodu, ktora vypise vsetko zo zonamu miest
//4.  urob si metodu, ktora vypise len tie mesta, ktore sa skladaju z jedneho slova

    public static void main(String[] args) {
        //1.  vytvor si zoznam miest
        List<String> mesta = Arrays.asList(
                "Banska Bystrica", null, "Presov", "Levice","Banska Stiavnica", "Liptovsky Trhovec"
        );


        //3.  napis metodu, ktora vypise vsetko zo zonamu miest
        printWithFilter(mesta, s -> true, s -> System.out.println(s), wrapperFunction(s-> s.toUpperCase()));

    }

    private static void printWithFilter(List<String> mesta, Predicate<String> predicate,
                                        Consumer<String> consumer, Function<String, String> function) {
        for(String mesto : mesta){
            if(predicate.test(mesto)){
                consumer.accept(function.apply(mesto));
            }
        }
    }

    private static<T,R> Function<T,R> wrapperFunction(Function<T,R> function){
        return s -> {
            R a = null;
            try{
                a = function.apply(s);
            } catch (Exception e){
                System.out.println("Error vo Function");
            }
            return a;
        };
    }

    private static<T> Consumer<T> wrapperConsumer(Consumer<T> consumer){
        return s -> {
            try{
                consumer.accept(s);
            } catch (Exception e){
                //
            }
        };
    }
}
