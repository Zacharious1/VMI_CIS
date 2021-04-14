//Help Received: none
import java.util.Scanner;

public class PalindromeInteger {

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

    public static int reverse(int n) {
        String s1 = n + "";
        String s2 = "";
        for (int i = s1.length() - 1; i >= 0;i--) {
            s2 += s1.charAt(i);
        }
        int r = Integer.parseInt(s1);
        return r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter an integer: ");
        int a = sc.nextInt();
        if (isPalindrome(a)) {
            System.out.println(reverse(a));
        } else {
            System.out.println("not a palindrome");
        }
    }
}