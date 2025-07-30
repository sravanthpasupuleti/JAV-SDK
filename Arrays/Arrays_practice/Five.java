package classes;

public class Five {
    public static void main(String[] args) {
        int[] arr = {4 , 7 , 2 , 8 , 3 , 11};
        int min = arr[0];
        for(int i=1; i<arr.length; i++){
            if (min<arr[i]) {
                min = min;
            }
            else{
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}