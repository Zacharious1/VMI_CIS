//Help Received: none
public class PentagonalNumber {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <101; i++) {
            System.out.print(getPentagonalNumber(i) + " ");
            count++;
            if (count % 10 == 0) {
                System.out.println();
            }
        }
    }
    public static int getPentagonalNumber(int n) {
        int pn = n * (3*n -1) / 2;
        return pn;

    }

}
