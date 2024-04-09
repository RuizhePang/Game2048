package Week02;

import java.util.Scanner;

public class DataType {
    public static void main(String[] args) {
        String name;
        int age;
        float weight;
        char grade;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name:");
        name = input.next();
        System.out.println("Enter your age:");
        age = input.nextInt();
        System.out.println("Enter your weight:");
        weight = input.nextFloat();
        System.out.println("Enter your grade");
        grade = input.next().charAt(0);
        System.out.printf("Your are %s.\nYou are %d years old.\n", name, age);
        System.out.printf("Your weight is %.1f KG.\nYour grade is %c.", weight, grade);
        //%.1f means that remain 1 decimal place.
    }
}
