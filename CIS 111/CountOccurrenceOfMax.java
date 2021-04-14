//Help Received: none
import java.util.Scanner;
public class CountOccurrenceOfMax {
    public static void main(String[] args) {
        int max = 1;
        int count = 1;
        Scanner sc = new Scanner(System.in);
        int current = sc.nextInt();
        while (current != 0) {

            if (current > max) {
                count = 1;
                max = current;
                sc.nextInt();
            }
            else if (max == current) {
                count++;
                current = sc.nextInt();
            }
            else if (max > current)
                current = sc.nextInt();
            else if (current == 0)
            {
                count++;
                break;
            }

        }System.out.println("The max number was " + max + " and it occurred " + count + " times");
    }
}
