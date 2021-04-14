import java.util.Scanner;
public class LoopPractice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch = str.charAt(0);
        int a = 0;
        while (ch != 'F' && ch != 'f') {
            if (ch == 'A' || ch == 'a') {
                a = 100;
            }else if (ch == 'B' || ch == 'b') {
                a = 90;
            }else if (ch == 'C' || ch == 'c') {
                a = 80;
            }else if (ch == 'D' || ch == 'd') {
                a = 70;
            }
            System.out.print("Your score is " + a );
            str = sc.nextLine();
            ch = str.charAt(0);
        }
        System.out.print("Bye.");
    }
}
