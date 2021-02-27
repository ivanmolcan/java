package sk.ivan.learn2code.obyvacka;

import sk.ivan.learn2code.obyvacka.enums.Material;

public class Okno extends Obyvacka{

    private Material mat;
    private String direction;

    @Override
    public String otvor(String direction) {
        return "Okno sa otvorilo " + direction;
    }

    public Okno(Material mat, String direction) {
        this.mat = mat;
        this.direction = direction;
    }

    public Material getMat() {
        return mat;
    }

    public String getDirection() {
        return direction;
    }

    @Override
    public String toString() {
        return "Okno{" +
                "mat=" + mat +
                ", direction='" + direction + '\'' +
                '}';
    }
}
