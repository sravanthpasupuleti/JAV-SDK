class InnerTwo{
    private String name = "sravanth";
    private int id = 18;
    public String setname(){
        return this.name;
    }
    public void getname(){
        System.out.println(setname());
    }
    public int setid(){
        return this.id;
    }
    public void getid(){
        System.out.println(setid());
    }
}
public class Two extends InnerTwo{
    public static void main(String[] args){
        Two obj = new Two();
        obj.getname();
        obj.getid();
    }
}