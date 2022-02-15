package components;

public class Tyre {

    private String tyreType;
    private int radius;

    public Tyre(String tyreType, int radius) {
        this.tyreType = tyreType;
        this.radius = radius;
    }

    public String getTyreType() {
        return tyreType;
    }

    public int getRadius() {
        return radius;
    }
}
