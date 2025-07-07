package Abstract;
abstract class A{}
abstract class B{
    int login(){
        return 4;
    }
    abstract boolean Pwd();
    abstract String m1();
}
abstract class C extends B{
    boolean Pwd(){
        return true;
    }
    String m1(){
        return "hloo";
    }
    abstract void m2();
}
class D extends C{
    void m2(){
        System.out.println("hloo");
    }
}
public class Abstract2 {   
    public static void main(String[] args){
            D obj = new D();
            System.out.println(obj.login());
            System.out.println(obj.Pwd());
            System.out.println(obj.m1());
            obj.m2();
    }
}
