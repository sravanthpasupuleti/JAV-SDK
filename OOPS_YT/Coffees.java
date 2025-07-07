package coffeshop;
import Owner.Owner;
class One extends Owner{
    String Branch_name;
    int CofeeSold;
    int cost;
    public One(String Branch_name , int CofeeSold , int price)
    {
        System.out.println("hloo custumer");
        this.Branch_name = Branch_name;
        this.CofeeSold = CofeeSold;
        cost = price;
    }
    public void Annacoffee(int count)
    {
        CofeeSold = CofeeSold + count;
    }
    public void Revenue()
    {
        System.out.println("Total profit is "+CofeeSold*cost);
    }


    public void Display()
    {
        own();
        System.out.println("Branch name is "+Branch_name);
        System.out.println("coffeees "+CofeeSold);
        System.out.println("coffee cost "+cost);
        Revenue();
        System.out.println("--------------------");
    }
}

public class Coffees{
    public static void main(String[] args) {
        One Branch1 = new One("pokiriStall" , 1 , 10);
        // System.out.println(Branch1.Branch_name);
        // System.out.println(Branch1.CofeeSold);
        // System.out.println(Branch1.cost);
        Branch1.Annacoffee(4);
        Branch1.Display();

        One Branch2 = new One("Dhukudu", 1, 15);
        Branch2.Display();
    }
}