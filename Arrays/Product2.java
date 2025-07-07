public class Product2{
    public static void main(String[] args){
        int Product_prices[] = {56, 56, 78, 879 , 97};
        int Total = 0;
        int i = 0;
        while(i<Product_prices.length){
            Total = Total + Product_prices[i];
            i++;
        }
        System.out.println("sum is  "+Total);
    }
}