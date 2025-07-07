package classes;

//reverse words in string
public class Five {
    public static void main(String[] args){
        String s = "olh evol avaj sravanth royal";
        String[] s2 = s.split(" ");
        // for(int i=0; i<=s2.length; i++){
        //     String x = s2[i];
        //     for(int j = x.length() - 1; j>=0; j--){
        //         System.out.println(x.charAt(j);
        //     }
        // }
        // System.out.println(s2);
        int l = s2.length;
        System.out.println(l);
        for(int i=0; i<l; i++){
            String x = s2[i];
            for(int j=x.length() - 1; j>=0; j--){
            System.out.print(x.charAt(j));
            }
            System.out.print(" ");
         }
        
    }
}
