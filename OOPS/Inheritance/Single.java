package Inheritance;
class Parent{
    public void m1(){
        System.out.println("m1 method class Parent");
    }
     public void m2(){
        System.out.println("m2 method class Parent");
    }
}
class Child extends Parent{
        public void m3(){
            System.out.println("main method m3");
        }
}
public class Single{
    public static void main(String[] args) {
        Parent obj1 = new Parent();
        obj1.m1();
        obj1.m2();
        //obj1.m3();
        Child obj2 = new Parent();
    }
}