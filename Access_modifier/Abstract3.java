package Abstract;
abstract class A{
    public abstract void m1();
}
interface B{
    public abstract void m2();
}
class C extends A implements B{
    public void m1(){
        System.out.println("hloo m1 method from A class");
    }
     public void m2(){
        System.out.println("hloo m2 method from B class");
    }
}
public class Abstract3{
    public static void main(String[] args){
        A obj1 = new C();
        B obj2 = new C();
        obj1.m1();
        obj2.m2();
    }
}

//multiple inheritance is not possible in abstract class.