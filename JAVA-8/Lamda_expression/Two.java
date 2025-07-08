package Lamda_expression;

interface FunTwo{
    int add(int a , int b);
}

public class Two{
    public static void main(String[] args){
        FunTwo obj1 = (a , b) -> a + b;
        System.out.println(obj1.add(2 , 4));
    }
}
