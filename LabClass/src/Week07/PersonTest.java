package Week07;

public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person(0, 0, 5);
        p.walk(1);
        p.changeDirection();
        p.walk(0);
        System.out.println(p.getI());
        System.out.println(p.getJ());
    }
}
