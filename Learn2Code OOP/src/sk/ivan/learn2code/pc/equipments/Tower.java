package sk.ivan.learn2code.pc.equipments;

import sk.ivan.learn2code.pc.enums.Brand;
import sk.ivan.learn2code.pc.enums.Material;

public class Tower {
    private Material mat;
    private Brand brand;

    public Tower(Material mat, Brand brand) {
        this.mat = mat;
        this.brand = brand;
    }

    public Material getMat() {
        return mat;
    }

    public Brand getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return "Tower{" +
                "mat=" + mat +
                ", brand=" + brand +
                '}';
    }
}
