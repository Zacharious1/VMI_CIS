//Help Received: None
import java.util.Scanner;
import java.lang.Math;
public class SortThreeIntegersInDescendingOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int temp = Math.max(a, b);
        int max = Math.max(temp, c);
        temp = Math.min(a, b);
        int min = Math.min(temp, c);
        int mid;
        if (a != max && a != min) {
            mid = a;
        } else if (b != max && b != min) {
            mid = b;
        } else {
            mid = c;
        }
        System.out.print("After sorting: " + max + " " + mid + " " + min);

    }



}
