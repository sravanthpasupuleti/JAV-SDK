package Encapsulation;
public class Encapsulation2 {
    public String name;
    private int id;
    public void setname(String givenname){
        this.name=givenname;
    }
    public String getname(){
        return name;
    }

    public static void main(String[] args){
        Encapsulation2 obj = new Encapsulation2();
        obj.setname("hlo");
        System.out.println(obj.getname());
    }
}
