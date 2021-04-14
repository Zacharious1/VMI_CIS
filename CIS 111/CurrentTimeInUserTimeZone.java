//Help Received: Code taken from Listing 2.7 in Java Textbook
import java.util.Scanner;
public class CurrentTimeInUserTimeZone
{
    static long totalMilliseconds = System.currentTimeMillis();
    static long totalSeconds = totalMilliseconds /1000;
    static long currentSecond = totalSeconds % 60;
    static long totalMinutes = totalSeconds / 60;
    static long currentMinute = totalMinutes % 60;
    static long totalHours = totalMinutes / 60;
    static long currentHour = totalHours % 24;




        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the time zone offset to GMT: ");
            long timeZoneOffset = sc.nextLong();
            long adjustedHour = currentHour - timeZoneOffset;
            System.out.print("Current time is " + adjustedHour + ":" + currentMinute + ":" + currentSecond);
        }
    }


