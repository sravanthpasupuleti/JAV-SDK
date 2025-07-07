public class Three{
    public static void main(String[] args){
        String name = "sravanth";
        String name2 = null;
        System.out.println(name);               // nullpointer exception
        System.out.println(name.length());     // keep risky code into try block and solve that by using catch block
        try {
                 System.out.println(name2.length());
        } catch (Exception a) {
            System.out.println(a.getMessage());
        }  
        System.out.println(name2);
    }
}