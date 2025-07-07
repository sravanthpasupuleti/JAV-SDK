package classes;

//change even words to uppercase and odd words to reverse
public class Six{
    public static void main(String[] args){
        String s = "hlo java how are you";
        String[] s2 = s.split(" ");
        for(int i=0; i<s2.length; i++){
            String x = s2[i];
            if (i%2 == 0) {
                System.out.print(x.toUpperCase());
                System.out.print(" ");
            }
            else{
                for(int j=x.length() - 1; j>=0; j--){
                    System.out.print(x.charAt(j));
                }
                System.out.print(" ");
            }
        }
    }
}