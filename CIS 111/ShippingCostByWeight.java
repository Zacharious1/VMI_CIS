//Help Received: None
import java.util.Scanner;
public class ShippingCostByWeight
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Weight: ");
        double itemWeight = sc.nextDouble();
        double costToShip;

        if (itemWeight <= 0.0)
            System.out.println("Invalid input.");
        else if(itemWeight > 20.0)
            System.out.println("The package cannot be shipped.");
        else
        {
            if (itemWeight <= 1.0)
                costToShip = 3.5;
            else if (itemWeight <= 3.0)
                costToShip = 5.5;
            else if (itemWeight <= 10.0)
                costToShip = 8.5;
            else
                costToShip = 10.5;
            System.out.println("The cost is: $" + costToShip);
        }
    }
}
