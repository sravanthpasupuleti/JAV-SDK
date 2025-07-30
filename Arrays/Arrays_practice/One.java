package classes;

public class One{
    public static void main(String[] args){
        // int[] arr2 = new int[3];
        int total = 0;
        int[] arr = {2 , 3, 4, 5};
        for(int ar : arr){
            total = ar + total;
        }
        System.out.println(total);
    }
}