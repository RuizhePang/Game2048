package Week04;

import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args) {
        double max;
        double min;
        double sum;
        double average;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] studentsScore = new double[n];
        for (int i = 0; i < studentsScore.length; i++) {
            studentsScore[i] = sc.nextDouble();
        }
        max = studentsScore[0];
        min = studentsScore[0];
        sum = 0;
        for (int i = 0; i < studentsScore.length; i++) {
            sum += studentsScore[i];
            if (studentsScore[i] > max) {
                max = studentsScore[i];
            }
            if (studentsScore[i] < min) {
                min = studentsScore[i];
            }
        }
        average=(sum-min-max)/(n-2);
        System.out.printf("%1.f",average);
    }
}
