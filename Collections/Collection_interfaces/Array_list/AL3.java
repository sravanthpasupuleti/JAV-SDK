import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class AL3 {
    public static void main(String[] args){
        List<String> al = new ArrayList<String>();
        al.add("hloo");
        al.add("hii");
        al.add("sravanth");
        System.out.println(al);
        Iterator<String> it = al.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
