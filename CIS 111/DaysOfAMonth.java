//Help Received: None
import java.util.Scanner;
public class DaysOfAMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year:");
        int year = sc.nextInt();
        Scanner s = new Scanner(System.in);
        System.out.print("Enter A month: ");
        String Month = s.nextLine();

        if (Month.equals("Jan")||Month.equals("Mar")||Month.equals("May")||Month.equals("July")||Month.equals("Aug")||Month.equals("Oct")||Month.equals("Dec"))
            System.out.println(Month + " " + year + " has 31 days");
        else if (Month.equals("Feb"))
            System.out.println(Month + " " + year + " has 28 days");
        else if (Month.equals("Apr") || Month.equals("June") || Month.equals("Sept") || Month.equals("Nov"))
            System.out.println(Month + " " + year + " has 30 days");
        else
            System.out.println(Month + " is not a correct month name");




    }
}
