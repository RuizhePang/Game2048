package Week05;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the length of the triangle sides:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        if (isValid(a, b, c)) {
            double area = area(a, b, c);
            double perimeter = perimeter(a, b, c);
            System.out.println("The area of the triangle is " + area);
            System.out.println("The perimeter of the triangle is " + perimeter);
        } else {
            System.out.println("Please enter correct number.");
        }
    }

    public static boolean isValid(double a, double b, double c) {
        return a + b > c && a + c > b && b + c > a && a > 0 && b > 0 && c > 0;
    }

    public static double area(double a, double b, double c) {
        double cosC = (a * a + b * b - c * c) / 2 / a / b;
        double sinC = Math.sqrt(1 - cosC * cosC);
        double area = a * b * sinC / 2;
        return area;
    }

    public static double perimeter(double a, double b, double c) {
        double perimeter = a + b + c;
        return perimeter;
    }
}
