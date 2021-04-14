//Help Received: None
import java.lang.Math;
public class GenerateRandomAndAdd {
    public static void main(String[] args) {
        int a = (int)(Math.random()*30);
        int b = (int)(Math.random()*30);
        int c = (int)(Math.random()*30);
        int total = a + b + c;
        System.out.println("The three random numbers are: " + a + " " + b + " " + c);
        System.out.println("The sum of the three random numbers is: " + total);

        if (total % 2 == 0) {
            System.out.println("The total " + total + " is an even number");
        } else {
            System.out.println("The total " + total + " is an odd number");
        }
    }

}
