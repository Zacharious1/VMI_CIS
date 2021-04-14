//Help Received: None
import java.util.Scanner;
public class ConvertLetterGradeToNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter letter grade");
        String gradeLetter = sc.nextLine();

        if (gradeLetter.equalsIgnoreCase("e")
                || gradeLetter.equalsIgnoreCase("g")
                || gradeLetter.equalsIgnoreCase("h")
                || gradeLetter.equalsIgnoreCase("i")
                || gradeLetter.equalsIgnoreCase("j")
                || gradeLetter.equalsIgnoreCase("k")
                || gradeLetter.equalsIgnoreCase("l")
                || gradeLetter.equalsIgnoreCase("m")
                || gradeLetter.equalsIgnoreCase("n")
                || gradeLetter.equalsIgnoreCase("o")
                || gradeLetter.equalsIgnoreCase("p")
                || gradeLetter.equalsIgnoreCase("q")
                || gradeLetter.equalsIgnoreCase("r")
                || gradeLetter.equalsIgnoreCase("s")
                || gradeLetter.equalsIgnoreCase("t")
                || gradeLetter.equalsIgnoreCase("u")
                || gradeLetter.equalsIgnoreCase("v")
                || gradeLetter.equalsIgnoreCase("w")
                || gradeLetter.equalsIgnoreCase("x")
                || gradeLetter.equalsIgnoreCase("y")
                || gradeLetter.equalsIgnoreCase("z")
                || gradeLetter.length() > 1)
        {
            do {
                System.out.print(gradeLetter + " is an invalid grade. Please enter a valid grade: ");
                gradeLetter = sc.nextLine();
            } while (gradeLetter.equalsIgnoreCase("e")
                    || gradeLetter.equalsIgnoreCase("g")
                    || gradeLetter.equalsIgnoreCase("h")
                    || gradeLetter.equalsIgnoreCase("i")
                    || gradeLetter.equalsIgnoreCase("j")
                    || gradeLetter.equalsIgnoreCase("k")
                    || gradeLetter.equalsIgnoreCase("l")
                    || gradeLetter.equalsIgnoreCase("m")
                    || gradeLetter.equalsIgnoreCase("n")
                    || gradeLetter.equalsIgnoreCase("o")
                    || gradeLetter.equalsIgnoreCase("p")
                    || gradeLetter.equalsIgnoreCase("q")
                    || gradeLetter.equalsIgnoreCase("r")
                    || gradeLetter.equalsIgnoreCase("s")
                    || gradeLetter.equalsIgnoreCase("t")
                    || gradeLetter.equalsIgnoreCase("u")
                    || gradeLetter.equalsIgnoreCase("v")
                    || gradeLetter.equalsIgnoreCase("w")
                    || gradeLetter.equalsIgnoreCase("x")
                    || gradeLetter.equalsIgnoreCase("y")
                    || gradeLetter.equalsIgnoreCase("z")
                    || gradeLetter.length() > 1);

            if (gradeLetter.equalsIgnoreCase("a"))
                System.out.println("The numeric value for grade A is 4");

            else if (gradeLetter.equalsIgnoreCase("b"))
                System.out.println("The numeric value for grade A is 3");

            else if (gradeLetter.equalsIgnoreCase("c"))
                System.out.println("The numeric value for grade A is 2");

            else if (gradeLetter.equalsIgnoreCase("d"))
                System.out.println("The numeric value for grade A is 1");

            else if (gradeLetter.equalsIgnoreCase("f"))
                System.out.println("The numeric value for grade A is 0");
        }
        }
    }
