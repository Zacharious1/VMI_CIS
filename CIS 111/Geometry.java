import java.lang.Math;
public class Geometry {
    public static void main(String[] args) {
        double radius = 0.5;
        double arc = Math.toRadians(96);
        double area = 0.5 * (arc) * Math.pow(radius, 2);
        System.out.print("The are of the hatched area is: " + area);


    }


}
