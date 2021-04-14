import java.util.Scanner;
public class SimpleChatTool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String prompt = sc.nextLine();
        String test = "How are you";
        boolean flag = prompt.equalsIgnoreCase(test);
        if (flag) {
            int number = (int) (1 + Math.random() * 50);

            if (number % 2 == 0) {
                if (number % 5 == 0) {
                    System.out.print("Good");
                } else if (number % 7 == 0) {
                    System.out.print("Happy");
                } else if (number % 3 == 0) {
                    System.out.print("Sad");
                } else
                    System.out.print("Very sad");
            } else if (number % 3 == 0) {
                System.out.print("Sad");
            } else if (number % 5 == 0) {
                if (number == 45) {
                    System.out.print("Very happy");
                } else
                    System.out.print("Good");
            } else if (number % 7 == 0) {
                System.out.print("Happy");
            } else if (number == 45) {
                System.out.print("Very Happy");
            } else
                System.out.print(":)");
        } else {
            System.out.print("Error: Input not recognized!");
        }
    }
}
