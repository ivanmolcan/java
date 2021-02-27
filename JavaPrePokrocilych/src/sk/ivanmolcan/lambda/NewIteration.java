package sk.ivanmolcan.lambda;

import sk.ivanmolcan.Osoba;

import java.util.Arrays;
import java.util.List;

public class NewIteration {

    public static void main(String[] args) {
        List<Osoba> osoby = Arrays.asList(
                new Osoba("Jaro", "Beno", 30),
                new Osoba("Peter", "Kridlo", 55),
                new Osoba("Karol", "Otko", 18),
                new Osoba("Fedor", "Ronald", 84)
        );

        osoby.forEach(os -> System.out.println(os.getFirstName()));
        osoby.forEach(System.out::println);
    }
}
