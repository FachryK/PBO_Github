
public abstract class Shape {
    protected String shapeName;

    public abstract double area();

    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    public String toString() {
        return "Shape [shapeName=" + shapeName + "]";
    }

}
