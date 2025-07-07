import java.util.ArrayList;
public class AL2{
    public static void main(String[] args){
        ArrayList<String> enames = new ArrayList<String>();
        enames.add("hlo");
        enames.add("heyy");
        enames.add("hii");
        enames.add("sravanth");
        System.out.println(enames);

        System.out.println("for loop-----------");
        for(int i=0; i<enames.size(); i++){
            System.out.println(enames.get(i));
        }

        System.out.println("while loop----------");

        int j=0;
        while (j<enames.size()) {
            System.out.println(enames.get(j));
            j++;
        }

        System.out.println("do while loop---------");

        int k=0;
        do{
           System.out.println(enames.get(k));
           k++;
        }while(k<enames.size());

        System.out.println("For each loop--------");

        for(String ename : enames){
            System.out.println(ename);
        }
    }
}