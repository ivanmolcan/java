package sk.ivan.learn2code.motorVehicle.vehicles;

import sk.ivan.learn2code.motorVehicle.enums.Brand;
import sk.ivan.learn2code.motorVehicle.enums.Color;

public class StaticData {
    public Car car = new Car(4, Brand.MERCEDES, Color.BLUE);
    public Bus bus = new Bus(4, Brand.PEUGEOT, Color.BLACK);
}
