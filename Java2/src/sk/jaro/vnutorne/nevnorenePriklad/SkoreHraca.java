package sk.jaro.vnutorne.nevnorenePriklad;

public class SkoreHraca {
    private int skore;

    //SkoreHraca nevie nic o Hracovi, vsetko mu musi byt podsunute
    public SkoreHraca(int skore) {
        this.skore = skore;
    }

    public int getSkore() {
        return skore;
    }

    public void setSkore(int skore) {
        this.skore = skore;
    }
}
