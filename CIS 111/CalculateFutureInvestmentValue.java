//Help Received: None
import java.util.Scanner;
public class CalculateFutureInvestmentValue
{
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args)
    {
        double investmentAmount;
        System.out.print("Enter investment amount: ");
        investmentAmount = sc.nextDouble();
        System.out.print("Enter annual interest rate: ");
        double APR = sc.nextDouble() / 100;
        double monthlyInterestRate = APR / 12.0;
        System.out.print("Enter number of years: ");
        double numberOfYears;
        numberOfYears = sc.nextDouble();

        double futureInvestmentValue = (investmentAmount * (Math.pow((1 + monthlyInterestRate), (numberOfYears*12))));
        System.out.print("Future value is $" + futureInvestmentValue);
    }
}
