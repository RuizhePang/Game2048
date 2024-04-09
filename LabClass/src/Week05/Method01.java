package Week05;

public class Method01 {
    public static void main(String[] args) {
        int a = 1, b = 2;
        int c = test(a);
        int d = test(b);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }

    public static int test(int x) {
        x++;
        return x;
    }
}
