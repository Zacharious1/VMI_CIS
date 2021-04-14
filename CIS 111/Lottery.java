import java.util.Scanner;
public class Lottery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Eenter a 2-digit number: ");

        int userInput = sc.nextInt();

        String userInputString = null;
        if (userInput >= 10 && userInput <= 99) {
            userInputString = "" + userInput;
        } else {
            System.out.print("Incorrect input. Input should be between 10 and 99");
            System.exit(0);
        }

        char userGuess1 = userInputString.charAt(0);
        char userGuess2 = userInputString.charAt(1);

        int a = 10 + (int) (Math.random() * 90);
        String computerInputString = "" + a;
        char computerGuess1 = computerInputString.charAt(0);
        char computerGuess2 = computerInputString.charAt(1);

        if (userInputString.equals(computerInputString)) {
            System.out.print("Exact Match! Yov won $10,000! Your number was " + a);
        } else if (userGuess1 == computerGuess2 && userGuess2 == computerGuess1) {
            System.out.print("Same Numbers! You've won $3000! Your number was " + a + " and you entered " + userInputString);
        } else if (userGuess1 == computerGuess2 || userGuess2 == computerGuess1 || userGuess2 == computerGuess2 || userGuess1 == computerGuess1) {
            System.out.print("You got one of the numbers right! You've won $1000!");
        } else {
            System.out.print("Sorry, you are not a winner!");
        }

    }
}
