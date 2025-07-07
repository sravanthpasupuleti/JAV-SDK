package classes;

// import java.util.Arrays;


public class Split{
    public static void main(String[] args){
        String name = "hlo hey java";
        // String names = Arrays.toString(name.split(" "));
        // System.out.println(names);
        // System.out.println(names[0]); 
        for(int i=0; i<name.length(); i++){
            if(name.charAt(i) == ' '){
                for(int j=i-1; j>=0; j--){
                    System.out.print(name.charAt(j));
                }
                i = name.charAt(i);
                System.out.print(" ");
            }
        }
    }
}