package classes;

//to count the total number of occurences of a given character in a string
public class Three {
    public static void main(String[] args){
        String s = "Hello world";
        char t = 'h';
        int count = 0;
        for(int i=0; i<s.length(); i++){
            if (s.charAt(i) == t) {
                count++;
            }
        }
        System.out.println(count);
    }
}
