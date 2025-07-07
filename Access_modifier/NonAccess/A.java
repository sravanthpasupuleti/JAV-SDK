public class A{
     int v1 = 1;
    public void m1(){
        System.out.println("interview-1");
    }
    public static void main(String[] args){
        A obj1 = new A();
        obj1.v1 = 2;
        System.out.println(obj1.v1);
    }
}

class B extends A{
    int v2 = 4;
    public void m2(){
        System.out.println("interview-2");
    }
    public static void main(String[] args) {
        A obj2 = new B();
        System.out.println(obj2.v1);
    }
}