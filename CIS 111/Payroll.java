//Help Received: none
import java.util.Scanner;
public class Payroll {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee's name: ");
        String name = sc.nextLine();
        System.out.print("Enter hours worked: ");
        double hoursWorked = sc.nextDouble();
        System.out.print("Enter hourly pay rate: ");
        double payRate = sc.nextDouble();
        System.out.print("Enter enter federal tax withholding rate: ");
        double federalTax = sc.nextDouble();
        System.out.print("Enter state tax withholding rate: ");
        double stateTax = sc.nextDouble();

        double grossPay = hoursWorked * payRate;
        double federalDeduction = (grossPay * federalTax);
        double stateDeduction = (grossPay * stateTax);
        double totalDeduction = federalDeduction + stateDeduction;
        double netPay = grossPay - totalDeduction;

        System.out.println("Employee Name: " + name);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Pay Rate: $" + payRate);
        System.out.println("Gross Pay: $" + grossPay);
        System.out.println("Deductions: ");
        System.out.println(" Federal Withholding (" + federalTax * 100 + "%): $" + federalDeduction);
        System.out.println(" State Withholding (" + stateTax * 100 + "%): $" + stateDeduction);
        System.out.println(" Total Deduction: $" + totalDeduction);
        System.out.println("Net Pay: $" + netPay);
    }
}
