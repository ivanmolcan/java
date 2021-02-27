package sk.ivanmolcan.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaExampleFunkcionalneRozhrania {

//1.  vytvor si zoznam miest
//2.  zotried zoznam
//3.  napis metodu, ktora vypise vsetko zo zonamu miest
//4.  urob si metodu, ktora vypise len tie mesta, ktore sa skladaju z jedneho slova

    public static void main(String[] args) {
        //1.  vytvor si zoznam miest
        List<String> mesta = Arrays.asList(
                "Banska Bystrica", "Presov", "Levice","Banska Stiavnica", "Liptovsky Trhovec"
        );

        //2.  zotried zoznam
        Collections.sort(mesta, (o1, o2) -> o1.compareTo(o2));

        //3.  napis metodu, ktora vypise vsetko zo zonamu miest
        printWithFilter(mesta, s -> true, s -> System.out.println(s), s-> s.toUpperCase());
        System.out.println();

        //4.  urob si metodu, ktora vypise len tie mesta, ktore sa skladaju z jedneho slova
        printWithFilter(mesta, s -> !s.contains(" "), s -> System.out.println(s), s-> s.toLowerCase());
        System.out.println();

        printWithFilter(mesta, s -> s.startsWith("B"), s -> System.out.println(s), s-> s.replaceAll(" ", "_"));
    }

    private static void printWithFilter(List<String> mesta, Predicate<String> predicate,
                            Consumer<String> consumer, Function<String, String> function) {
        for(String mesto : mesta){
            if(predicate.test(mesto)){
                consumer.accept(function.apply(mesto));
            }
        }
    }
}
