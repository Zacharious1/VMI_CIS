//Help Received: none
public class Emirp
{
    public static boolean isPrime(int num)
    {
        if (num == 2 || num == 3)
            return true;

        for (int i = 2; i <= (int) Math.sqrt(num); i++)
        {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static int reverse(int n)
    {
        String S1 = n + "";
        String S2 = "";
        for (int i = S1.length() - 1; i >= 0; i--)
        {
            S2 += S1.charAt(i);
        }
        return Integer.parseInt(S2);
    }

    public static void main(String[] args)
    {
        int counter = 0;
        for (int i = 0; counter < 100; i++)
        {
            if (isPrime(i) && reverse(i) != i)
            {
                System.out.print(i + " ");
                counter++;

                if (counter % 10 == 0 && counter != 0)
                    System.out.println();
            }
        }
    }
}