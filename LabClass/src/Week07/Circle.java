package Week07;

public class Circle {
    private double radius;
    private double x;
    private double y;

    public Circle() {
    }

    public Circle(double radius, double x, double y) {
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distanceToOrigin() {
        return Math.sqrt((Math.pow(this.x, 2.0) + Math.pow(this.y, 2.0)));
    }

    public String toString() {
        return String.format("Circle{radius = %.2f, x = %.2f, y = %.2f}", radius, x, y);
    }
}
