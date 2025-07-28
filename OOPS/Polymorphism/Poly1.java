package Polys;

class innerPoly1{
    int id = 18;
    public void name(){
        System.out.println("sravanth");
    }
    public int sum(int a, int b){
        return a+b;
    }
    public int sum(int a , int b , int c){
        return a+b+c;
    }
}

public class Poly1 extends innerPoly1{
    public void name(){
        System.out.println("royal");
    }
    int id = 21;
    public static void main(String[] args) {
        innerPoly1 obj = new Poly1();
        obj.name();
        System.out.println(obj.id);
    }
} 