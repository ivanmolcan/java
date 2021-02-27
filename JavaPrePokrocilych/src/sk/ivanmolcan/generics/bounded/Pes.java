package sk.ivanmolcan.generics.bounded;

public class Pes {
    private String meno;

    public Pes(){

    }

    public Pes(String meno) {
        this.meno = meno;
    }

    public String getMeno() {
        return meno;
    }

    public void setMeno(String meno) {
        this.meno = meno;
    }

    public void stekaj(){
        System.out.println("HAF HAF");
    }

    @Override
    public String toString() {
        return "Pes{" +
                "meno='" + meno + '\'' +
                '}';
    }
}
