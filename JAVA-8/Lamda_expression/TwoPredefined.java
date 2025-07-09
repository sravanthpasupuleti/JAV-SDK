package Lamda_expression;



import java.util.function.Function;

// interface Two{
//     int add(int a , int b);
// }

public class TwoPredefined {
    public static void main(String[] args) {
        Function<Integer , Integer> obj1 = (a) -> a ;
        System.out.println(obj1.apply(2));
    }
}
