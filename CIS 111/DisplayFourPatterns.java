//Help Received: none
//Could not figure out last 2 patterns, did get first 2
public class DisplayFourPatterns {
    public static void main(String[] args) {

        for (int i = 1; i <= 6; i++) {

            for (int j = 1; j<=i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
System.out.println();
        for (int i = 6; i >= 1; i--) {

            for (int j = 1; j<=i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
