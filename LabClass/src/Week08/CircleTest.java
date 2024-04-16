package Week08;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        Circle[] circles = new Circle[r.nextInt(3) + 3];
//        for (int i = 0; i < circles.length; i++) {
//            double radius = r.nextDouble() * 2 + 1;//radius [1,3]
//            int x = r.nextInt(4) + 2;
//            int y = r.nextInt(4) + 2;
//            System.out.println(x);
//            circles[i] = new Circle(radius, x, y);
//            //circles[i].getX()++;
//            //System.out.println(circles[i]);
//        }
        Circle circle=new Circle(2,3,3);
        circle.setStrings(new ArrayList<>());
        circle.getStrings().add("b");
        circle.getStrings().add("c");
        circle.getStrings().set(1,null);
        System.out.println(circle.getStrings().get(1));
        System.out.println(circle.getStrings().size());
    }
}
