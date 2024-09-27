public class Rectangle extends Shape {
    public double width;
    public double lenght;

    public Rectangle() {
        width = 1.0;
        lenght = 1.0;
    }

    public Rectangle(double width, double lenght) {
        this.width = width;
        this.lenght = lenght;
    }

    public Rectangle(String color, boolean filled, double width, double lenght) {
        super(color, filled);
        this.width = width;
        this.lenght = lenght;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public double getArea() {
        return width * lenght;
    }

    public double getPerimeter()
    {
        return (2 * (width + lenght));
    }
    public String toString() {
        return "A Rectangle with width = " + width + " and length = " + lenght + ", which is a subclass of " + super.toString();
    }
}
