import java.util.Scanner;
public class ConvertPoundsToKilos {
	static Scanner sc = new Scanner(System.in);
	static double Pounds;
	static double Kilos;
	
	
	public static void main(String[] args) {
		System.out.print("Enter Pounds: ");
		Pounds=sc.nextDouble();
		Kilos = 0.454 * Pounds;
		System.out.print(Pounds + " Pounds = " + Kilos + " Kilograms");
		
		

	}

}
