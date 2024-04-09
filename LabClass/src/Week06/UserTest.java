package Week06;

import java.util.Scanner;

public class UserTest {
    public static void main(String[] args) {
        User[] users = new User[4];
        Scanner sc = new Scanner(System.in);
        User u1 = new User();
        u1.setAccount("Zhangsan");
        u1.setPassword("123456");
        u1.setMoney(45.0);
        u1.introduce();
        System.out.print("Input your expanse: ");
        u1.expanse(sc.nextDouble());
        u1.introduce();
    }
}
