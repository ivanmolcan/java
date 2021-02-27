package sk.jaroslavbeno.ulohy.uloha1.vynimky;

public class PamateNieSuRovnake extends Exception {
    public PamateNieSuRovnake() {
        super("Do PC sa snažiš vložiť pamate, ktoré nemajú rovnakú velkosť.");
    }
}
