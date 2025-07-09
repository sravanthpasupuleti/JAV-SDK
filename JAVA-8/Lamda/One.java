package Lamda;

@FunctionalInterface
interface One1{
    void m1();
}

class One2 implements One1{
    public void m1(){
        System.out.println("implements method");
    }
}

public class One{
    public static void main(String[] args){
        One1 obj1 = new One2();
        obj1.m1();

        One1 obj2 = new One1() {
            public void m1(){
        System.out.println("Anonymous functoin");
            }
        };
        obj2.m1();

        One1 obj3 = () -> {System.out.println("Lamda expression");};
        obj3.m1();
    }
}