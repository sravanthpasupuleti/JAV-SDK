package classes;
// import classes.One;  if package are same we dont need to import
//count the number of words in a string
public class Two {
    public static void main(String[] args){
        String s = "java is super hlgo vcvds   ";
        String s2 = s.trim();
        int count = 1;
        for(int i=0; i<s2.length(); i++){
            if(s2.charAt(i) == ' '){
                count++;
            }
        }
        System.out.println(count);
    }
}
