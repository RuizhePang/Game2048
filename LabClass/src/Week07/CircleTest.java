package Week07;

import java.util.Random;

public class CircleTest {
    public static void main(String[] args) {
        Random r = new Random();
        int N = r.nextInt(5) + 5;
        Circle[] circles = new Circle[N];
        for (int i = 0; i < N; i++) {
            double radius = r.nextDouble() * 2 + 1;
            double x = r.nextDouble() * 3 + 2;
            double y = r.nextDouble() * 3 + 2;
            circles[i] = new Circle(radius, x, y);
            double distance = circles[i].distanceToOrigin();
            System.out.println(circles[i]);
        }
    }
}
