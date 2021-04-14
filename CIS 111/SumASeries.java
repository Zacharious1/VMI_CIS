//Help Received: None
public class SumASeries {
    public static void main(String[] args) {
        double total = 0;
        for (double i = 1.0; i < 98; i += 2) {
            double j = i+2;
                total += (i / j);
        }
        System.out.print(total);
    }
}

