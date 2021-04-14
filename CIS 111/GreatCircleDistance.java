//Help Received: none
import java.util.Scanner;
import java.lang.Math;
public class GreatCircleDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter point 1 (Latitude and longitude) in degrees: ");
        double x1Degrees = sc.nextDouble();
        double y1Degrees = sc.nextDouble();
        System.out.print("Enter point 2 (Latitude and longitude) in degrees: ");
        double x2Degrees = sc.nextDouble();
        double y2Degrees = sc.nextDouble();
        double x1Radians = Math.toRadians(x1Degrees);
        double x2Radians = Math.toRadians(x2Degrees);
        double y1Radians = Math.toRadians(y1Degrees);
        double y2Radians = Math.toRadians(y2Degrees);
        double radius = 6371.01;
        double distance = radius * Math.acos(Math.sin(x1Radians) * Math.sin(x2Radians) + Math.cos(x1Radians) * Math.cos(x2Radians) * Math.cos(y1Radians - y2Radians));
        System.out.println("The distance between the two points is " + distance + " km");
    }
}
