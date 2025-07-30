package classes;

// import java.util.Arrays;

public class Two {
    public static void main(String[] args) {
        int arr[] = {1 , 2 , 3 , 4 , 5};
        int sum = 0;
        // char arr2[] = {'a' , 'b' , 'c' , 'd'};
        for (int ar : arr) {
            sum = sum + ar;
        }
        int avg = sum/arr.length;
        System.out.println(avg);
        // System.out.println(Arrays.toString(arr));
        // System.out.println(Arrays.toString(arr2));
    }
}
