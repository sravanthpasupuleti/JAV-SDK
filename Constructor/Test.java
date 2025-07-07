class Test{
    int a;
    Test(int a){
        this.a = a;
        System.out.println("thi is constructor");
    }
    public static void main(String[] args){
        Test obj1 = new Test(10);
        Test obj2 = new Test(20);
        System.out.println(obj1.a);
        System.out.println(obj2.a);
    }
}