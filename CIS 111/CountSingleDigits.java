//Help Received: None

//(Count single digits) Write a program that generates 100 random integers between
//0 and 9 and displays the count for each number. (Hint: Use an array of ten integers,
//say counts, to store the counts for the number of 0s, 1s, . . . , 9s.)
public class CountSingleDigits {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < 100; i++) {
            int value = (int)(Math.random() * 10);
            array[value]++;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(i + " occurs " + array[i] + " times");
        }
    }
}
