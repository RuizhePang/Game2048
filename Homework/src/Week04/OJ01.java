package Week04;

import java.util.Scanner;

public class OJ01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfQuestion;
        double scoreOfQi = 0;
        double scoreOfCompetitor = 0;
        numberOfQuestion = sc.nextInt();
        int[] scoreOfQuestion = new int[numberOfQuestion];
        int[] ifTrueOfQi = new int[numberOfQuestion];
        int[] ifTrueOfCompetitor = new int[numberOfQuestion];
        for (int i = 0; i < numberOfQuestion; i++) {
            scoreOfQuestion[i] = sc.nextInt();
        }
        for (int i = 0; i < numberOfQuestion; i++) {
            ifTrueOfQi[i] = sc.nextInt();
        }
        for (int i = 0; i < numberOfQuestion; i++) {
            ifTrueOfCompetitor[i] = sc.nextInt();
        }
        for (int i = 0; i < numberOfQuestion; i++) {
            switch (ifTrueOfQi[i]) {
                case 2:
                    scoreOfQi += scoreOfQuestion[i];
                    break;
                case 1:
                    scoreOfQi -= scoreOfQuestion[i];
                    break;
                case 0:
                    scoreOfQi -= scoreOfQuestion[i] / 2.0;
                    break;
                default:
                    System.exit(0);
            }
            switch (ifTrueOfCompetitor[i]) {
                case 2:
                    scoreOfCompetitor += scoreOfQuestion[i];
                    break;
                case 1:
                    scoreOfCompetitor -= scoreOfQuestion[i];
                    break;
                case 0:
                    scoreOfCompetitor -= scoreOfQuestion[i] / 2.0;
                    break;
                default:
                    System.exit(0);
            }
        }
        if (scoreOfQi > scoreOfCompetitor) {
            System.out.println("Qi won");
        } else if (scoreOfQi < scoreOfCompetitor) {
            System.out.println("Qi lost");
        } else {
            System.out.println("Qi need another round");
        }
    }
}
