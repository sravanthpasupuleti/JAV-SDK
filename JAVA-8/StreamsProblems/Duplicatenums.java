import java.util.*;

public class Duplicatenums {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(23 , 45, 67, 34, 23, 45);
        for (Integer num1 : nums) {
            int count = 0;
            for (Integer num2 : nums) {
                if (num1 == num2) {
                    count++;
                }
            }
            if (count > 1) {
                System.out.println(num1);
            }
        }
    }
}
