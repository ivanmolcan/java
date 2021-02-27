package sk.jaroslavbeno.app.biblia.model;

public class Vers {
    private int cislo;
    private String text;

    public int getCislo() {
        return cislo;
    }

    public void setCislo(int cislo) {
        this.cislo = cislo;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Vers{" +
                "cislo=" + cislo +
                ", text='" + text + '\'' +
                '}';
    }
}
