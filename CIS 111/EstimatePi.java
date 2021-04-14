//Help Received: Help from Mr. Kim
public class EstimatePi {
   public static double estimatePi(int n ) {
        double pi = 0;
        boolean minusFlag = false;

        for (int i=1 ;i <= n ; i += 2) {
            if (minusFlag) {
                pi -= 1.0/i;
                minusFlag=false;
            }else {
                pi += 1.0/i;
                minusFlag=true;
            }
        }
        pi *=4;
        return pi;
    }

    public static void main(String[] args) {
        System.out.print(estimatePi(900));
    }

}
