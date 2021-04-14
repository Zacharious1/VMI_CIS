// Help Received: none
import java.util.Scanner;
public class FindFutureDates {
    public static String day;
    public static String futureDay;
    public static int todayPlusDaysFromNow;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter what day it is: ");
        int todayAsANumber = sc.nextInt(); // 0 - 6 for Sunday through Saturday
        System.out.print("Enter the number of days elapsed since today: ");
        int daysFromNow = sc.nextInt(); // user input value of the days from now
        todayPlusDaysFromNow = todayAsANumber + daysFromNow;

        if (todayAsANumber == 0)
            day = "Sunday";
        else if (todayAsANumber == 1)
            day = "Monday";
        else if (todayAsANumber == 2)
            day = "Tuesday";
        else if (todayAsANumber == 3)
            day = "Wednesday";
        else if (todayAsANumber == 4)
            day = "Thursday";
        else if (todayAsANumber == 5)
            day = "Friday";
        else if (todayAsANumber == 6)
            day = "Saturday";

        if (todayPlusDaysFromNow < 6) {
            if (todayPlusDaysFromNow == 0)
                futureDay = "Sunday";
            else if (todayPlusDaysFromNow == 1)
                futureDay = "Monday";
            else if (todayPlusDaysFromNow == 2)
                futureDay = "Tuesday";
            else if (todayPlusDaysFromNow == 3)
                futureDay = "Wednesday";
            else if (todayPlusDaysFromNow == 4)
                futureDay = "Thursday";
            else if (todayPlusDaysFromNow == 5)
                futureDay = "Friday";
            else if (todayPlusDaysFromNow == 6)
                futureDay = "Saturday";
            if (daysFromNow == 1)
                System.out.print("Today is " + day + " and after " + daysFromNow + " day, the day will be " + futureDay);
            else
                System.out.print("Today is " + day + " and after " + daysFromNow + " days, the day will be " + futureDay);

        }
        else {
            todayPlusDaysFromNow %= 7;
            if (todayPlusDaysFromNow == 0)
                futureDay = "Sunday";
            else if (todayPlusDaysFromNow == 1)
                futureDay = "Monday";
            else if (todayPlusDaysFromNow == 2)
                futureDay = "Tuesday";
            else if (todayPlusDaysFromNow == 3)
                futureDay = "Wednesday";
            else if (todayPlusDaysFromNow == 4)
                futureDay = "Thursday";
            else if (todayPlusDaysFromNow == 5)
                futureDay = "Friday";
            else if (todayPlusDaysFromNow == 6)
                futureDay = "Saturday";
            if (daysFromNow == 1)
                System.out.print("Today is " + day + " and after " + daysFromNow + " day, the day will be " + futureDay);
            else
                System.out.print("Today is " + day + " and after " + daysFromNow + " days, the day will be " + futureDay);        }

    }
}
