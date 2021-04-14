import java.util.Scanner;
public class DayOfWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number for day of the week: ");
        int day = sc.nextInt();

        switch (day){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;

            case 0:
            case 6:
                System.out.println("weekend");
                break;
                default:
                    System.out.println("Incorrect day number");
        }


    }
}
