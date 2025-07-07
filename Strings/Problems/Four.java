package classes;

//reverse a string
public class Four{
    public static void main(String[] args){
        String s = "Hello World";
        for(int i=s.length() - 1; i>=0; i--){
            System.out.print(s.charAt(i));
        }
        // System.out.println(s.length());
        // System.out.println(s.charAt(0));
        // System.out.println(s.charAt(1));
    }
}