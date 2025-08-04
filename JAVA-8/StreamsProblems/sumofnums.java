import java.util.*;

public class Sumofnums{
    public static void main(String[] args){
        List<Integer> nums = Arrays.asList(2 , 3, 4, 5 , 6, 7,8 ,9);
        int total = nums.stream()
        // .reduce((a,b) ->a + b)
        .mapToInt(num -> num)
        .sum();
    }
}