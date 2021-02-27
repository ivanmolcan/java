package sk.ivanmolcan.pc.components;

public class GraphicCard {
    private Brands brand;

    public GraphicCard(Brands brand) {
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
        return "GraphicCard{" +
                "brand=" + brand.getNazov() +
                '}';
    }
}
