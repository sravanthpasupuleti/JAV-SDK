package Classes;

interface One{
    int m1(int a, int b);
}

class Two implements One{
   public int m1(int a, int b){
    return a+b;
   }
}
public class NormalTwo{
    public static void main(String[] args){
        One obj1 = new Two();
        System.out.println(obj1.m1(2 , 4));

        One obj2 = (x , y) -> x * y;
        System.out.println(obj2.m1(2,4));
    }
}