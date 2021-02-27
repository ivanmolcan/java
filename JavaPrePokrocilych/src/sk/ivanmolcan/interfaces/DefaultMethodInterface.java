package sk.ivanmolcan.interfaces;

public interface DefaultMethodInterface {

    void zastavSa();
    void pohniSa();

    default void chodSam(){
        System.out.println("DefaultMethodInterface");
    };
}
