class A{
    public A(){
        System.out.println("hloo first A constructor");
    }
    A(int hlo){
        System.out.println("hloo second A construvtor"+hlo);
    }
}

class B extends A{
    public B(){
        System.out.println("hlo first B constructor");
    }
    public B(int num2){
                this();
        System.out.println("hloo second B constructor"+num2);
    }
}

public class One{
    public static void main(String[] args){
        System.out.println("Main method");
        B obj1 = new B(2);
    }
}