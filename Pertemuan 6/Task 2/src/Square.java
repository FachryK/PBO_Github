public class Square extends Rectangle {

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public void setSide(double side) {
        super.setWidth(side);
        super.setLenght(side);
    }

    public double getSide(double side) {
        return super.getWidth();
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLenght(side);
    }

    @Override
    public void setLenght(double side) {
        super.setWidth(side);
        super.setLenght(side);
    }

    @Override
    public String toString() {
        return "A Square with side " + super.getWidth() + ", which is a subclass of " + super.toString();
    }

}
