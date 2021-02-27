package sk.ivanmolcan.lambda;

import java.util.*;

public class LambdaExample3 {

//1.  vytvor si zoznam miest
//2.  zotried zoznam
//3.  napis metodu, ktora vypise vsetko zo zonamu miest
//4.  urob si metodu, ktora vypise len tie mesta, ktore sa skladaju z jedneho slova
//5.  nepouzivaj pri tom lambda vyrazy - TAKTO BY SA TO PISALO V JAVE 7z

    public static void main(String[] args) {
        //1.  vytvor si zoznam miest
        List<String> mesta = Arrays.asList(
            "Banska Bystrica", "Presov", "Levice","Banska Stiavnica", "Liptovsky Trhovec"
        );

        //2.  zotried zoznam
        Collections.sort(mesta, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        //3.  napis metodu, ktora vypise vsetko zo zonamu miest
        printMesta(mesta);
        System.out.println("\n");

        //4.  urob si metodu, ktora vypise len tie mesta, ktore sa skladaju z jedneho slova
        printWithFilter(mesta, new Filter() {
            @Override
            public boolean odFiltruj(String s) {
                return !s.contains(" ");
            }
        });
        System.out.println();

        printWithFilter(mesta, new Filter() {
            @Override
            public boolean odFiltruj(String s) {
                return s.startsWith("B");
            }
        });
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
