import java.util.Scanner;
public class GuessingNumbers {
    public static void main(String[] args) {
        int random = (int) (Math.random() * 101);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your guess: ");
        int guess = sc.nextInt();
        if (guess == random)
            System.out.print("Correct!");
        while (guess != random) {
            if (guess > random) {
                System.out.println("Too high");
                System.out.print("Enter new guess: ");
                guess = sc.nextInt();
            }
            if (guess < random) {
                System.out.println("Too low");
                System.out.print("Enter new guess: ");
                guess = sc.nextInt();
            } if (guess == random) System.out.print("Correct! The number was " + random);
        }
    }
}
