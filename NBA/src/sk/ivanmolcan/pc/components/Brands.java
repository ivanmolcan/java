package sk.ivanmolcan.pc.components;

public enum Brands {
    AMD("AMD"),
    INTEL("Intel"),
    NVIDIA("Nvidia"),
    CORSAIR("Corsair"),
    KINGSTON("Kingston"),
    MSI("MSI"),
    ASUS("ASUS"),
    TPLINK("TP-Link");

    private String nazov;

    Brands(String nazov) {
        this.nazov = nazov;
    }

    public String getNazov() {
        return nazov;
    }
}
