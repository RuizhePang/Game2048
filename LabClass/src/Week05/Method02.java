package Week05;

import java.util.Arrays;

public class Method02 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println("Before: " + Arrays.toString(arr));
        arr[0] = triple(arr[0]);
        System.out.println("After: " + Arrays.toString(arr));
    }

    public static int triple(int x) {
        x *= 3;
        return x;
    }
}
