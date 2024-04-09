package Week05;

import java.util.Arrays;

public class Method03 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        System.out.println("Before: " + Arrays.toString(a));

        triple(a);
        System.out.println("After: " + Arrays.toString(a));
    }

    public static void triple(int[] x) {
        for (int i = 0; i < x.length; i++)
            x[i] *= 3;
    }
}
