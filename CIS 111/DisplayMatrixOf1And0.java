//Help Received: none
public class DisplayMatrixOf1And0 {
    public static void printMatrix(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                double random = Math.random();
                if (random <= 0.5)
                System.out.print("0");
                else
                    System.out.print("1");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printMatrix(9);
    }
}
