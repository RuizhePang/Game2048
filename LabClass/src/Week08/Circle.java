package Week08;

import java.util.Scanner;

public class Circle {
    private double radius;
    private int x;
    private int y;
    private int id;
    private static int count = 0;

    public Circle() {
        this.id = ++count;
    }

    public Circle(double radius, int x, int y) {
        this.radius = radius;
        this.x = x;
        this.y = y;
        this.id = ++count;
    }

    public void setRadius(double radius) {
        /*Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Please enter the correct radius:");
            radius = sc.nextDouble();
        } while (radius < 0);*/
        this.radius = radius;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double getRadius() {
        return radius;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String toString() {
        return String.format("Circle #%d{radius: %.2f coordinate: (%d,%d)} ",this.id, this.radius, this.x, this.y);
    }
}
