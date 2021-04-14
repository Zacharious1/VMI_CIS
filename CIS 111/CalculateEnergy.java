//Help Received: None
import java.util.Scanner;
public class CalculateEnergy
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount of water in kilograms: ");
        double amountOfWater = sc.nextDouble();
        System.out.print("Enter initial temperature: ");
        double initialTemp = sc.nextDouble();
        System.out.print("Enter final temperature: ");
        double finalTemp = sc.nextDouble();
        double energy = amountOfWater * (finalTemp - initialTemp) * 4184;
        System.out.print("The energy required is " + energy);
    }
}
