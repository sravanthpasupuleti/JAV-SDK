public class Wrap {
    public static void main(String[] args) {
        int a = 100;
        Integer b = 200;
        String c = "300";
        Integer d = a;  // Integer.valueof(a) autoboxing - primitive to object
        int e = Integer.parseInt(c);
        int f = b.intValue();
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
    }
}
