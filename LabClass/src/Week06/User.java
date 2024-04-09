package Week06;

import java.util.Scanner;

public class User {
    private String account;
    private String password;
    private double money;

    public void User() {
    }

    public void User(String account, String password, double money) {
        this.account = account;
        this.password = password;
        this.money = money;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getAccount() {
        return this.account;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return this.password;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double getMoney() {
        return this.money;
    }

    public void introduce() {
        System.out.println(this.account + "'s account has a balance of " + this.money + " dollars.");
    }

    public void expanse(double a) {
        Scanner sc = new Scanner(System.in);
        String inputPassword;
        System.out.println("Plan to expand " + a + " dollars.");
        for (int i = 1; i <= 3; i++) {
            System.out.println("Please input your password:");
            inputPassword = sc.nextLine();
            if (inputPassword.equals(password)) {
                if (this.money >= a) {
                    this.money = this.money - a;
                    System.out.println("Expand " + a + " dollars and balance " + this.money + " dollars.");
                } else {
                    System.out.printf("Plan to expense %.2f dollar but no sufficient funds\n", a);
                }
                break;
            } else {
                System.out.printf("password error, there are %d time to try.\n", 3 - i);
            }
            if (i == 3) {
                System.out.println("password error, expanse failed.");
            }
        }
    }
}
