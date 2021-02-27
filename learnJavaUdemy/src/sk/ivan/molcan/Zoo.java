package sk.ivan.molcan;

public class Zoo {

    public static void main(String[] args) {
        Animal lion = new Animal(10, 50, 'M', "Lion");

        lion.animal();
        lion.sleep();
        lion.eat();
    }

}
