package sk.jaroslavbeno.nba.utils;

public class Height {
    private int feet;
    private int inches;
    private int centimeters;

    public Height(int feet, int inches, int centimeters) {
        this.feet = feet;
        this.inches = inches;
        this.centimeters = centimeters;
    }

    public int getFeet() {
        return feet;
    }

    public void setFeet(int feet) {
        this.feet = feet;
    }

    public int getInches() {
        return inches;
    }

    public void setInches(int inches) {
        this.inches = inches;
    }

    public int getCentimeters() {
        return centimeters;
    }

    public void setCentimeters(int centimeters) {
        this.centimeters = centimeters;
    }
}
