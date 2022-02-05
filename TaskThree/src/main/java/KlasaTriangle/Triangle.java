package KlasaTriangle;

public class Triangle {

    private int weight;
    private int height;

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }
}
