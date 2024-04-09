package Week04;

public class array {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 4, 5, 7, 5, 4, 5, 9};
        int[] arr2 = new int[9];
        char[] arr3 = {'a', 'b', 'c'};
        System.out.println(arr2);
        arr2 = arr1;
        System.out.println(arr1);
        System.out.println(arr2);
        System.out.println(arr3);//print: abc; char类型数组可直接全部打印出
    }
}
