package sk.ivan.learn2code.sachy.figurines;

import sk.ivan.learn2code.sachy.enums.Color;

public class Dama extends Figurine implements Moves {
    private Color color;
    private int count;

    public Dama(Color color, int count) {
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
        System.out.println("dama sa hybe v rovno a aj sikmo");
    }

    @Override
    public Boolean stateOfChessboard() {
        return null;
    }

    @Override
    public String toString() {
        return "Dama{" +
                "color=" + color +
                ", count=" + count +
                '}';
    }
}
