//Help Received: Learned syntax of Math.hypot on Java Website
import java.util.Scanner;
import java.lang.Math;
public class ComputePerimeterOfTriangleIfValid {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter value for X1: ");
    double X1 = sc.nextDouble();
    System.out.print("Enter value for X2: ");
    double X2 = sc.nextDouble();
    System.out.print("Enter value for X3: ");
    double X3 = sc.nextDouble();
    System.out.print("Enter value for Y1: ");
    double Y1 = sc.nextDouble();
    System.out.print("Enter value for Y2: ");
    double Y2 = sc.nextDouble();
    System.out.print("Enter value for Y3: ");
    double Y3 = sc.nextDouble();

    double side1 = Math.hypot(X2-X1, Y2-Y1);
    double side2 = Math.hypot(X3-X1, Y3-Y1);
    double side3 = Math.hypot(X3-X2, Y3-Y2);

        if ((side1 + side2) > side3 || (side2 + side3) > side1 || (side1 + side3) > side2) {
            double perimeter = side1 + side2 + side3;
            System.out.println("The perimeter of the Triangle is " + perimeter);
        } else {
            System.out.print("input is invalid");
        }

    }
}
