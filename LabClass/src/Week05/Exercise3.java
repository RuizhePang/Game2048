package Week05;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row;
        int col;
        System.out.print("Please enter the number of subjects: ");
        row = sc.nextInt();
        System.out.print("Please enter the number of students: ");
        col = sc.nextInt();
        double[][] arr = new double[row + 1][col + 1];
        double[][] transArr = new double[col + 1][row + 1];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < row; i++) {
            double sum = 0.0;
            for (int j = 0; j < col; j++) {
                sum += arr[i][j];
            }
            arr[i][col] = sum / col;
        }
        for (int i = 0; i < col; i++) {
            double sum = 0.0;
            for (int j = 0; j < row; j++) {
                sum += arr[j][i];
            }
            arr[row][i] = sum / row;
        }
        for (int i = 0; i < row + 1; i++) {
            for (int j = 0; j < col + 1; j++) {
                transArr[j][i] = arr[i][j];
            }
        }
        System.out.println("\t\tCourse1\tCourse2\tCourse3\tAverage");
        for (int i = 0; i < col; i++) {
            System.out.printf("Student%d\t", i + 1);
            for (int j = 0; j < row + 1; j++) {
                if (j != row) {
                    System.out.printf(" %.0f\t\t", transArr[i][j] );
                }else{
                    System.out.printf(" %.2f\t\t",transArr[i][j]);
                }
            }
            System.out.println();
        }
        System.out.printf("Average\t\t");
        for (int i = 0; i < row; i++) {
            System.out.printf("%.2f\t",transArr[col][i]);
        }
    }
}
