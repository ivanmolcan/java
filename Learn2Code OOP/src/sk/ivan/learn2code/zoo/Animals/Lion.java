package sk.ivan.learn2code.zoo.Animals;

import sk.ivan.learn2code.zoo.Behavior.Carnivore;

public class Lion extends Mammal implements Carnivore {
    @Override
    public void eatMeat() {
        System.out.println("Lion eats meat.");
    }
}
