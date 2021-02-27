package sk.ivan.learn2code;

public class Dog {
//    static final String NAME_OF_SPIECES;

    public static void main(String[] args) {
        int totoCislo;
        String menoPsa = "Rexo";
        int pocetNoh = 4;

        Dog pes = new Dog();
        System.out.println(pes.vratCislo(10,15));
        System.out.println("Po debugu");
    }

    String vratText(){
        return "vraciam text";
    }

    int vratCislo(int a, int b){
        int i = a + b + 100 * 78 -24;
        return i;
    }

    void nicNevrat(){
        System.out.println("Nevraciam nic");
    }

}
