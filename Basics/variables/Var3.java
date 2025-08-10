public class Var3{
    static int id = 18;
    int age = 21;
    public void Hlo(){
        System.out.println("hlo sravanth "+id);
        Hi();
    }
    static void Hi(){
        System.out.println("hii");
    }
    public static void main(String[] args){
        Var3 obj = new Var3();
        obj.Hlo();
    }
}