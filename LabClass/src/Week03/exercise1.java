package Week03;

public class exercise1 {
    public static void main(String[] args) {
        double result = 4;
        for (double n = 1; 4 / (n * 2 + 1) >= 0.0000001; n++) {
            if (n % 2 == 0) {
                result += 4 / (n * 2 + 1);
            } else {
                result -= 4 / (n * 2 + 1);
            }
        }
        System.out.println(result);
    }
}
