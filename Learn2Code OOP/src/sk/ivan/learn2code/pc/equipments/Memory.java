package sk.ivan.learn2code.pc.equipments;

import sk.ivan.learn2code.pc.enums.Brand;

public class Memory implements Services {
    private int count;
    private int speed;
    private Brand brand;

    public Memory(int count, int speed, Brand brand) {
        this.count = count;
        this.speed = speed;
        this.brand = brand;
        running();
    }

    @Override
    public void running() {
        System.out.println("Memories are running");
    }

    public int getCount() {
        return count;
    }

    public int getSpeed() {
        return speed;
    }

    public Brand getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return "Memory{" +
                "count=" + count +
                ", speed=" + speed +
                ", brand=" + brand +
                '}';
    }
}
