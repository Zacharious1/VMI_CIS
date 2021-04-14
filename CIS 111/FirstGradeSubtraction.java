//Help Received: None
import java.util.Scanner;
import java.lang.Math;
public class FirstGradeSubtraction
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = 1 + (int) (Math.random() * 9);
        int b = 1 + (int) (Math.random() * 9);
        if (a > b)
        {
            System.out.print(a + " - " + b + " = ");
            if (a - b == sc.nextInt())
                System.out.print("Correct!");
            else
                System.out.print("Incorrect");
        }
        else
        {
            System.out.print(b + " - " + a + " = ");
            if (b - a == sc.nextInt())
                System.out.print("Correct!");
            else
                System.out.print("Incorrect");
        }
    }
}
