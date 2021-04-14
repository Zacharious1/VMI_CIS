//Help Received: None!
public class ReverseString {
    private static String rev = "";
    public static String reverse(String string) {
        rev += string.charAt(string.length() - 1);
        if (string.length() == 0 || string.length() == 1)
            return rev;
        return reverse(string.substring(0, string.length() - 1));
    }

    public static void main(String[] args) {
        String a = "!ris uoy knahT";
        System.out.println(reverse(a));
    }
}
