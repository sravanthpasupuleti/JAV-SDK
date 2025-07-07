package Lamda_expression;

interface One {
    void login();
}
class Two{
    public static void main(String[] args){
        One m1 = ()=>{System.out.println("hlo success");}
        m1.login();
    }
} 
