//Help Received: none
import java.util.Scanner;
import java.lang.Math;

public class AreaOfAPentagon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length from the center to a vertex: ");
        double length = sc.nextDouble();
        double side = 2 * length * (Math.sin(Math.PI / 5));
        double areaNumerator = 5 * Math.pow(side, 2); //numerator of formula
        double areaDenominator = 4 * Math.tan(Math.PI / 5);//denominator of formula
        double area = areaNumerator / areaDenominator; // the precise area
        double finalArea = (int) (area * 100) / 100.0; //the area that goes to 2 decimal places; used in print statement
        System.out.print("The area of the pentagon is " + finalArea);

    }






}
