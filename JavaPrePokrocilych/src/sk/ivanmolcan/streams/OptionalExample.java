package sk.ivanmolcan.streams;

import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {
//        basicOptional();

//        moreOptional();

//        orElseOptional();

        realLife();
    }

    private static void realLife() {
       OsobaOptional o = new OsobaOptional("Jaro", null, 30);

       //Sposobi chybu, lebo je tam null
       System.out.println(o.getLastName().orElse("nic").toUpperCase());

        o.getLastName().ifPresent(pr-> System.out.println(pr.toUpperCase()));


    }

    private static void orElseOptional() {
        Optional<String> meno = Optional.of("Jaro");
        Optional<String> prazdne = Optional.empty();

        System.out.println(meno.orElse("nic"));
        System.out.println(prazdne.orElse("nic"));
        System.out.println("-----------------------");

        System.out.println(meno.orElseGet(()->"nic"));
        System.out.println(prazdne.orElseGet(()->"nic"));
        System.out.println("-----------------------");
    }

    private static void moreOptional() {
        Optional<String> meno = Optional.of("Jaro");
        Optional<String> prazdne = Optional.empty();

        if(prazdne.isPresent()){
            System.out.println("meno: " + meno.get());
        } else {
            System.out.println("Meno tam nie je");
        }
        System.out.println();

        meno.ifPresent(m-> System.out.println("meno: " + m));
        prazdne.ifPresent(p-> System.out.println("meno: " + p));
    }

    private static void basicOptional() {
        Optional<String> meno = Optional.of("Jaro");
        String hodnota1 = "daco";
        String hodnota2 = null;

        System.out.println(meno);
        System.out.println(meno.get());
        System.out.println(Optional.empty() +"\n");

        System.out.println(Optional.ofNullable(hodnota1).get());
        System.out.println(Optional.ofNullable(hodnota2));
    }
}
