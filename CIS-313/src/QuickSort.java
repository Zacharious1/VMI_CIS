public class QuickSort {
    private static final int CUTOFF = 10;
    public static <AnyType> Integer pickMiddleof5(AnyType[] x) {
        Integer[] arr = new Integer[5];
        arr[0] = (Integer) x[0];
        arr[1] = (Integer) x[(x.length / 2 ) / 2];
        arr[2] = (Integer) x[x.length / 2];
        arr[3] = (Integer) x[((x.length / 2) + ((x.length /2 ) / 2))];
        arr[4] = (Integer) x[x.length - 1];
        insertionSort(arr);
        return arr[2];
    }

    public static <AnyType> Integer findIndex(AnyType[] x) {
        Integer seeking = pickMiddleof5(x);
        for (int i = 0; i < x.length; i++) {
            if (x[i] == seeking) return i;
        }
        return -1;
    }

    public static <AnyType extends Comparable<AnyType>> void quickSort(AnyType[] a, int low, int high) {
        if (low + CUTOFF > high)
            insertionSort(a);
        else {
            //sort low, middle, high
            int middle = findIndex(a);
            //pivot placed in high - 1
            swapReferences(a, middle, high - 1);
            AnyType pivot = a[high - 1];
            //partitioning
            int i, j;
            for (i = low, j = high; ; ) {
                while (a[++i].compareTo(pivot) < 0)
                    ;
                while (pivot.compareTo(a[--j]) < 0)
                    ;
                if (i >= j)
                    break;
                swapReferences(a, i, j);
            }
            //restore pivot
            swapReferences(a, i, high - 1);
            quickSort(a, low, i - 1);
            quickSort(a, i + 1, high);

        }

    }

    public static <AnyType extends Comparable<AnyType>> void quickSort(AnyType[] a) {
        quickSort(a, 0, a.length - 1);

    }

    public static <AnyType extends Comparable<AnyType>> void swapReferences(AnyType[] a, int left, int right) {
        quickSort(a, 0, a.length - 1);

    }

    public static <AnyType extends Comparable<AnyType>> void insertionSort(AnyType[] arr) {
        for (int i = 1; i < arr.length; i++) {
            AnyType tmp = arr[i];
            int j = i;
            for (; j > 0 && tmp.compareTo(arr[j -1]) < 0; j--)
                arr[j] = arr[j -1];
            arr[j] = tmp;
        }
    }
    public static void initialize(Integer[] x) {
        for (int i = 0; i < x.length; i++)
            x[i] = 1 + (int) (Math.random() * 100);
    }

    public static <AnyType> void printArr(AnyType[] arr) {
        for (AnyType anArr : arr)
            System.out.print(anArr + ", ");
        System.out.println();
    }
    public static void printanArr(Integer[] arr) {
        for (Integer anArr : arr)
            System.out.print(anArr + ", ");
        System.out.println();
    }

    public static void main (String[]args){
        Integer[] arr = new Integer[15];
        initialize(arr);
        System.out.println(findIndex(arr));
        quickSort(arr);
        printArr(arr);

    }
}