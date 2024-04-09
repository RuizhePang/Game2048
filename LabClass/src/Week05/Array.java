package Week05;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[][] arr = new int[3][];
        System.out.println(arr);
        arr[0]=new int[]{1,2,3};
        arr[1]=arr[0];
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr[0]));
    }
}
