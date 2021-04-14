//Help Received: none
import java.lang.Math;
import java.lang.String;
public class PalindromicPrime {

    public static boolean isPrime(int num) {
        if (num == 2 || num == 3) {
            return true;
        }
        for (int i = 2; i <= (int)Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome(int num) {
        String nString = "" + num;
        int length = nString.length();
        for (int i = 0, j = length - 1; i < length / 2; i++, j--) {
            if (nString.charAt(i) != nString.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int numberCounter = 0;
        int lineCounter = 0;
        int number = 2;
        while (numberCounter < 100) {
            if (isPrime(number) && isPalindrome(number)) {
                if (lineCounter % 10 == 0)
                    System.out.println();
                System.out.print(" " + number);
                numberCounter++;
                lineCounter++;
            }
            number++;
        }
    }
}
