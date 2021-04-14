//Help Received: none
import java.util.Scanner;
public class CountTypeAndComputeAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int positiveCount = 0;
        int negativeCount = 0;
        double total = 0;

        int number = sc.nextInt();
        while (number != 0) {
            if (number > 0) {
                positiveCount++;
                total += number;
            } else if (number < 0) {
                negativeCount++;
                total += number;
            }
            number = sc.nextInt();
        }
        double average = total / (positiveCount + negativeCount);
        System.out.print(average);

    }
}
