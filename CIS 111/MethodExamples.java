public class MethodExamples {

    public static int computeSum(int x, int y) {
        int max = Math.max(x, y);

        return max;
    }


    public static void main(String[] args) {
        int sum1 = computeSum(1, 10);
        int sum2 = computeSum(20, 30);
        int sum3 = computeSum(35, 45);

        System.out.println("Sum 1 = " + sum1 + " Sum 2 = " + sum2 + " sum 3 = " + sum3);
    }
}
