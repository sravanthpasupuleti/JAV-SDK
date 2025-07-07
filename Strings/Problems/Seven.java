public class Seven{
    public static void main(String[] args){
        //count number of capital letters and small leters and digits and special characters
        String s = "JavA5is&Su6p%eR";
        int Capital = 0;
        int small = 0;
        int digits = 0;
        int Special = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
                Capital++;
            }
            else if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                small++;
            }
            else if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                digits++;
            }
            else{
                Special++;
            }
        }
        System.out.println(Capital);
        System.out.println(small);
        System.out.println(digits);
        System.out.println(Special);
    }
}