package Week02;

import java.util.Scanner;

public class OJ02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t, dec, yu, n,sep;
        t = sc.nextInt();
        while (t-- > 0) {
            sep = 0;
            n = 1;
            dec = sc.nextInt();
            while (dec >= 1) {
                yu = (dec % 7) * n;
                n = n * 10;
                dec = dec / 7;
                sep = yu + sep;
            }
            System.out.println(sep);
        }
    }
}
