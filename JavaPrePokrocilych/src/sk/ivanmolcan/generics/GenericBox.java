package sk.ivanmolcan.generics;

public class GenericBox<P> {
    private P object;

    public void addObject(P object){this.object = object;}

    public P getObject(){return object;}

    public static void main(String[] args) {
        GenericBox<String> stringGenericBox = new GenericBox<>();
        stringGenericBox.addObject("Hello there");

        System.out.println(stringGenericBox.getObject());
    }
}
