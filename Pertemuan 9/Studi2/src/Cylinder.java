public class Cylinder extends Shape {
    protected double radius;
    protected double height;

    public Cylinder(String shapeName, double radius, double height) {
        super(shapeName);
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double area() {
        return Math.PI * (radius * radius) * height;
    }

    @Override
    public String toString() {
        return super.toString() + "of a radius " + radius + "and of a height" + height;
    }
}
