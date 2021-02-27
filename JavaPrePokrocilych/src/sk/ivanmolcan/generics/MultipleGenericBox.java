package sk.ivanmolcan.generics;

import sk.ivanmolcan.Osoba;

public class MultipleGenericBox<P,T> {
    private P object1;
    private T object2;

    public void add(P object1, T object2){
        this.object1 = object1;
        this.object2 = object2;
    }

    public static void main(String[] args) {
        MultipleGenericBox<String,Integer> multipleGenericBox = new MultipleGenericBox<>();
        multipleGenericBox.add("hello", 1);

        MultipleGenericBox<Osoba,String> multipleGenericBox1 = new MultipleGenericBox<>();
        multipleGenericBox1.add(new Osoba("Peter", "Jancovic", 24), "First");
    }
}
