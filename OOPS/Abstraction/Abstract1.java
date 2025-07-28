package Abstracts;
abstract class innerAbstract1{
    public abstract void name();
    public abstract void intro();
}

public class Abstract1 extends innerAbstract1 {
    public void name(){
        System.out.println("hii my name is p v sravanth");
    }
    public void intro(){
        System.out.println(" i am from tadipatri , i was completed my graduation in 2025 in computer science and engineering");
    }
    public static void main(String[] args) {
        Abstract1 obj = new Abstract1();
        obj.name();
        obj.intro();
    }
}
