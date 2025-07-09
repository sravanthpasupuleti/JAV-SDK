package Classes;

interface One1{
    int m1();
}

public class One{
    public static void main(String[] args) {
        One1 obj1 = () -> {
            int age = 21;
            return age;
        };
        System.out.println(obj1.m1());
    }
}