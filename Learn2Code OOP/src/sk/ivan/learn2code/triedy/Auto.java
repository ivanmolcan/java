package sk.ivan.learn2code.triedy;

public class Auto {
    int doorCount;
    String brand;
    String plateNumber;

    //Konstruktor
    public Auto(int doorCount, String brand, String plateNumber){
        this.doorCount = doorCount;
        this.brand = brand;
        this.plateNumber = plateNumber;
    }

    public static void main(String[] args) {
        Auto skoda = new Auto(4, "Skoda", "123");
    }
}
