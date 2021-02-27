package sk.ivanmolcan.pc.components;

public class Mainboard {

    private Brands brand;

    public Mainboard(Brands brand) {
        this.brand = brand;
    }

    public Brands getBrand() {
        return brand;
    }

    public void setBrand(Brands brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Mainboard{" +
                "brand=" + brand.getNazov() +
                '}';
    }
}
