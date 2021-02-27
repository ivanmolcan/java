package sk.ivan.learn2code.triedy;

public class Kniha {

    static{
        System.out.println("static inic");
    }
    private int pocetStran;

    public Kniha(int pocetStran) {
        this.pocetStran = pocetStran;
    }

    public int getPocetStran() {
        return pocetStran;
    }

    public void setPocetStran(int pocetStran) {
        this.pocetStran = pocetStran;
    }

    public void otvorenie(){
        System.out.println("Kniha sa otvorila");
    }

    public static void main(String[] args) {
        Kniha kniha = new Kniha(346);
        System.out.println(kniha.getPocetStran());
        kniha.setPocetStran(450);
        System.out.println(kniha.getPocetStran());
    }
}
