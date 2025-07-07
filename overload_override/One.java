class A{
    public void m1(){
        System.out.println("hloo A class  m1");
    }
    public void m1(int a){
        System.out.println("hloo m1 "+a);
    }
    public void m1(String a){
        System.out.println("hloo m1 "+a);
    }
}

class B extends A{
    public void m1(){
        System.out.println("hloo B class m1");
    }
}

public class One{
    public static void main(String[] args)
    {
        B obj2 = new B();
        obj2.m1(2);
    }
}