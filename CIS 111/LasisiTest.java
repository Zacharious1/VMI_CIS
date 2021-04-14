public class LasisiTest {
    public static void main(String[] args) {
        double numerator = 1.0;
        double denominator = 2.0;
        double sum = 0;
        while (denominator <= 20) {
        sum = sum + (numerator/denominator);
            numerator += 2;
            denominator += 2;
        }
        System.out.println(sum);
    }
}
