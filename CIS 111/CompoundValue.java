//Help Received: None
import java.util.Scanner;
public class CompoundValue
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the monthly saving amount: $");
        double savingAmount = sc.nextDouble();
        double lastMonthAmount = 0;
        double monthlyRate = 1 + 0.00417;
        double accountValue = 0;
        for (int i = 0; i < 6; i++) 
        {
            accountValue = (savingAmount + lastMonthAmount) * monthlyRate;
            lastMonthAmount = accountValue;
        }
        System.out.println("After the sixth month, the account value is $" + accountValue);

    }
}

