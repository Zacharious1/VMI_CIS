import java.util.Scanner;
public class ConvertCelsiusToFahrenheit 
{
	static Scanner sc = new Scanner(System.in); //makes new scanner
	static double Celsius;
	static double Fahrenheit;

	public static void main(String[] args) 
	{
		System.out.print("Enter Celsius Value: ");
		Celsius=sc.nextDouble(); //code that asks for input
		Fahrenheit = (Celsius * (9.0 / 5) + 32);
		System.out.println(Celsius + " Celsius = " + Fahrenheit + " Fahrenheit");
	}

}
