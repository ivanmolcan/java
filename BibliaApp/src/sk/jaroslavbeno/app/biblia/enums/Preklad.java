package sk.jaroslavbeno.app.biblia.enums;

public enum Preklad {
    SEVP("Slovenský evnajelický preklad");

    private String nazov;

    Preklad(String nazov) {
        this.nazov = nazov;
    }

    public String getNazov() {
        return nazov;
    }
}
