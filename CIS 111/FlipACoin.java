public class FlipACoin {
    public static void main(String[] args) {
        int heads = 0;
        int tails = 0;
        for (int i = 0; i <1000000; i++) {
            int test = (int) (1 + Math.random() * 2);
            if (test == 1)
                heads++;
            else tails++;
        }
        System.out.print("tails " + tails + " heads " + heads);
    }
}
