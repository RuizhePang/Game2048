package Week02;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N, T, M;
        N = input.nextInt();
        T = input.nextInt();
        M = input.nextInt();
        int sum = 0;
        int x;
        while (T-- > 0) {
            sum = 0;
            int Z = N;
            while (Z-- > 0) {
                x = input.nextInt();
                sum = sum + x;
            }
            System.out.printf("%d\n", sum - M);
        }
    }
}