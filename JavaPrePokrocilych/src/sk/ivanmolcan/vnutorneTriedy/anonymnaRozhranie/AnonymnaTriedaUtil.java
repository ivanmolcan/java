package sk.ivanmolcan.vnutorneTriedy.anonymnaRozhranie;

public class AnonymnaTriedaUtil {

    public static void main(String[] args) {
        AnonymnaTriedaUtil util = new AnonymnaTriedaUtil();
        //Nevypise nic lebo VypisNaKonzolu v sebe nema nic
        util.vypisNieco(new VypisNaKonzoluImpl());

        //Toto uz je ina vec
        util.vypisNieco(new IVypisNaKonzolu() {
            @Override
            public void vypisNaSystemOut() {
                System.out.println("VypisNaKonzolu.vypisNaSystemOut");
            }

            @Override
            public void vypisNaSystemErr() {
                System.out.println("VypisNaKonzolu.vypisNaSystemErr");
            }
        });

    }

    public void vypisNieco(IVypisNaKonzolu vypisNaKonzolu){
        vypisNaKonzolu.vypisNaSystemOut();
        vypisNaKonzolu.vypisNaSystemErr();
    }
}
