public class OneHundredEvenOrOdd {
    public static void main(String[] args) {
        long i = 0;
        long even = 0;
        long odd = 0;
        long limit = Long.MAX_VALUE;
        while (i < limit) {
            int a = (int) (1 + Math.random()*50);
            i++;
            if (a % 2 == 0)
                even++;
            else
                odd++;
        }
        System.out.print(even + " even numbers and " + odd + " odd numbers");
        System.out.print((double)even/limit * 100.0 + "% even numbers and " + (double)(odd) /limit * 100.0 + "% odd numbers");






    }
}
