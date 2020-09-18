package app.Prak3;


public class Rectangle extends Shape {

    protected double width;
    protected double length;

    public Rectangle() {}
    
    public Rectangle(double width, double length) {
        this.length = length;
        this.width = width;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        this.length = length;
        this.width = width;
        this.color = color;
        this.filled = filled;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return "Rectangle with width " + this.width + ", length " + this.length + ", color: " + this.color + ", filled: " + this.filled + ",area: " + this.getArea() + ",perimeter: " + this.getPerimeter();
    }
}
