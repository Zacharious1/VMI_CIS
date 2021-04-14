public class RunningTimes {
    public static void main(String[] args) {
        int n = 10000;
        int sum = 0;
        long startTime = System.nanoTime();
        for (int i = 1; i < n; i = i * 2) {
            sum++;
        }

        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
        System.out.println(timeElapsed);






    }
}