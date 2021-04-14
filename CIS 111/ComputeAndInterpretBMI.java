//Help Received: None
import java.util.Scanner;
public class ComputeAndInterpretBMI
{
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter weight in pounds: ");
        double pounds = sc.nextDouble();
        System.out.print("Enter feet: ");
        double feet = sc.nextDouble();
        System.out.print("Enter inches: ");
        double inches = (feet *12) + sc.nextDouble();
        double kilograms = 0.45359237 * pounds;
        double meters = 0.0254 * inches;
        double BMI = kilograms / (Math.pow(meters, 2.0));

        System.out.println("BMI is " + BMI);
        if (BMI < 18.5)
            System.out.println("Underweight");
        else if (BMI < 25)
            System.out.println("Normal");
        else if (BMI < 30)
            System.out.println("Overweight");
        else
            System.out.println("Obese");

        //less than 18.5 is underweight, less than 25norm, less than 30 overweight, else obese
    }
}