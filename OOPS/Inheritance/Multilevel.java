package Inheritance;
class Parent{
    public void m1(){
        System.out.println("m1 method of parent class");
    }
        public void m2(){
        System.out.println("m2 method of parent class");
    }
}
class Child extends Parent{
        public void m3(){
        System.out.println("m3 method of child class");
    }
}
class Grandchild extends Child{
        public void m4(){
        System.out.println("m4 method of grandChild class");
    }
}
public class Multilevel {
    public static void main(String[] args) {
        Grandchild obj1 = new Grandchild();
        obj1.m1();
        obj1.m2();
        obj1.m3();
        obj1.m4();
    }
}
