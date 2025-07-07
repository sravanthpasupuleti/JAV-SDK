package Encapsulation;
class Emp{
    private int Emp_id;
    private String Emp_name;
    public void set_emp_id(int id){
        this.Emp_id=id;
    }
    public int get_emp_id(){
        return Emp_id;
    }
    public void set_emp_name(String name){
        this.Emp_name=name;
    }
    public String get_emp_name(){
        return Emp_name;
    }
}
public class Employee{
    public static void main(String[] args){
        Emp obj = new Emp();
        obj.set_emp_id(1);
        obj.set_emp_name("Sravanth");
        System.out.println(obj.get_emp_id());
        System.out.println(obj.get_emp_name());
    }
}