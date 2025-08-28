@FunctionalInterface
interface Dao{
    void login();
    // void logout();
} 
public class Daoimpl implements Dao{
    public void login(){
        System.out.println("login success");
    }
    public void logout(){
        System.out.println("login success");
    }
    public static void main(String[] args){
        Dao obj1 = new Daoimpl();
        obj1.login();
    }
}