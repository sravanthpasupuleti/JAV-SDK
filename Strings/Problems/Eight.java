package classes;

public class Eight{
    public static void main(String[] args){
        String s = "java is easyj";
        boolean non_repeated = false;
        boolean reapeated = false;
        for(int i=0; i<s.length(); i++){
            int count = 0;
            for(int j=0; j<s.length(); j++){
                if(s.charAt(i) == s.charAt(j)){
                    count++;
                }
                }
        if(count == 1){
            System.out.println("first non  repeated character is "+s.charAt(i));
            non_repeated = true;
        }
        if(count >= 2){
            System.out.println("first repaeted char is "+s.charAt(i));
            reapeated = true;
        }
    }
}
}