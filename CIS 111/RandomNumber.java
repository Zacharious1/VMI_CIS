//Help Received: none
import java.util.Scanner;

public class RandomNumber {

    public static void getRandomNumber(int num) {
        for (int i = 0; i < num; i++) {
            int a = (int) (Math.random() * 20);
            System.out.println(a);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many random numbers do you want? ");
        int n = sc.nextInt();
        getRandomNumber(n);
    }



}
