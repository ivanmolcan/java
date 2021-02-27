package sk.ivan.learn2code.triedy;

import sk.ivan.learn2code.SvetoveStrany;

public class Mammal implements Zviera{
    @Override
    public void makeNoise() {
         System.out.println("Mammal make noise");
    }

    @Override
    public void move(SvetoveStrany strany) {

    }

    @Override
    public void eat(String food) {

    }

    public static void main(String[] args) {
        Mammal cicavec = new Mammal();
        cicavec.makeNoise();
    }
}
