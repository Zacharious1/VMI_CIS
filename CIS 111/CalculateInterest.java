//Help Received: None
import java.util.Scanner;
public class CalculateInterest
{
    static Scanner sc = new Scanner(System.in);
    static double balance;
    static double APR;
    static double interest;

    public static void main(String[] args) {
        System.out.print("Enter balance: ");
        balance = sc.nextDouble();
        System.out.print("Enter interest rate: ");
        APR = sc.nextDouble();
        interest = balance * (APR/ 1200);
        System.out.print("The interest is $" + interest) ;
    }
}
