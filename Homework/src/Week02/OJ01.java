package Week02;

import java.util.Scanner;

public class OJ01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, l, r, sum, sum0;
        n = input.nextInt();
        while (n-- > 0) {
            sum = 0;
            l = input.nextInt();
            r = input.nextInt();
            l = l - 1;
            while (l++ < r) {
                if (l % 7 == 0) {
                    sum++;
                } else {
                    sum0 = sum;
                    int x = l;
                    while (x > 1) {
                        if (x % 10 == 7 && sum == sum0) {
                            sum++;
                        }
                        x = x / 10;
                    }
                }
            }
            System.out.printf("%d\n", sum);
        }
    }
}

