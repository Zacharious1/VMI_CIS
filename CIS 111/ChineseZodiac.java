import java.util.Scanner;
public class ChineseZodiac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year of Birth");
        int yearBorn = sc.nextInt();
        int year = yearBorn % 12;
        int colorYear = year % 4;
        String color = null;
/*        switch (colorYear) {
            case 0:
                color = "Black";
                break;
            case 1:
                color = "Red";
                break;
            case 2:
                color = "Blue";
                break;
            case 3:
                color = "Yellow";
                break;
        }
  */

        if (colorYear == 0)
        color = "Black";
        else if (colorYear == 1)
        color = "Red";
        else if (colorYear == 2)
        color = "Blue";
        else
        color = "Yellow";


        switch (year) {
            case 0:
                System.out.println("You are a " + color + " Monkey");
                break;
            case 1:
                System.out.println("You are a " + color + " Rooster");
                break;
            case 2:
                System.out.println("You are a " + color + " Dog");
                break;
            case 3:
                System.out.println("You are a " + color + " Pig");
                break;
            case 4:
                System.out.println("You are a " + color + " Rat");
                break;
            case 5:
                System.out.println("You are a " + color + " Ox");
                break;
            case 6:
                System.out.println("You are a " + color + " Tiger");
                break;
            case 7:
                System.out.println("You are a " + color + " Rabbit");
                break;
            case 8:
                System.out.println("You are a " + color + " Dragon");
                break;
            case 9:
                System.out.println("You are a " + color + " Snake");
                break;
            case 10:
                System.out.println("You are a " + color + " Horse");
                break;
            case 11:
                System.out.println("You are a " + color + " Sheep");
                break;


        }
    }
}
