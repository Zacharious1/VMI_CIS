import java.util.Scanner;
public class ConvertFeetToMeters 
{
	static Scanner sc = new Scanner(System.in);
	static double feet;
	static double meter;
	
	public static void main(String[] args)
	{
		System.out.print("Enter Feet: ");
		feet=sc.nextDouble();
		meter = 0.305 * feet;
		System.out.println(feet + " Feet = " + meter + " Meters");
	}
}
