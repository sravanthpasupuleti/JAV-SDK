class parent{

    public parent() {
        System.out.println("parent class constructor");
    }
    
}

class child extends parent{

    public child() {
        super();  // invokig superclass 
        System.out.print("child class constructor");
    }
    
}

public class Superr {
    public static void main(String[] args) {
      child obj1 = new child();
    }
}
