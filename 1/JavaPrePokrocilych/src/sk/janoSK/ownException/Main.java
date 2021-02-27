package sk.janoSK.ownException;

public class Main {
    public static void main(String[] args) {
        Clovek clovek = new Clovek("Jozko", "Mrkvicka", 17, 150.00);

        try {
            Vynimky.skontrolujCloveka(clovek);
        } catch (NedostatocnaSumaException e) {
            e.printStackTrace();
        }

    }
}
