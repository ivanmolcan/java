package sk.ivanmolcan.pc.components;

public class Ram {

    private Brands brand;
    private int frequency;

    public Ram(Brands brand, int frequency) {
        this.brand = brand;
        this.frequency = frequency;
    }

    public Brands getBrand() {
        return brand;
    }

    public void setBrand(Brands brand) {
        this.brand = brand;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return "Ram{" +
                "brand=" + brand.getNazov() +
                ", frequency=" + frequency +
                '}';
    }
}
