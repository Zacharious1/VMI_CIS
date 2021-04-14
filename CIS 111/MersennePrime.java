//Help received: none
public class MersennePrime {
    public static double mersenne(double n) {
        double mersenne = Math.pow(2, n) - 1;

        return mersenne;

    }
    public static boolean isPrime(int num) {
        if (num == 2 || num == 3) {
            return true;
        }
        for (int i = 2; i <= (int)Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("p" + "     " + "2^p - 1");
        System.out.println("_____________");
        for (int i = 2; i < 32; i++) {
            if (isPrime(i))
            {
                if (isPrime((int) mersenne(i)))
                    System.out.println(i  + "     " + (int) mersenne(i));
            }
        }
    }
}
