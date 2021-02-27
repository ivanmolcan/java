package sk.ivanmolcan.pc.components;

public class NetworkCard {
    private Brands brand;

    public NetworkCard(Brands brand) {
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
        return "NetworkCard{" +
                "brand=" + brand.getNazov() +
                '}';
    }
}
