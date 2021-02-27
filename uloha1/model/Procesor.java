package sk.jaroslavbeno.ulohy.uloha1.model;

public class Procesor {

    private String vyrobca;
    private String frekvencia;

    public Procesor(String vyrobca, String frekvencia) {
        this.vyrobca = vyrobca;
        this.frekvencia = frekvencia;
    }

    public String getVyrobca() {
        return vyrobca;
    }

    public String getFrekvencia() {
        return frekvencia;
    }

    @Override
    public String toString() {
        return "Procesor{" +
                "vyrobca='" + vyrobca + '\'' +
                ", frekvencia='" + frekvencia + '\'' +
                '}';
    }
}
