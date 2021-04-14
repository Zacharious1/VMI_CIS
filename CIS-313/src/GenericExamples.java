public class GenericExamples{
    public static <AnyType extends Comparable<AnyType>> int linearSearch(AnyType[] list, AnyType key) {
        for (int i = 0; i < list.length; i++)
            if (key.compareTo(list[i]) == 0)
                return i;
            return 0;
    }

    public static <AnyType extends Comparable<AnyType>> int binarySearch(AnyType[] list, AnyType key) {
        int low = 0;
        int high = list.length-1;
        while (high >= low) {
            int mid  = (low + high)/2;
            if (key.compareTo(list[mid]) == 0)
                return mid;
            else if (key.compareTo(list[mid]) < 0)
                return high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }

    public static <AnyType extends Comparable<AnyType>> boolean theSame(AnyType[][] m1, AnyType[][] m2) {
        if (m1 == null && m2 == null) return true;
        if (m1.length != m2.length || m1[0].length != m2[0].length) return false;
        for (int i = 0; i < m1.length; i++)
            for (int j = 0; j < m1[0].length; j++)
                if (m1[i][j].compareTo(m2[i][j]) != 0)
                    return false;
        return true;
    }

    public static <AnyType extends Comparable<AnyType>> boolean theSame(AnyType[] m1, AnyType[] m2) {
        if (m1 == null && m2 == null) return true;
        if (m1.length != m2.length) return false;
        for (int i = 0; i < m1.length; i++)
                if (m1[i].compareTo(m2[i]) != 0)
                    return false;
        return true;
    }

    public static <AnyType extends Comparable<AnyType>> AnyType findMax(AnyType[][] m1) {
        AnyType a = m1[0][0];
        if (m1 == null) return null;
        for (int i = 0; i < m1.length; i++)
            for (int j = 0; j < m1[0].length; j++)
                if (m1[i][j].compareTo(a) > 0)
                    a = m1[i][j];
        return a;
    }

    //http://ms.ntub.edu.tw/~spade/teaching/x-DS2006-2/2-27.pdf
    public static boolean exists(int[] a, int k){
        return (a[k] == k);
    }

    public static boolean inMatrix(int[][] x, int k){
        int i = 0, j = x.length - 1;
        boolean found = false;
        while (i< x.length && j >= 0 && !found){
            if (x[i][j] == k) found = true;
            if (x[i][j] < k) i++;
            j--;
        }
        return found;
    }

    public static boolean hasMirrorSequential(int[] x){
        int a = x.length-1, j = 0;
        if (a == j || a - j == 1) return true;
        else if (x[a] - x[j] == 0) {
            a--;
            j++;
        }
        return false;
    }

    public static int binarySearch(int[] a, int key) {
        int low = 0;
        int high = a.length-1;
        while (low <= high) {
            int mid = (low+high) / 2;
            if (key < a[mid]) {
                high = mid - 1;
            }
            else if (key == a[mid])
                return mid;
            else low = mid + 1;
        }
        return -1;
    }

    public static boolean hasMirrorBinary(int[] x){
        for(int i = 0; i < x.length; i++){
            int negative = x[i] - (Math.abs(x[i])*2);
            if (binarySearch(x, negative) == -1)
            return false;
        }
        return true;
    }

    public static int hasMirror(int[] x){
        int count = 1;
        int i = x[0], j = x[x.length-1];
        do{
            if (j - i == 0)
                return i;
            else if (j - i < 0){ i++; count++;}
            else if (j - i > 0){ j--; count++;}
        }while (count != x.length);
        return -1;
    }


    public static void main(String[] args) {
        String[] strings = {"Jake", "Liam", "Mary", "Onika", "Tim"};
        int[] integers = {-3, -2, -1, 0, 1, 2, 3};

        Character[] chars = {'a', 'b', 'd', 'f', 'm', 't', 'w', 'z'};
        Double[] doubles = {3.4, 5.6, 7.9, 11.2, 14.4, 17.69};

        long startTime = System.nanoTime();
        hasMirrorSequential(integers);
        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
        System.out.println(timeElapsed);

    }
}
