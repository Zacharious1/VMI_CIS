//Help Received: None
import java.util.Scanner;
public class PhoneKeyPad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = "A";
        String b = "B";
        String c = "C";
        String d = "D";
        String e = "E";
        String f = "F";
        String g = "G";
        String h = "H";
        String i = "I";
        String j = "J";
        String k = "K";
        String l = "L";
        String m = "M";
        String n = "N";
        String o = "O";
        String p = "P";
        String q = "Q";
        String r = "R";
        String s = "S";
        String t = "T";
        String u = "U";
        String v = "V";
        String w = "W";
        String x = "X";
        String y = "Y";
        String z = "Z";

        System.out.print("Enter a letter: ");
        String letter = sc.nextLine();

        if (letter.equalsIgnoreCase(a)
                || letter.equalsIgnoreCase(b)
                || letter.equalsIgnoreCase(c)
                || letter.equalsIgnoreCase(d)
                || letter.equalsIgnoreCase(e)
                || letter.equalsIgnoreCase(f)
                || letter.equalsIgnoreCase(g)
                || letter.equalsIgnoreCase(h)
                || letter.equalsIgnoreCase(i)
                || letter.equalsIgnoreCase(j)
                || letter.equalsIgnoreCase(k)
                || letter.equalsIgnoreCase(l)
                || letter.equalsIgnoreCase(m)
                || letter.equalsIgnoreCase(n)
                || letter.equalsIgnoreCase(o)
                || letter.equalsIgnoreCase(p)
                || letter.equalsIgnoreCase(q)
                || letter.equalsIgnoreCase(r)
                || letter.equalsIgnoreCase(s)
                || letter.equalsIgnoreCase(t)
                || letter.equalsIgnoreCase(u)
                || letter.equalsIgnoreCase(v)
                || letter.equalsIgnoreCase(w)
                || letter.equalsIgnoreCase(x)
                || letter.equalsIgnoreCase(y)
                || letter.equalsIgnoreCase(z))
        {

            if (letter.equalsIgnoreCase(a) || letter.equalsIgnoreCase(b) || letter.equalsIgnoreCase(c))
                System.out.println("The corresponding number is 2");
            else if (letter.equalsIgnoreCase(d) || letter.equalsIgnoreCase(e) || letter.equalsIgnoreCase(f))
                System.out.println("The corresponding number is 3");
            else if (letter.equalsIgnoreCase(g) || letter.equalsIgnoreCase(h) || letter.equalsIgnoreCase(i))
                System.out.println("The corresponding number is 4");
            else if (letter.equalsIgnoreCase(j) || letter.equalsIgnoreCase(k) || letter.equalsIgnoreCase(l))
                System.out.println("The corresponding number is 5");
            else if (letter.equalsIgnoreCase(m) || letter.equalsIgnoreCase(n) || letter.equalsIgnoreCase(o))
                System.out.println("The corresponding number is 6");
            else if (letter.equalsIgnoreCase(p) || letter.equalsIgnoreCase(q) || letter.equalsIgnoreCase(r) || letter.equalsIgnoreCase(s))
                System.out.println("The corresponding number is 7");
            else if (letter.equalsIgnoreCase(t) || letter.equalsIgnoreCase(u) || letter.equalsIgnoreCase(v))
                System.out.println("The corresponding number is 8");
            else if (letter.equalsIgnoreCase(w) || letter.equalsIgnoreCase(x) || letter.equalsIgnoreCase(y) || letter.equalsIgnoreCase(z))
                System.out.println("The corresponding number is 9");
        }
            else {
                System.out.println(letter + " is an invalid input");
            }
    }
}
