package Week02;

import java.util.Scanner;

public class OJ03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        int year1, month1, day1;
        int year2, month2, day2;
        int result;
        t = sc.nextInt();
        while (t-- > 0) {
            result = 0;
            year1 = sc.nextInt();
            month1 = sc.nextInt();
            day1 = sc.nextInt();
            year2 = sc.nextInt();
            month2 = sc.nextInt();
            day2 = sc.nextInt();
            //Situation 1 : year1<year2
            for (; year1 < year2; year1++) {
                if (year1 % 13 == 0) {
                    for (; month1 <= 15; month1++) {
                        if (month1 == 3 | month1 == 5) {
                            result += 62 - day1;
                        } else {
                            result += 61 - day1;
                        }
                        day1 = 0;
                    }
                } else {
                    for (; month1 <= 15; month1++) {
                        if (month1 == 5) {
                            result += 62 - day1;
                        } else {
                            result += 61 - day1;
                        }
                        day1 = 0;
                    }
                }
                month1 = 1;
            }
            //Situation 2 : year1=year2
            if (year2 % 13 == 0) {
                for (; month1 < month2; month1++) {
                    if (month1 == 3 | month1 == 5) {
                        result += 62 - day1;
                    } else {
                        result += 61 - day1;
                    }
                    day1 = 0;
                }
            } else {
                for (; month1 < month2; month1++) {
                    if (month1 == 5) {
                        result += 62 - day1;
                    } else {
                        result += 61 - day1;
                    }
                    day1 = 0;
                }
            }
            result += day2 - day1;
            System.out.println(result);
        }
    }
}
