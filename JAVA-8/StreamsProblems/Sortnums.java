import java.util.*;
import java.util.stream.Collectors;

public class Sortnums {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(9 , 3, 21, 5, 16,7, 8, 9);
        List<Integer> sort = nums.stream()
        .map(num -> num)
        .sorted()
        .collect(Collectors.toList());
        System.out.println(sort);
    }
}
