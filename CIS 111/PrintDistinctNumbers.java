//Help Received: Dr. Lasisi
import java.util.Scanner;

public class PrintDistinctNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];
        int countDistinct = 0;

        for (int i = 0; i < numbers.length; i++) {
            boolean flag = false;
            System.out.println("Enter a value");
            int value = sc.nextInt();
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[j] == value)
                    flag = true;
            }
            if (!flag) {
                numbers[countDistinct] = value;
                countDistinct++;
            }

        }
        for (int i = 0; i < countDistinct; i++) {
            System.out.println(numbers[i]);
        }
    }
}

