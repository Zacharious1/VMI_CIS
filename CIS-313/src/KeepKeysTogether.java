public class KeepKeysTogether {
    public static void selectionSortKeepIndexAndValueTogether(int[][] list) {
        for (int i = 0; i < list[0].length; i++) {
            int currentMin = list[0][i];
            int minIndex = list[1][i];
            int currentMinIndex = i;
            for (int j = i + 1; j < list[0].length; j++) {
                if (currentMin > list[0][j]) {
                    currentMin = list[0][j];
                    minIndex = list[1][j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i) {
                list[0][currentMinIndex] = list[0][i];
                list[1][currentMinIndex] = list[1][i];
                list[0][i] = currentMin;
                list[1][i] = minIndex;
            }
        }
    }
    private static void initialize(int[][] x) {
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                x[i][j] = (int) (Math.random() * 10);

            }
        }
    }
    private static void printMatrix(int[][] x) {
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.print(x[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] key = new int[2][10];
        initialize(key);
        printMatrix(key);
        System.out.println();
        selectionSortKeepIndexAndValueTogether(key);
        printMatrix(key);

    }
}
