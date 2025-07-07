package Encapsulation;
class A{
    private String name;
    private int id;
    public void set_name(String std_name){
        this.name = std_name;
    }
    public String get_name(){
        return this.name;
    }
    public void set_id(int std_id){
        this.id = std_id;
    }
    public int get_id(){
        return id;
    }
public class Encapsulation1{
    public static void main(String[] args) {
        A std1 = new A();
        A std2 = new A();
        System.out.println(std1.name);
        std1.set_name("sravanth");
        std1.set_id(1);
        std2.set_name("Royal");
        std2.set_id(2);
        System.out.println("std_name :"+ std1.get_name()+", std_id :" + std1.get_id());
        System.out.println("std_name :"+ std2.get_name()+", std_id :" + std2.get_id());
    }
}
}