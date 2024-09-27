public class TestShape {
    public static void main(String[] args) {
        // Test default constructors
        Shape shape1 = new Shape();
        Circle c1 = new Circle();
        Rectangle r1 = new Rectangle();
        System.out.println("Default constructor: " + shape1.toString());
        System.out.println("Default Circle: " + c1.toString());
        System.out.println("Default Rectangle: " + r1.toString());

        // Test parameterized constructors
        Shape shape2 = new Shape("red", false);
        Circle c2 = new Circle("blue", true, 5.0);
        Rectangle r2 = new Rectangle("yellow", true, 4.0, 2.0);
        Square s2 = new Square(3.0);
        Square s3 = new Square("black",true,3.0);
        System.out.println("Parameterized Shape: " + shape2.toString());
        System.out.println("Parameterized Circle: " + c2.toString());
        System.out.println("Parameterized Rectangle: " + r2.toString());
        System.out.println("Parameterized Square: " + s2.toString());
        System.out.println("Parameterized Square: " + s3.toString());

        // Test getters and setters for Shape
        System.out.println("Shape2 color: " + shape2.getColor());
        System.out.println("Shape2 filled: " + shape2.isFilled());
        shape2.setColor("blue");
        shape2.setFilled(true);
        System.out.println("After setting new values: " + shape2.toString());

        // Test getters and setters for Circle
        System.out.println("Circle2 radius: " + c2.getRadius());
        c2.setRadius(10.0);
        System.out.println("After setting new radius: " + c2.toString());

        // Test area and perimeter methods
        System.out.println("Circle2 area: " + c2.getArea());
        System.out.println("Circle2 perimeter: " + c2.getPerimeter());
        System.out.println("Rectangle2 area: " + r2.getArea());
        System.out.println("Rectangle2 perimeter: " + r2.getPerimeter());
        System.out.println("Square2 area: " + s2.getArea());
        System.out.println("Square2 perimeter: " + s2.getPerimeter());
    }
}
