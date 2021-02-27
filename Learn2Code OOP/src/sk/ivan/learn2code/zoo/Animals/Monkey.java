package sk.ivan.learn2code.zoo.Animals;

import sk.ivan.learn2code.zoo.Behavior.Herbivore;

public class Monkey extends Mammal implements Herbivore {
    @Override
    public void eatVegetables() {
        System.out.println("Monkey eats vegetable.");
    }
}
