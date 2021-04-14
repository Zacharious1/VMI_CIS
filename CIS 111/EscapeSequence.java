import java.util.Scanner;
public class EscapeSequence {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch = str.charAt(0);

        if (ch >= '0' && ch <= '9') {
            System.out.println("Numeral");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Uppercase Letter");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lowercase Letter");
        } else {
            System.out.println("Special Character");
        }




        //'0' to '9' is 48 to 57
        //'A' to 'Z' is 65 to 90
        //'a' to 'z' is 97 to 122
    }
}
/*Common Escape Sequences

        \b = backspace
        \t = tab
        \n = new line
        \r = carriage return
        \\ = backslash
        \" = quotes

*/