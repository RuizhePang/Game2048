package Week06;

import java.util.Scanner;

public class OJ03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] filed = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                filed[i][j] = sc.nextInt();
            }
        }
        int start = sc.nextInt();
        int k = sc.nextInt();
        int row0 = 0;
        int col0 = 0;
        int times = 1;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (filed[i][j] == start) {
                    row0 = i;
                    col0 = j;
                    break;
                }
            }
        }
        for (int i = 0; i < k; ) {
            for (int j = 0; j < times && i < k; j++) {
                col0++;
                if (col0 <= col - 1 && col0 >= 0 && row0 <= row - 1 && row0 >= 0) {
                    i++;
                }
            }
            for (int j = 0; j < times && i < k; j++) {
                row0++;
                if (col0 <= col - 1 && col0 >= 0 && row0 <= row - 1 && row0 >= 0) {
                    i++;
                }
            }
            times++;
            for (int j = 0; j < times && i < k; j++) {
                col0--;
                if (col0 <= col - 1 && col0 >= 0 && row0 <= row - 1 && row0 >= 0) {
                    i++;
                }
            }
            for (int j = 0; j < times && i < k; j++) {
                row0--;
                if (col0 <= col - 1 && col0 >= 0 && row0 <= row - 1 && row0 >= 0) {
                    i++;
                }
            }
            times++;
        }
        System.out.println(filed[row0][col0]);
    }
}
