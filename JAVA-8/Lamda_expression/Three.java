package Lamda_expression;

interface Function_three{
    int mul(int a);
}

public class Three {
    public static void main(String[] args) {
        Function_three obj1 = (a) -> a + a; 
        System.out.println(obj1.mul(2));
    }
}
