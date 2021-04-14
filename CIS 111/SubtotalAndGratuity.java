//Help Received: None
import java.util.Scanner;
public class SubtotalAndGratuity
{
    static Scanner sc = new Scanner(System.in);
    static double subtotal;
    static double gratuity;
    static double gratuityRate;
    static double total;
    public static void main(String[] args)
    {
        System.out.println("Enter Subtotal: ");
        subtotal = sc.nextDouble();
        System.out.println("Enter Gratuity Rate: ");
        gratuityRate =sc.nextDouble();
        gratuity = subtotal * gratuityRate / 100.0;
        total = subtotal + gratuity;
        System.out.println("The gratutity is $" + gratuity + " and the total is $" + total);

    }
}
