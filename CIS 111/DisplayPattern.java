//Help Received: GSS with Dr. Lasisi
import java.util.Scanner;

public class DisplayPattern {


    public static void displayPattern(int n) {
        for (int rowNumber = 1; rowNumber <= n; rowNumber++) {
            int whiteSpace = n;
            while (whiteSpace > rowNumber){
                System.out.print(" ");
                whiteSpace--;
            }
            for (int printedNumber = rowNumber; printedNumber >= 1; printedNumber--) {
                System.out.print(printedNumber);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        displayPattern(rows);

    }
}