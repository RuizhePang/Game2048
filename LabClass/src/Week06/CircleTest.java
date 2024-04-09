package Week06;

public class CircleTest {
    public static void main(String[] args) {
        Circle myCircle = new Circle();
        myCircle.setRadius();
        double radius = myCircle.getRadius();
        System.out.println(myCircle.area());
        System.out.println(myCircle.parameter());
    }
}
