package Optional;

import java.util.Optional;

public class One{
    public static void main(String[] args){
        // try{
        //     String name = null;
        //     System.out.println(name.length());
        // }
        // catch(NullPointerException npe){
        //     System.out.println("that is null value");
        // }

        String name = "null";
        Optional<String> op = Optional.ofNullable(name);
        if(op.isPresent()){
            System.out.println(op.get().length());
        }
        else{
            System.out.println("string is null ");
        }
    }
}