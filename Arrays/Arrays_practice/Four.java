package classes;

public class Four {
    public static void main(String[] args) {
        String[] names = {"srav" , "royal" , "hlo" , "sravanth" , "siuu"};
        int min_name = names[0].length();
        for (int i = 1; i < names.length; i++) {
            if (min_name<names[i].length()) {
                min_name = min_name;
            }
            else{
                min_name = names[i].length();
            }
        }
        System.out.println(names[min_name - 1]);
    }
}
