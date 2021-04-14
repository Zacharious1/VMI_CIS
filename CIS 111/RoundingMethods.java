
import java.lang.Math;
public class RoundingMethods {
    public static void main(String[] args) {
        System.out.println(Math.ceil(2.1));
        System.out.println(Math.ceil(-2.1));
        System.out.println(Math.floor(2.1));
        System.out.println(Math.floor(-2.1));

        System.out.println(Math.rint(2.1));
        System.out.println(Math.max(2.0, 5.0));
        System.out.println((int)(51+Math.random() *9 + 1));
        System.out.println(Math.abs(-3.5));
        char ch = 'a';
        System.out.println(++ch);
        System.out.println((int)ch);

        System.out.println(Math.max(Math.max(3, 5), 8));
    }


}
