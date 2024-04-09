package Week05;

import java.util.Scanner;

public class MethodMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = max(a, b);
        System.out.println(c);
    }

    public static int max(int x, int y) {
        if (x >= y) {
            return x;
        } else {
            return y;
        }
    }
}
