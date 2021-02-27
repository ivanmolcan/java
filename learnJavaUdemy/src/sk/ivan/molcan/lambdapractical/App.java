package sk.ivan.molcan.lambdapractical;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class App {

    public static void main(String[] args) {

        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Honda", "Accord", "Red", 22300));
        cars.add(new Car("Honda", "Civic", "Blue", 17700));
        cars.add(new Car("Toyota", "Land Cruiser", "White", 48500));
        cars.add(new Car("Toyota", "Corolla", "Black", 16200));
        cars.add(new Car("Toyota", "Camry", "Blue", 24000));
        cars.add(new Car("Nissan", "Sentra", "White", 17300));
        cars.add(new Car("Mitsubishi", "Lancer", "White", 20000));
        cars.add(new Car("Jeep", "Wrangler", "Red", 24500));

        Function<Car, String> priceAndColor = (c) -> " price = " + c.getPrice() + " color = " + c.getColor();
        String stringCar = priceAndColor.apply(cars.get(0));
        System.out.println(stringCar);


//        printCarsPriceRange(cars, 18000, 22000);
//        System.out.println("-----------------------------------------------------------------");
//        printCarByColor(cars, "Red");

        //anonymna trieda, ktora je potom prehodena na lambda
//        printCars(cars, new CarCondition() {
//            @Override
//            public boolean test(Car c) {
//                return c.getPrice() >=18000 && c.getPrice()<=22000;
//            }
//        });
//
//        printCars(cars, new CarCondition() {
//            @Override
//            public boolean test(Car c) {
//                return c.getColor().equals("Blue");
//            }
//        });

        printCars(cars, (c)-> c.getPrice() >=18000 && c.getPrice()<=22000);
        printCars(cars, (c)-> c.getColor().equals("Blue"));

    }

    public static void printCars(List<Car> cars, Predicate<Car> predicate){
        for(Car c : cars){
            if(predicate.test(c)){
                c.printCar();
            }
        }
    }

//    public static void printCars(List<Car> cars, Condition<Car> condition){
//        for(Car c : cars){
//            if(condition.test(c)){
//                c.printCar();
//            }
//        }
//    }


//    public static void printCarsPriceRange(List<Car> cars, int low, int high){
//        for(Car c: cars){
//            if(low<= c.getPrice() && c.getPrice()<= high){
//                c.printCar();
//            }
//        }
//    }
//
//    public static void printCarByColor(List<Car> cars, String color){
//        for(Car c: cars){
//            if(c.getColor().equals(color)){
//                c.printCar();
//            }
//        }
//    }
}

@FunctionalInterface
interface Condition<T> {
    public boolean test(T t);
}

