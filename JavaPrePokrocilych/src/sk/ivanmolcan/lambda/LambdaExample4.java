package sk.ivanmolcan.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaExample4 {

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
        printWithFilter(mesta, s -> true);
        System.out.println();

        //4.  urob si metodu, ktora vypise len tie mesta, ktore sa skladaju z jedneho slova
        printWithFilter(mesta, s -> !s.contains(" "));
        System.out.println();

        printWithFilter(mesta, s -> s.startsWith("B"));
    }

    private static void printWithFilter(List<String> mesta, Filter filter) {
        for(String mesto : mesta){
            if(filter.odFiltruj(mesto)){
                System.out.println(mesto);
            }
        }
    }

    private static void printMesta(List<String> mesta) {
        for(String mesto : mesta){
            System.out.print(mesto + ", ");
        }
    }

    interface Filter{
        boolean odFiltruj(String s);
    }
}
