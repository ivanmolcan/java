package oop.factoryDesignPattern;

public class App {

    public static void main(String[] args) {
        VehicleFactory veh = new VehicleFactory();

        Vehicle vehicle = veh.getVehicle(VehicleType.CAR);
        vehicle.startEngine();
    }
}
