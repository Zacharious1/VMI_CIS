//Help Received: Wikipedia on Binomial coefficients to see what they are, geeks for geeks to make sure I got the right answer.
public class BinomialCoefficientsRecursion {
    public static int binCoeff(int n, int k) {
        if (k == n || k == 0)
            return 1;
        return  binCoeff(n - 1, k) + binCoeff(n - 1, k - 1);
    }
    public static void main(String[] args) {
        int n = 5, k = 2;
        System.out.println(binCoeff(n, k));
    }
}
/*
        1
       1 1
      1 2 1
     1 3 3 1
    1 4 6 4 1
  1 5 10 10 5 1
 1 6 15 20 15 6 1

 base case would be n = k, because that is like the top of the triangle.
 Another is when k = 0, because that means you picked enough numbers. Need to decrement k, because that means you used a pick
 and need to decrement n because that means there is one less number to choose from.
*/