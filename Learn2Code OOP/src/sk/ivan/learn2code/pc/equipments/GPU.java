package sk.ivan.learn2code.pc.equipments;

import sk.ivan.learn2code.pc.enums.Brand;

public class GPU implements Services {
    private boolean integrated;
    private int speed;
    private Brand brand;

    public GPU(boolean integrated, int speed, Brand brand) {
        this.integrated = integrated;
        this.speed = speed;
        this.brand = brand;
        running();
    }

    @Override
    public void running() {
        System.out.println("GPU is running");
    }

    public boolean isIntegrated() {
        return integrated;
    }

    public int getSpeed() {
        return speed;
    }

    public Brand getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return "GPU{" +
                "integrated=" + integrated +
                ", speed=" + speed +
                ", brand=" + brand +
                '}';
    }
}
