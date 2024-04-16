import java.util.ArrayList;

public class StringTest {
    public static void main(String[] args) {
//        String s1 = "abc";
//        StringBuilder buffer = new StringBuilder();
//        buffer.append(s1);
//        System.out.println(buffer);
//        buffer.setLength(10);
//        System.out.println(buffer);
//        System.out.println(buffer.length());
//        buffer.setLength(2);
//        System.out.println(buffer);
        ArrayList<Integer> a =new ArrayList<>();
        ArrayList<Integer> b =new ArrayList<>();
        a.add(1);
        b.add(1);
        System.out.println(a.get(0)==b.get(0));

    }
}
