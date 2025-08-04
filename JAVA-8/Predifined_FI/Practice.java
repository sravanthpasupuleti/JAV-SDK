// import java.util.*;
import java.util.function.Consumer;

// package Classes;
interface InnerPractice {
    boolean get();  
}

public class Practice {
    public static void main(String[] args) {



         Consumer<Integer> c = num -> System.out.println(num);
         c.accept(10);
    }
}
