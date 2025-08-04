interface One1{
    void login();
    void completed();
    public static void logout(){
        System.out.println("logout");
    }
    public default void forget(){
        System.out.println("forgret");
    }
}

class One2 implements One1{
    public void login(){
        System.out.println("login successfully One2");
    }
    public void completed(){
        System.out.println("completed successfully One2");
    }
}

class One3 implements One1{
    public void login(){
        System.out.println("login successfully One3");
    }
    public void completed(){
        System.out.println("completred successfully One3");
    }
}

public class One{
    public static void main(String[] args) {
        One1 obj1 = new One2();
        obj1.login();
        obj1.completed();
        obj1.forget();

        One1 obj2 = new One3();
        obj2.login();
        obj2.completed();
        obj2.forget();

        One1.logout();
    }
}