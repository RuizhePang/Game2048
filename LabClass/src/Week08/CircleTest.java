package Week08;

import java.util.Random;
import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        Circle[] circles = new Circle[r.nextInt(3) + 3];
        for (int i = 0; i < circles.length; i++) {
            double radius = r.nextDouble() * 2 + 1;//radius [1,3]
            int x = r.nextInt(4) + 2;
            int y = r.nextInt(4) + 2;
            circles[i] = new Circle(radius, x, y);
            System.out.println(circles[i]);
        }
    }
}
