package oop.builderPattern;

public class App {

    public static void main(String[] args) {

        Vehicle veh = new Vehicle.Builder(25000,"car")
                .color("red")
                .horsePower(150)
                .doors(4)
                .make("Honda")
                .model("Accord")
                .build();

        System.out.println(veh);

    }
}
