//Help Received: none
import java.util.Scanner;
public class CountUppercaseLetters {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z' )
            count++;
        }
        System.out.println(count);
    }
}
