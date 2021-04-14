//Help Received: None
import java.util.Scanner;
public class CompareCosts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the weight and price for package 1: ");
        double weight1 = sc.nextDouble();
        double price1 = sc.nextDouble();
        double priceForPound1 = weight1/price1;

        System.out.println("Enter the weight and price for package 2: ");
        double weight2 = sc.nextDouble();
        double price2 = sc.nextDouble();
        double priceForPound2 = weight2/price2;

        if (priceForPound1 > priceForPound2)
            System.out.println("Package 1 has a better price. ");

        else if (priceForPound1 < priceForPound2)
            System.out.println("Package 2 has a better price. ");
        else if (priceForPound1 == priceForPound2)
            System.out.println("The packages cost the same. ");
        else
            System.out.println("Error");
    }
}
