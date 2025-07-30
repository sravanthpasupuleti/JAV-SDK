package classes;

public class Three {
    public static void main(String[] args){
        int value = 0;
        int i=-1;
        int j=0;
        int[] arr = {13 , 1 , 7  , 19 , 4};
        // for(int i=0; i<arr.length; i++){
        //     if (arr[i] > value) {
        //         value = arr[i];
        //         j=i;
        //     }
        // }
        for (int elem : arr) {
            i++;
            if (elem > value) {
                value = elem;
                j=i;
            }
        }
        System.err.println("value is "+value);
        System.out.println("index is "+j);
    }
}
