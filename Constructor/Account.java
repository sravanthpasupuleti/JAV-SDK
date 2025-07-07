public class Account{
    int id;
    String name;
    int bal;
    Account(int acc_id, String acc_name , int acc_bal){
        System.out.println("construcor of Account class");
        this.id = acc_id;
        this.name = acc_name;
        this.bal = acc_bal;
    }
    public boolean  deposit_money(int add_money){
        this.bal=this.bal+add_money;
        return true;
    }
    public static void main(String[] args){
        Account a1 = new Account(1, "sravanth", 50000);
        System.out.println(a1.id);
        System.out.println(a1.name);
        System.out.println(a1.bal);
        System.out.print(a1.deposit_money(5000));
        Account a2=new Account(2, "srav", 60000);
        a2.deposit_money(3000);
        System.out.println(a2.id);
        System.out.println(a2.name);
        System.out.println(a2.bal);
    }
    
}