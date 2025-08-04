import java.util.HashSet;
import java.util.LinkedHashSet;

public class One{
    public static void main(String[] args){
        HashSet s = new HashSet<>();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(3);
        s.add(3);
        s.add(null);
        s.add("hloo");

        System.out.println(s);
        for (Object elem : s) {
            System.out.println(elem);
        }

        System.out.println("   ");

        LinkedHashSet lhs = new LinkedHashSet<>();
        lhs.add(1);
        lhs.add(2);
        lhs.add(3);
        lhs.add(3);
        lhs.add(3);
        lhs.add("hloo");
        s.add(null);

        System.out.println(lhs);
        for (Object elem : lhs) {
            System.out.println(elem);
        }
    }
}