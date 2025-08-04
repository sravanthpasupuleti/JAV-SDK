package classes;

import java.util.Arrays;

public class Seven {
    public static void main(String[] args) {
        String[] Drink1 = {"chai","coffee"};
        String[] Drink2 = {"milk","water","coke"};
        String[] Drinks = new String[Drink1.length + Drink2.length];
        for (int i = 0; i < Drink1.length; i++) {
            Drinks[i] = Drink1[i];
        }
        for (int i = 0; i < Drink2.length; i++) {
            Drinks[Drink1.length  + i] = Drink2[i];
        }
        System.out.println(Arrays.toString(Drinks));
    }
}