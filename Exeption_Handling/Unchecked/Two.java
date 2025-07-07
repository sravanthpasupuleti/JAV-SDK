public class Two {
    public static void main(String[] args){
        int[] a = {101 , 102 , 103};
        System.out.println("hloo");   //we can put risky code into try block 
        // System.out.println(a[0]);
        //         System.out.println(a[3]);
        try{
               System.out.println(a[0]);
                System.out.println(a[3]);   // array index out of bound exeption
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }       
    }
}
