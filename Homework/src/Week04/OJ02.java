package Week04;

import java.util.Scanner;

public class OJ02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        int nOfQi = sc.nextInt();
        int[] movieListOfQi = new int[nOfQi];
        for (int i = 0; i < nOfQi; i++) {
            movieListOfQi[i] = sc.nextInt();
        }
        int nOfFriend1 = sc.nextInt();
        int[] movieListOfFriend1 = new int[nOfFriend1];
        for (int i = 0; i < nOfFriend1; i++) {
            movieListOfFriend1[i] = sc.nextInt();
        }
        int nOfFriend2 = sc.nextInt();
        int[] movieListOfFriend2 = new int[nOfFriend2];
        for (int i = 0; i < nOfFriend2; i++) {
            movieListOfFriend2[i] = sc.nextInt();
        }
        for (int i = 0; i < nOfQi; i++) {
            for (int j = 0; j < nOfFriend1; j++) {
                for (int k = 0; k < nOfFriend2; k++) {
                    if (movieListOfQi[i] == movieListOfFriend1[j] && movieListOfQi[i] == movieListOfFriend2[k]) {
                        result++;
                    }
                }
            }
        }
        System.out.println(result);
    }
}
