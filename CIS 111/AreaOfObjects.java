import java.util.Scanner;
public class AreaOfObjects {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double size;
        double pi = Math.PI;
        double areaOfCircle;
        System.out.print("Enter number of Sides (1 or 4): ");
        double numberOfSides = sc.nextDouble();
        {
            if (numberOfSides == 1) {
                System.out.print("Enter Radius of Circle: ");
                size = sc.nextDouble();
                areaOfCircle = (size * size * pi);
                System.out.println("The Area of the Circle is: " + areaOfCircle);
            } else if(numberOfSides == 4) {
                double Length = sc.nextInt();
                double areaOfSquare = Length * Length;
                System.out.println("Area of Square = " + areaOfSquare);
            }
            else
                System.out.println("Your number is invalid. Bye.");
        }
    }
}