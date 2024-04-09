package Week04;

import java.util.Scanner;

public class exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] array1 = new int[length];
        int[] array2 = new int[length];
        boolean ifEqual=true;
        for (int i = 0; i < length; i++) {
            array1[i] = sc.nextInt();
        }
        for (int i = 0; i < length; i++) {
            array2[i] = sc.nextInt();
        }
        for (int i = 0; i < length; i++) {
            if (array1[i] != array2[i]) {
                ifEqual=false;
                break;
            }
        }
        if(ifEqual){
            System.out.println("The two arrays are equal.");
        }else{
            System.out.println("The two arrays are not equal.");
        }
    }
}
