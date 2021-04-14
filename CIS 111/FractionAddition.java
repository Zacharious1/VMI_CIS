
public class FractionAddition {
    public static void main(String[] args) {
//        double num = 1.0;
//        double sum = 0;
//        while (num < 20) {
//            sum += (num / (num + 1.0));
//            num+=2;
//        }
//        System.out.print(sum);

    double num = 1.0;
    double sum = 0;
        while (num < 625) {
            sum += ((1.0) / Math.sqrt(num) + Math.sqrt(num + 1));
            num++;

        }
        System.out.print(sum);
    }
}
