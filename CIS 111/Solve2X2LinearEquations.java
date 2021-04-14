//Help Received: None
import java.util.Scanner;
public class Solve2X2LinearEquations {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a, b, c, d, e, and f: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        double e = sc.nextDouble();
        double f = sc.nextDouble();
        double x = ((e*d)-(b*f))/((a*d)-(b*c));
        double y = ((a*f)-(e*c))/((a*d)-(b*c));
        double noSolutionFinder = ((a * b) - (c * d));
        if (noSolutionFinder == 0)
        {
            System.out.print("The equation has no solution.");
        }
        else
        {
        System.out.print("X = " + x + " and Y = " + y);
        }
    }
}
