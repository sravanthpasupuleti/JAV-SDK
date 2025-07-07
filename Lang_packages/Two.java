public class Two {
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        int c = 30;
        Two t1 = new Two();
        Two t2 = new Two();
        String s1 = "hlo";
        String s2 = "hlo";
        String s4 = "hlo";
        String s3 = "hey";
        System.out.println(s1.equals(s2));  // String class equals() method is used for content comparison
        System.out.println(s1 == s2);
        System.out.println(s2 == s4); 
        System.out.println(s2.equals(s4)); // String operator for reference comparison
    }
}