import java.util.Scanner;
public class BinaryConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean negative = false;

        if (n < 0) {
            negative = true;
            n+=1;
        }

        n = Math.abs(n);
        String binary = "";
        while (n != 0) {
            int remainder = n % 2;
            binary = remainder + binary;
            n = n / 2;
        }

        String fullBinary = "";
        for (int i = 0; i < (16 - binary.length()); i++)
        {
            fullBinary += 0;
        }
        fullBinary += binary;

        if (!negative)
            System.out.println(fullBinary);

        String negFullBinary = "";
        for (int i = 0; i < fullBinary.length(); i++) {

            if (fullBinary.charAt(i) == '0')
                negFullBinary += '1';
            else
                negFullBinary += '0';
        }
        if (negative)
            System.out.println(negFullBinary);
    }
}