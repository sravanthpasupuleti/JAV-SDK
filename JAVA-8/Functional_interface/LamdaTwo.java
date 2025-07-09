package Classes;

interface Two{
    int add(int a , int b);
}

public class LamdaTwo {
    public static void main(String[] args){
        Two obj1 = (a , b) -> a + b;
        // Two obj2 = () -> System.out.println("lamda function successfully executed");
        int sum1 = obj1.add(2, 4);
        System.out.println(sum1);
        // Predicate<Integer> obj2 = sum1 -> sum1>4;
        // System.out.println(obj2);
    }
}
