//Help Received: none
import java.lang.Math;
import java.util.Scanner;
public class SortThreeIntegers
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a, b, and c: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int mid;

        int max1 = Math.max(a, b);
        int max2 = Math.max(max1, c);
        int trueMax = Math.max(max1, max2);
        int min1 = Math.min(a, b);
        int min2 = Math.min(min1, c);
        int trueMin = Math.min(min1, min2);
        if ((a == trueMax || a == trueMin) && (b == trueMax || b == trueMin))
            mid = c;
        else if ((b == trueMax || b == trueMin) && (c == trueMax || c == trueMin))
            mid = a;
        else
            mid = b;
        System.out.print(trueMin + " " + mid + " " + trueMax);

    }
}
