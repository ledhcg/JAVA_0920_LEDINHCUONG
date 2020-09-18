package app.Prak3;


public class Circle extends Shape {
    private double radius;
    public Circle() {}

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return Math.PI * 2 * radius;
    }

    @Override
    public String toString() {
        return "Circle with radius: " + this.radius + ", color: " + this.color + ", filled: " + this.filled + ", area: " + this.getArea() + ", perimeter: " + this.getPerimeter();
    }
}
