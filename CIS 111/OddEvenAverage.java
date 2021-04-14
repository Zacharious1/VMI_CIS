//Help Received: none
import java.util.Scanner;
public class OddEvenAverage {
    static Scanner sc = new Scanner(System.in);
    static int even = 0;
    static int odd = 0;
    static double sum = 0;
    static int inputs = 0;
    static boolean isEvenNumber(int n) {
        return n % 2 == 0;
    }

    public static boolean isOddNumber(int n) {
        return n % 2 != 0;
    }

    public static double getAverage(double total, int noOfInputs) {
        int num = sc.nextInt();

        while (num != 0){
            if (isEvenNumber(num))
            even++;
            if (isOddNumber(num))
                odd++;
            noOfInputs += 1;
            total += num;
            inputs = noOfInputs;
            sum = total;
            num = sc.nextInt();
        }
        return total/noOfInputs;
    }

    public static void main(String[] args) {
        System.out.println("Average: " + getAverage(sum, inputs));
        System.out.println("Even Numbers: " + even);
        System.out.println("Odd Numbers: " + odd);
    }
}
