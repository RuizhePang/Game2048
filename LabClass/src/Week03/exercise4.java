package Week03;

import java.util.Scanner;

public class exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int month = sc.nextInt();
        int day = sc.nextInt();
        int dayOfYear = 0;
        boolean isLeapYear = ((year % 4 == 0 && year % 100 != 0) | year % 400 == 0);
        for (int i = 1; i < month; i++) {
            switch (i) {
                case 1, 3, 5, 7, 8, 10, 12:
                    dayOfYear += 31;
                    break;
                case 4, 6, 9, 11:
                    dayOfYear += 30;
                    break;
                default:
                    dayOfYear += (isLeapYear) ? 29 : 28;//?表示当isLeapYear为true，则其值为29；为false，则其值为28.
                    break;
            }
        }
        dayOfYear += day;
        System.out.println(dayOfYear);
    }
}
