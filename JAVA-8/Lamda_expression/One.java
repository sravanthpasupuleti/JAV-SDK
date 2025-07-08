package Lamda_expression;

@FunctionalInterface
interface One {
    void login();
    // void logout();
}
class Two{
    public static void main(String[] args){
        One m1 = () -> System.out.println("hlo success");
        m1.login();
    }
}
