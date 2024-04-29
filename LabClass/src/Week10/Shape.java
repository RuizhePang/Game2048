package Week10;

public class Shape {
    private double x;
    private double y;
    private static int screenSize = 10;
    private static CircleColor color = CircleColor.GRAY;

    public Shape() {
    }

    public Shape(double x, double y) {
        this.x = x;
        this.y = y;
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

    public static int getScreenSize() {
        return screenSize;
    }

    public static void setScreenSize(int screenSize) {
        Shape.screenSize = screenSize;
    }

    public static CircleColor getColor() {
        return color;
    }

    public static void setColor(CircleColor color) {
        Shape.color = color;
    }

    public void checkColor(){
        if()
    }
}
