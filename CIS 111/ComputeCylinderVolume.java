//Help Received: None
import java.lang.Math;
import java.util.Scanner;

public class ComputeCylinderVolume 
{
	static Scanner sc = new Scanner(System.in);
	
	static double length;
	static double radius;
	
	static double area;
	static double volume;
	
	public static void main(String[] args) 
	{
		
		System.out.print("Enter length: ");
		length = sc.nextDouble();
		System.out.print("Enter radius: ");
		radius = sc.nextDouble();
		
		area = radius * radius * Math.PI;
		volume = area * length;
		
		System.out.println("The Area is: " + area);
		System.out.println("The Volume is: " + volume);
	}
}
