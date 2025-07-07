public class Test3 {
    int a = 10;
    int b = 20;
    static int c = 30;
    public static void main(String[] args){
      System.out.println(c);
      System.out.println(Test3.c);
      Test3  t1 = new Test3();
      System.out.println(t1.c);
      System.out.println(t1.a + t1.b + t1.c);
    }
}
