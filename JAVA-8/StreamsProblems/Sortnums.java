import java.util.*;

public class Sortnums {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(9 , 3, 21, 5, 16,7, 8, 9);
        List<Integer> sort = nums.stream()
        .sorted();
    }
}
