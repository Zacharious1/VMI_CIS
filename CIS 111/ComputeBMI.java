//Help Received: None

import java.util.Scanner;
public class ComputeBMI
{
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter weight in pounds: ");
        double pounds = sc.nextDouble();
        System.out.print("Enter height in inches: ");
        double inches = sc.nextDouble();
        double kilograms = 0.45359237 * pounds;
        double meters = 0.0254 * inches;
        double BMI = kilograms / (Math.pow(meters, 2.0));
        System.out.print("BMI is " + BMI);
    }
}
