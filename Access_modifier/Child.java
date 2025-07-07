package Abstract;
abstract class Abstract1{
    String name = "sravanth";
    public void m1(){
        System.out.println("m1");
    }
    public abstract void m2();
}
class Child extends Abstract1{
        public void m2(){
        System.out.println("hllo m2");
       }
    public static void main(String[] args){
    Child obj  = new Child();
    System.out.println(obj.name);
    obj.m1();
    obj.m2();
    }
}