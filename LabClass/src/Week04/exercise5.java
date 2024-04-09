package Week04;

import java.util.Scanner;

public class exercise5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int temp;
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < length; i++) {
            int z = i;
            for (int j = i - 1; j >= 0; j--) {
                for (; array[z] < array[j]; z--) {
                    temp = array[z];
                    array[z] = array[j];
                    array[j] = temp;
                }
            }
        }
        for (int element : array) {
            System.out.print(element + " ");
        }
    }
}
