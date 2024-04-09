package Week04;

import java.util.Scanner;

public class exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] times = new int[100];
        int sample;
        for (; ; ) {
            sample = sc.nextInt();
            if (sample == 0) {
                break;
            }
            times[sample]++;
        }
        for (int i = 0; i < times.length; i++) {
            switch (times[i]) {
                case 0 :
                    break;
                case 1 :
                    System.out.printf("%2d occurs %2d time\n",i,1);
                    break;
                default:
                    System.out.printf("%2d occurs %2d times\n",i,times[i]);
            }
        }

    }
}
