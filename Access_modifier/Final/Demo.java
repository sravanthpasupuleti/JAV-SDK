class parent{
    public void m1(){
        System.out.println("this is parent m1");
    }
}
class child extends parent{
    //  public void m1(){
    //     System.out.println("this is child m1");
    // }
    public static void main(String[] args){        
        child obj = new child();
        obj.m1();
    }
}
public class Demo{
    
}