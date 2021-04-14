import java.util.Scanner;
public class StringStuff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        int firstSpace = name.indexOf(' ');
        int lastSpace = name.lastIndexOf(' ');
        String firstName = name.substring(0, firstSpace );
        String lastName = name.substring(lastSpace);

        String middleName = name.substring(firstSpace, lastSpace + 1).trim();

        if (middleName.length() > 1)
            System.out.println("Your first name is " + firstName + ", your middle name is " + middleName  + ", your last name is" + lastName);
        else if(middleName.length() <= 1)
            System.out.println("Your first name is " + firstName +  ", your last name is"+ lastName);

    }
}
