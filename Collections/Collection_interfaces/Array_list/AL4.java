import java.util.List;
import java.util.ArrayList;

public class AL4{
    public static void main(String[] args){
        List<String> li = new ArrayList<String>();
        li.add("firstAdd");
        li.add("hlo");
        li.add("hii");
        li.add("sravanth");
        li.add("CSE");
        System.out.println(li);
        System.out.println(li.get(2));
        System.out.println(li.size());
        li.set(2,"Royal");
        System.out.println(li);
        li.remove("CSE");
        System.out.println(li);
        List<String> li2 = new ArrayList<String>();
        li2.add("Royal");
        li2.add("hii");
        System.out.println(li2);
        li.removeAll(li2);
        System.out.println(li);
        li.clear();
        System.out.println(li);
    }
}
