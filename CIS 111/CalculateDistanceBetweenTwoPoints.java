//Help Received: None
import java.util.Scanner;
public class CalculateDistanceBetweenTwoPoints
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter X1: ");
        double X1 = sc.nextDouble();
        System.out.print("Enter X2: ");
        double X2 = sc.nextDouble();
        System.out.print("Enter Y1: ");
        double Y1 = sc.nextDouble();
        System.out.print("Enter Y2: ");
        double Y2 = sc.nextDouble();
        double Xes = (X2-X1);
        double Yes = (Y2 -Y1);
        double distance = Math.pow(Math.pow(Xes, 2) + Math.pow(Yes, 2), 0.5);
        System.out.print("The distance is " + distance);
    }

}
