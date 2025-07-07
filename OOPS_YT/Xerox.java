package xeroxes;
import Owner.Owner;
class One extends Owner{
    String Branch_name;
    int papers;
    int cost;

    One(String Branch_name, int papers, int cost)
    {
        System.out.println("hello custumer");
        this.Branch_name = Branch_name;
        this.papers = papers;
        this.cost = cost;
    }
    public void Revenue()
    {
        System.out.println("Total amount for papers is : "+papers*cost);
    }
    public void Display()
    {
        own();
        System.out.println("Branch name : "+Branch_name);
        System.out.println("Branch name : "+papers);
        System.out.println("Branch name : "+cost);
        Revenue();
    }
}

public class Xerox {
    public static void main(String[] args) {
        One brach1 = new One("pokiri" , 1 , 1);
        brach1.Display();
    }
}
