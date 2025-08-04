package classes;

import java.util.ArrayList;

public class Six {
    public static void main(String[] args) {
        Boolean[] ar = {true , true , false , true};
        ArrayList<Boolean> ar2 = new ArrayList<>();
        System.out.println(ar.length);
        for (int i = ar.length - 1; i >=  0; i--) {
            ar2.add(ar[i]);
            System.out.println(ar[i]);
        }
        System.out.println(ar2);
    }
}
