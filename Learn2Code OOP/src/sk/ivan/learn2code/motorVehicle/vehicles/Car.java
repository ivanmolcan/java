package sk.ivan.learn2code.motorVehicle.vehicles;

import sk.ivan.learn2code.motorVehicle.enums.Brand;
import sk.ivan.learn2code.motorVehicle.enums.Color;

public class Car extends Vehicles {
    private int wheels;
    private Brand brand;
    private Color color;

    public Car(int wheels, Brand brand, Color color) {
        this.wheels = wheels;
        this.brand = brand;
        this.color = color;
    }

    @Override
    public void stearingWheel() {
        super.stearingWheel();
    }

    @Override
    public void breaks() {
        super.breaks();
    }

    @Override
    public void speed() {
        super.speed();
    }

    public int getWheels() {
        return wheels;
    }

    public Brand getBrand() {
        return brand;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "wheels=" + wheels +
                ", brand=" + brand +
                ", color=" + color +
                '}';
    }
}
