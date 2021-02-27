package sk.ivan.molcan;

public class Sparrow extends Bird implements Flyable{

    public Sparrow(int age, int weight, char gender, String spiece) {
        super(age, weight, gender, spiece);
    }

    @Override
    public void fly() {
        System.out.println("Flying");
    }
}
