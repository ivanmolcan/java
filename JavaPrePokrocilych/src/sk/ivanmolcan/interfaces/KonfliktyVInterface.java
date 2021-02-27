package sk.ivanmolcan.interfaces;

public class KonfliktyVInterface implements DefaultMethodInterface, AnotherInterface{

    @Override
    public void zastavSa() {

    }

    @Override
    public void pohniSa() {

    }

    @Override
    public void chodSam() {
        AnotherInterface.super.chodSam();
        DefaultMethodInterface.super.chodSam();
        System.out.println("KonfliktyVInterface");
    }

    public static void main(String[] args) {
        KonfliktyVInterface konf = new KonfliktyVInterface();
        konf.chodSam();
    }
}
