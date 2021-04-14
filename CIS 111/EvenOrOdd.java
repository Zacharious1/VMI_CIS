import java.util.Scanner;
public class EvenOrOdd {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter a number between 5 and 9 inclusive: ");
        int number = sc.nextInt();
        if (number % 5 == 0) System.out.print("The number is a multiple of 5");
        else if (number % 6 == 0) System.out.print("The number is a multiple of nothing");
        else if (number % 7 == 0) System.out.print("The number is a multiple of 7");
        else if (number % 8 == 0) System.out.print("The number is a multiple of nothing");
        else if (number % 9 == 0) System.out.print("The number is a multiple of 9");
    }
}