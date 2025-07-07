package Interface;
interface A{
   void login();      
   void logout();
}
interface Z{
    void hlo();
}
class B implements A,Z{
    public void login(){
        System.out.println("login");
    }
     public void logout(){
        System.out.println("logout");
    }
    public void hlo(){
        System.out.println("this is Z clas method hloo");
    }
}

public class Interface1{
    public static void main(String[] args){
        A obj1 = new B();
        Z obj2 = new B();
        obj1.login();
        obj1.logout();
        obj2.hlo();
    }
}
