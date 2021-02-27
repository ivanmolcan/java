package sk.ivan.molcan;

public class Animal {

    int age;
    int weight;
    char gender;
    String spiece;

    public Animal(int age, int weight, char gender, String spiece) {
        this.age = age;
        this.weight = weight;
        this.gender = gender;
        this.spiece = spiece;
    }

    public void animal(){
        System.out.println("Animal is " + spiece + " with age " + age + " weight " + weight
                + " and it is gender " + gender);
    }

    public void eat(){
        System.out.println("eating...");
    }

    public void sleep(){
        System.out.println("sleeping...");
    }

}
