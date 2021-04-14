import java.util.Scanner;
public class RemainingSeconds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long seconds = sc.nextLong();
        long min = seconds / 60;
        seconds %= 60;
        long hour = min / 60;
        min %= 60;
        long day = hour / 24;
        hour %= 24;
        long month = day / 30;
        day %= 30;
        long year = month / 12;
        month %= 12;

        if (year > 0)
            System.out.println(year + " Years, ");
        if (month > 0)
            System.out.println(month + " Months, ");
        if (day > 0)
            System.out.println(day + " Days, ");
        if (hour > 0)
            System.out.println(hour + " Hours, ");
        if (min > 0)
            System.out.println(min + " Minutes, ");
        if (seconds > 0)
            System.out.println(seconds + " Seconds ");
    }
}






