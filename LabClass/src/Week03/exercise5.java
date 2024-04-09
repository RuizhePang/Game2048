package Week03;

public class exercise5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%d*%d=%2d\t", j, i, i * j);//%2d表示二位数输出，若一位则前面补空格。
            }
            System.out.println();
        }
    }
}
