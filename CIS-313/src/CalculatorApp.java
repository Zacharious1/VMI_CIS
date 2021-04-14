import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        StackCalculator a = new StackCalculator();
        Scanner sc = new Scanner(System.in);
        a.push(2.7);
        a.push(3.6);
        a.push(7.1);
        a.push(8.9);
        a.push(11.4);
        a.push(14.6);
        a.push(19.22);

        while (true) {
            System.out.println("Please enter the number of the command you wish to perform." +
                    "\n 1 = push, 2 = add, 3 = sub, 4 = multiply, 5 = divide \n " +
                    "6 = square root, 7 = power, 8 = clear 9 = print, 10 = quit");
            int b = sc.nextInt();
            if (b == 1) {
                System.out.println("enter a number to push onto the stack: ");
                a.push(sc.nextDouble());
            }
            if (b == 2) System.out.println(a.add());
            if (b == 3) System.out.println(a.subtract());
            if (b == 4) System.out.println(a.multiply());
            if (b == 5) System.out.println(a.divide());
            if (b == 6) System.out.println(a.sqrt());
            if (b == 7) System.out.println(a.pow());
            if (b == 8) a.clear();
            if (b == 9) a.printContents(a.getValues());
            if (b == 10) {
                System.out.println("Goodbye");
                System.exit(0);
            }
        }
    }
}
