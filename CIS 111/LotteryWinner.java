//Help Received: None
import java.util.Scanner;
import java.lang.Math;

public class LotteryWinner
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = 1 + (int) (Math.random() * 99);
        int digit1 = a / 10;
        int digit2 = a % 10;
        System.out.print("Please enter a 2 digit number: ");
        int guess1 = sc.nextInt();
        int guessDigit1 = guess1 / 10;
        int guessDigit2 = guess1 % 10;

        if (digit1 == guessDigit1 && digit2 == guessDigit2){
            System.out.println("You won $10000!");
        } else if (digit1 == guessDigit2 && digit2 == guessDigit1) {
            System.out.println("You won $3000!");
        } else if (digit1 == guessDigit1 || digit1 == guessDigit2 || digit2 == guessDigit1 || digit2 == guessDigit2) {
            System.out.println("You won $1000!");
        } else {
            System.out.println("Sorry, you are not a Winner. Please try again!");
        }

        System.out.println("The Lottery number was " + a);
    }
}
