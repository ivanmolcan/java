package sk.ivanmolcan.streams;

import sk.ivanmolcan.Osoba;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.*;

public class Stream {

    public static void main(String[] args) {
        List<Osoba> osoby = Arrays.asList(
                null,
                new Osoba("Jaro", "Beno", 30),
                new Osoba("Peter", "Kridlo", 55),
                new Osoba("Karol", "Otko", 18),
                new Osoba("Karol", "Beno", 18),
                new Osoba("Peter", "Otko", 20),
                new Osoba("Fedor", "Ronald", 84)
        );

//        osoby.stream()
//                .filter(osoba->osoba.getAge()<50)
//                .distinct()
//                .forEach(System.out::println);

//        List<Integer> veky = osoby.stream()
//                .filter(osoba->osoba.getAge() <50)
//                .sorted(Comparator.comparing(Osoba::getAge)) //osoba -> osoba.getAge()
//                .map(Osoba::getAge) //vypisuje uz iba vek
//                .collect(Collectors.toList());
//
//        veky.forEach(System.out::println);

        //nefunguje pre null
//        osoby.stream().findFirst().ifPresent(System.out::println);

        //premapoval som si osoby na Optional
        osoby.stream()
                .map(Optional::ofNullable)
                .findFirst()
                .ifPresent(System.out::println);

    }
}
