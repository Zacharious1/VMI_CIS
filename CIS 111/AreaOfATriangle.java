//Help Received: Area of a triangle using 3 points formula found online
import java.util.Scanner;
public class AreaOfATriangle
{
    public static void main(String[] args){
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

    double area = Math.abs((X1*Y2 + X2*Y3 + X3*Y1 - Y1*X2 - Y2*X3 - Y3*X1) / 2.0);

    System.out.print("The area of the triangle is " + area);
}
}