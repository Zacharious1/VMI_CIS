import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = Integer.MIN_VALUE;

        System.out.println("Enter a number");
        int number = sc.nextInt();
        do {
            if (number > max) {
                max = number;
            }
            System.out.print("Enter a number ");
            number = sc.nextInt();
        } while (number != -1);
        System.out.print("max is " + max);
    }
}
