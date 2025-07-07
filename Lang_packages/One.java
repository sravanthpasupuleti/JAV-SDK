
//every class contains default extend to object
public class One{
    public One(){
        System.out.println("hloo");
    }
    public String toString(){
        return "hllo tostring method";
    }
    public String getClass(){
        return "hllo getClass method";
    }
    public static void main(String[] args){
        One obj1 = new One();
        System.out.println(obj1);
       // System.out.println(obj1.toString());
        //System.out.println(obj1);
        System.out.println(obj1.getClass());
    }
}