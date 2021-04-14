//Help Received: None
import java.util.Scanner;
public class CheckSocialSecurityNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String socialSecurity = sc.nextLine();

        char one = socialSecurity.charAt(0);
        char two = socialSecurity.charAt(1);
        char three = socialSecurity.charAt(2);
        char four = socialSecurity.charAt(4);
        char five = socialSecurity.charAt(5);
        char six = socialSecurity.charAt(7);
        char seven = socialSecurity.charAt(8);
        char eight = socialSecurity.charAt(9);
        char nine = socialSecurity.charAt(10);

        boolean flag = false;

        //checks the characters that aren't hyphens to see if they are digits. if they all are, flag is true
        if (Character.isDigit(one) && Character.isDigit(two) && Character.isDigit(three) && Character.isDigit(four) && Character.isDigit(five)
                && Character.isDigit(six) && Character.isDigit(seven) && Character.isDigit(eight) && Character.isDigit(nine))
            flag = true;
        //Checks if only 3 characters in first part, 2 in second part, and 4 in third part. Also checks the length, and if all are digits, valid.
        if (socialSecurity.length() == 11 && socialSecurity.substring(0, 4).endsWith("-") && socialSecurity.substring(3, 7).endsWith("-") &&  flag)
            System.out.println("valid");
        else
            System.out.println("input invalid");
    }
}
