package Week06;

import java.util.Scanner;

public class Circle {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius() {
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        if (radius <= 0) {
            System.out.println("Please enter the correct number.");
            System.exit(0);
        } else {
            this.radius = radius;
        }
    }

    public double getRadius() {
        return radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double parameter(){
        return 2 * Math.PI * radius;
    }
}
