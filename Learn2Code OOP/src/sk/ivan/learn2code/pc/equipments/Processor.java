package sk.ivan.learn2code.pc.equipments;

import sk.ivan.learn2code.pc.enums.Brand;

public class Processor implements Services {
    private double speed;
    private Brand brand;

    public Processor(double speed, Brand brand) {
        this.speed = speed;
        this.brand = brand;
        running();
    }

    @Override
    public void running() {
        System.out.println("PC is running");
    }

    public double getSpeed() {
        return speed;
    }

    public Brand getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "speed=" + speed +
                ", brand=" + brand +
                '}';
    }
}
