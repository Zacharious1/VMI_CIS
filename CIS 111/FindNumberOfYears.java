//Help Received: None
import java.util.Scanner;
public class FindNumberOfYears {


    static int days;
    static int years;


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        int minutes = sc.nextInt();
        int originalMins = minutes;

        if (minutes > 525600) {
            years = minutes / 525600;
            minutes = (minutes - (years * 525600));
        }
            if (minutes < 525600) {
                days = minutes / 1440;
            }
            System.out.print(originalMins + " minutes is approximately " + years + " years and " + days + " days");
    }
}


