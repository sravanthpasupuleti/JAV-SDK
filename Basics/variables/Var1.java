public class Var1{
    int a = 20;
    int b = 30;
    static int c = 10;
    public static void main(String[] args){
        // how to accesss static variable : using directly , using object , using class name 
       Var1 obj1 = new Var1();
        System.out.println(obj1.a);
        obj1.a = 15;
        System.out.println(obj1.a + obj1.b + c);
        obj1.c = 50;
        System.out.println(c);
        System.out.println(Var1.c);
    }
}

