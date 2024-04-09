package Week02;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1, number2, sum;
        System.out.println("Enter the first integer:");
        number1 = input.nextInt();
        System.out.println("Enter the second integer:");
        number2 = input.nextInt();
        sum = number1 - number2;
        System.out.printf("Sum is %d\n", sum);
    }
}
