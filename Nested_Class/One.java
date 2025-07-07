class A{
    String name = "Sravanth";
    int id = 18;
    class B{
        public void B1(){
            System.out.println("hloo B1");
        }
    }
}

public class One{
    public static void main(String[] args) {
        A obj1 = new A();
        A.B obj2 = obj1.new  B();
        System.out.println(obj1.name);
        obj2.B1();
    }
}