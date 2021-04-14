//Help Received: None
import java.util.Scanner;
public class SolveQuadraticEquations
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = sc.nextDouble();
        System.out.print("Enter b: ");
        double b = sc.nextDouble();
        System.out.print("Enter c: ");
        double c = sc.nextDouble();
        double discriminant = (Math.pow(b, 2.0)) - (4.0 * a * c);
        double root1 = (-b + Math.pow(discriminant, 0.5)) / (2.0 * a);
        double root2 = (-b - Math.pow(discriminant, 0.5)) / (2.0 * a);

        if (discriminant > 0)
        {
            System.out.print("The equation has two real roots. The roots are " + root1 + " and " + root2);
        }

        if (discriminant == 0)
        {
            System.out.print("The equation has one real root. The root is " + root1);
        }

        if (discriminant < 0)
        {
            System.out.print("The equation has no real roots.");
        }


    }
}
