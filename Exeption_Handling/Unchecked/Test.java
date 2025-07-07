public class Test{
    public static void main(String[] args){    //Arithmetic exception
        int a = 10;
        int b = 5;
        int c = 0;
        System.out.println(a/b);
        try{
            System.out.println(c/a);
            System.out.println(a/c);
        }
        catch(ArithmeticException ae){
            System.out.println("cant divide by zero");
        }
        finally{
            System.out.println("exception solved");
        }
    }
}