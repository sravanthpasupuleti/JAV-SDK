public class Classcast{
    public static void main(String[] args){
        Object obj1 = new Object();
        try{
               String s = (String)obj1;
               System.out.println(s);
        }
        catch(ClassCastException ce){
            System.out.println("hloo excetion");
        }
        System.out.println(obj1);
    }
}