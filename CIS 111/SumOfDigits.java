//Help Received: None

import java.util.Scanner;
public class SumOfDigits {
    static Scanner sc = new Scanner(System.in);
    static int OriginalNumber;
    static int SumOfDigits;

    public static void main(String[] args)
    {
        System.out.print("Enter a number between 0 and 1000: ");
        OriginalNumber = sc.nextInt();

        if (OriginalNumber > 1000)
        {
            do
            {
                System.out.print("Error: Number must be between 0 and 1000! Please enter a number between 0 and 1000: ");
                OriginalNumber = sc.nextInt();
            } while (OriginalNumber > 1000);
        }
        if (OriginalNumber > 0 && OriginalNumber <= 1000)
        {
            if (OriginalNumber > 0 && OriginalNumber < 100)
            {
               SumOfDigits = ((OriginalNumber % 10) + (OriginalNumber / 10));
               System.out.println(SumOfDigits);
            }
        }
        if (OriginalNumber >= 100)
        {
            int firstDigit = OriginalNumber % 10;
            int secondDigit = (((OriginalNumber - firstDigit) / 10) % 10);
            int firstTwoNumbersOfOriginalNumber = ((OriginalNumber - firstDigit) / 10);
            int finalFinalDigit = ((firstTwoNumbersOfOriginalNumber - (firstTwoNumbersOfOriginalNumber % 10))) / 10;
            SumOfDigits = firstDigit + secondDigit + finalFinalDigit;
            System.out.println("The sum of the digits in the number " + OriginalNumber + " is " + SumOfDigits);
        }
    }
}
