package sk.ivan.molcan.collections;

import java.util.*;

public class HashSets {

    public static void main(String[] args) {
        LinkedHashSet<Integer> values = new LinkedHashSet<Integer>();
        values.add(12);
        values.add(43);
        values.add(15);
        values.add(67);
        values.add(43);

//        for(Integer value : values){
//            System.out.println(value);
//        }

        HashSet<Animal> animals = new HashSet<Animal>();

        Animal animal1 = new Animal("Dog", 12);
        Animal animal2 = new Animal("Dog", 12);

        animals.add(animal1);
        animals.add(animal2);

        System.out.println(animal1.hashCode());
        System.out.println(animal2.hashCode());

        for(Animal animal : animals){
            System.out.println(animal);
        }

    }

}
