package sk.ivanmolcan.pc.components;

public class Procesor {
    private double frequency;
    private Brands brand;

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public Brands getBrand() {
        return brand;
    }

    public void setBrand(Brands brand) {
        this.brand = brand;
    }

    public Procesor(double frequency, Brands brand) {
        this.frequency = frequency;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Procesor{" +
                "frequency=" + frequency +
                ", brand=" + brand.getNazov() +
                '}';
    }
}
