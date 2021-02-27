package sk.ivan.molcan.collections;

import java.lang.reflect.Array;
import java.util.*;

public class Collections2 {

    public static void main(String[] args) {
        List<String> animals = new ArrayList<String>();
        animals.add("Lion");
        animals.add("cat");
        animals.add("Dog");
        animals.add("Bird");

//        for(int i =0; i< animals.size();i++){
//            System.out.println(animals.get(i));
//        }
//        System.out.println();
//        for(String value : animals){
//            System.out.println(value);
//        }

        List<Vehicle> vehicles = new ArrayList<Vehicle>();
        Vehicle vehicle2 = new Vehicle("Toyota", "Camery", 13000, false);

        vehicles.add(new Vehicle("Honda", "accord", 12000, false));
        vehicles.add(vehicle2);
        vehicles.add(new Vehicle("Jeep", "Wrangler", 25000, true));

//        for(Vehicle veh : vehicles){
//            System.out.println(veh);
//        }

        printElements(vehicles);
        System.out.println();
        printElements(animals);

    }

    public static void printElements(List someList){
        for(int i=0;i< someList.size();i++){
            System.out.println(someList.get(i));
        }
    }

}
