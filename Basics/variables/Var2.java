public class Var2 {
    int a;
    static int b;
    public static void main(String[] args){
        int c;  //local variable
        System.out.println(c);  //
        Var2 obj1 = new Var2();
        System.out.println(obj1.a);
        System.out.println(b);
    }
}
