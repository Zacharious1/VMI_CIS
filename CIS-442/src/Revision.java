public class Revision {

    public static void main(String[] args) {

    }
    public static boolean isPosPrime(int n) {
        return (n > 0 && isPrime(n));
    }

    public static boolean isPrime(int num) {
        if (num == 2 || num == 3) {
            return true;
        }
        for (int i = 2; i <= (int)Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }



    //For 2D arrays:
    public static int findMax(int [][] matrix) {

        int row = 0;
        int col = 0;
        int max = matrix[row][col];

        return findMax(matrix, max, row, col);
    }

    public static int findMax(int [][] matrix, int max, int row, int col) {

        if(row < matrix.length && col < matrix.length){

            if(matrix[row][col] > max)
                max = matrix[row][col];

            if(col + 1 >= matrix.length){
                row++;
                col = 0;
            }

            return findMax(matrix, max, row, col + 1);
        }
        else
            return max;
    }
    //End 2D array

}