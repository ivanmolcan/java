package sk.ivan.learn2code.sachy.figurines;

import sk.ivan.learn2code.sachy.enums.Color;

public class Kon extends Figurine implements Moves {
    private Color color;
    private int count;

    public Kon(Color color, int count) {
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
        System.out.println("Kon sa hybe L paternom");
    }

    @Override
    public Boolean stateOfChessboard() {
        return null;
    }

    @Override
    public String toString() {
        return "Kon{" +
                "color=" + color +
                ", count=" + count +
                '}';
    }
}
