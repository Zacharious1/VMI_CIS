//Help Received: none
import java.lang.Character;
import java.util.Scanner;

public class CheckPassword {
    static Scanner sc = new Scanner(System.in);
    static String password = sc.nextLine();

    public static boolean passwordValidity(String a)
    {
        int digits = 0;
        for (int i = 0; i < a.length(); i++) {
            char b = a.charAt(i);
            if (Character.isDigit(b))
                digits++;
            if (!Character.isLetterOrDigit(b) || a.length() < 8)
            return false;
        }
        return digits >= 2;
    }

    public static void main(String[] args) {
        if (passwordValidity(password))
            System.out.print(password + " is a valid password");
        else
            System.out.print(password + " is not a valid password");
    }
}
