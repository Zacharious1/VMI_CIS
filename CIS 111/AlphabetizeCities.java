//Help Received: I knew from prior knowledge that there is a sort method for arrays,
// but i needed to google the import statement, as i could not remember the exact import location.
import java.util.Arrays;
import java.util.Scanner;
public class AlphabetizeCities {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the name of the first city: ");
        String city1 = sc.nextLine();
        System.out.print("Enter the name of the second city: ");
        String city2 = sc.nextLine();
        System.out.print("Enter the name of the third city: ");
        String city3 = sc.nextLine();

        String[] cities = {city1, city2, city3};

        Arrays.sort(cities);

        for (int i = 0; i < cities.length; i++) {
            String temp = cities[i];
            System.out.print(temp + " ");

        }




        }
    }

