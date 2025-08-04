

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class One_Pre {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2 , 4, 6, 8, 10);

        Function<List,Integer> f = (nums) -> nums.size();
        System.out.println(f.apply(numbers));

        Predicate<List> p = nums -> nums.isEmpty();
        System.out.println(p.test(numbers));

        Consumer<List> c = nums -> {
            for (Object num : nums) {
                System.out.println(num);
            }
        };
        c.accept(numbers);

        Supplier<Double> s = () -> Math.random();
        System.out.println("random"+ s.get());
       }
}