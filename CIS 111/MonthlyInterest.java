import java.util.Scanner;
public class MonthlyInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount in your account: ");
        int amount = input.nextInt();
        System.out.println("Enter the amount of months it will be in your account");
        int months = input.nextInt();
        System.out.println("The total amount after the monthly interest would be");
        System.out.println((1.005 * amount * Math.pow((1 + 1.005), months)/ (Math.pow((1 + 1.005), months) - 1)));

    }

}