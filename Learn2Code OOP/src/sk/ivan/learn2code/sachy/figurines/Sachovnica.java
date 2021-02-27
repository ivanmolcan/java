package sk.ivan.learn2code.sachy.figurines;

public class Sachovnica implements Moves {
    private String material;
    private int width;
    private int height;
    private int thickness;
    Boolean state;

    public Sachovnica(String material, int width, int height, int thickness, Boolean state) {
        this.material = material;
        this.width = width;
        this.height = height;
        this.thickness = thickness;
        this.state = state;
    }

    public String getMaterial() {
        return material;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getThickness() {
        return thickness;
    }

    public Boolean getState() {
        return state;
    }

    @Override
    public void getMove() {

    }

    @Override
    public Boolean stateOfChessboard() {
        return getState();
    }

    @Override
    public String toString() {
        return "Sachovnica{" +
                "material='" + material + '\'' +
                ", width=" + width +
                ", height=" + height +
                ", thickness=" + thickness +
                ", state=" + state +
                '}';
    }
}
