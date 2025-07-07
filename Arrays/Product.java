public class Product{
    public static void main(String[] args){
        int Product_Prices[] = {34 , 43 , 77 , 98 ,90};
        int Total = 0;
        //using For loop
        for(int i=0 ; i<Product_Prices.length ; i++){
            Total = Total + Product_Prices[i];
        }
        System.out.println("Total is "+Total);

    }
}