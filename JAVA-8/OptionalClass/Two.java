package Optional;
import java.util.Optional;

public class Two {
    public static void main(String[] args) {
        String name = "sravanth";
        int id = 18;
        Optional op = Optional.ofNullable(name);
        Optional op2 = Optional.ofNullable(id);
        System.out.println(op);
        if(op.isPresent()){
            System.out.println(op.get());
        }
        else{
            System.out.println("name is null");
        }

        System.out.println(op2);
        if(op2.isPresent()){
            System.out.println(op2.get());
        }
        else{
            System.out.println("id is null");
        }
    }
}
