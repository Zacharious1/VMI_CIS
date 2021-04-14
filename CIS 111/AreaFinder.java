import java.util.Scanner;

public class AreaFinder {

    public static Scanner sc = new Scanner(System.in);

    public static double getCircleArea() {
        System.out.print("Enter radius: ");
        int radius = sc.nextInt();
        double circleArea = (Math.PI * Math.pow(radius, 2));
        return circleArea;
    }

    public static double getTriangleArea() {
        System.out.print("Enter leg length: ");
        int legLength = sc.nextInt();
        double p = (legLength * 3) / 2.0;
        double triangleArea = Math.sqrt(p * (p - legLength) * (p - legLength) * (p - legLength));
        return triangleArea;
    }

    public static double getSquareArea() {
        System.out.print("Enter side length: ");
        int sideLength = sc.nextInt();
        double squareArea = sideLength * sideLength;
        return squareArea;
    }

    public static void main(String[] args) {
        while (true) {
            System.out.print("Enter number of sides (1, 3, or 4, and -1 to exit): ");
            int n = sc.nextInt();

            if (n == 1) {
                System.out.println("The area of the circle is " + getCircleArea());
            }else if (n == 3) {
                System.out.println("The area of the triangle is " + getTriangleArea());
            }else if (n == 4) {
                System.out.println("The area of the square is " + getSquareArea());
            }else if (n != 1 || n != 3 || n != 4 || n != -1) {
                System.out.println("Error: Invalid number of sides!");
                break;
            }else if (n == -1) {
                break;
            }

        }
    }
}
