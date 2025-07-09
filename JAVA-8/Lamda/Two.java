package Lamda;

@FunctionalInterface
interface Two1{
    int m1(int speed);
    // int m2();
}


public class Two {
    public static void main(String[] args) {
        Two1 obj1 = new Two1() {
            public int m1(int speed){
                // int speeding = 70;
                System.out.println("anonymous Function , Bike speed is "+speed);
                return speed;
            }
            //  public int m2(){
            //     int speed = 70;
            //     System.out.println("anonymous Function , Bike speed is "+speed);
            //     return speed;
            // }
        };
        System.out.println(obj1.m1(75));

        Two1 obj2 = (speeeed) -> {
            // int fast = 90;
            System.out.println("Lamda expression speed is"+speeeed);
            return speeeed;
        };
        System.out.println(obj2.m1(95));
    }
}
