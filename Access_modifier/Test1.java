package pack1;
class Test1{
    private void m1(){
        System.out.println("hlooo m1 method");
    }
    public static void main(String[] args){
        System.out.println("this is main method");
        Test1 obj = new Test1();
        obj.m1();
    }
}