package Week04;

import java.util.Scanner;

public class OJ03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfBalloons = sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();
        int accommodating = 0;
        int[][] playground = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                playground[i][j] = sc.nextInt();
            }
        }
        //把邻格内的数字都改为2。
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (playground[j][i] == 1 && j != 0 && j != m - 1) {
                    if (playground[j + 1][i] != 1) {
                        playground[j - 1][i] = 2;
                        playground[j + 1][i] = 2;
                    } else {
                        playground[j - 1][i] = 2;
                    }
                } else if (playground[j][i] == 1 && j == 0 && m != 1) {
                    playground[j + 1][i] = 2;
                } else if (playground[j][i] == 1 && j == m - 1 && m != 1) {
                    playground[j - 1][i] = 2;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (playground[j][i] == 0 && j != m - 1) {
                    accommodating++;
                    playground[j + 1][i] = 2;
                } else if (playground[j][i] == 0 && j == m - 1) {
                    accommodating++;
                }
            }
        }
        if (accommodating >= numOfBalloons) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
