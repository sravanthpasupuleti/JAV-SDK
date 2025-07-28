package Abstracts;

interface innerinterface1{
    int sum(int a, int b);
    String name(String name);
    // public static void main(String[] args){
    //     interface1 obj = new interface1();
    //     System.out.println(sum(2 , 4));
    // }
}

public class interface1 implements innerinterface1{
    public int sum(int a, int b){
        return a+b;
    }
    public String name(String name){
        return "hloo " + name;
    }
    public static void main(String[] args) {
        interface1 obj = new interface1();
        System.out.println(obj.sum(2, 4));
        System.out.println(obj.name("sravanth"));
         
    }
}
