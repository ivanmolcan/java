package sk.ivan.learn2code.sachy.figurines;

import sk.ivan.learn2code.sachy.enums.Color;

public class Veza extends Figurine implements Moves{
    private Color color;
    private int count;

    public Veza(Color color, int count) {
        this.color = color;
        this.count = count;
    }

    public Color getColor() {
        return color;
    }

    public int getCount() {
        return count;
    }

    @Override
    public void getMove() {
        System.out.println("Veza sa hybe iba po useckach");
    }

    @Override
    public Boolean stateOfChessboard() {
        return null;
    }

    @Override
    public String toString() {
        return "Veza{" +
                "color=" + color +
                ", count=" + count +
                '}';
    }
}
