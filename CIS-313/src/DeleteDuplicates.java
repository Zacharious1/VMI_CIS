public class DeleteDuplicates {
    private static final int CUTOFF = 3;
    public static <AnyType extends Comparable<AnyType>> void insertionSort(AnyType[] arr) {
        for (int i = 1; i < arr.length; i++) {
            AnyType tmp = arr[i];
            int j = i;
            for (; j > 0 && tmp.compareTo(arr[j -1]) < 0; j--) {
                arr[j] = arr[j -1];
                printArr(arr);
            }
            arr[j] = tmp;
        }
    }
    public static <AnyType extends Comparable<AnyType>> void quickSort(AnyType[] a) {
        quickSort(a, 0, a.length - 1);

    }
    public static <AnyType extends Comparable<AnyType>> void swapReferences(AnyType[] a, int left, int right) {
        quickSort(a, 0, a.length - 1);

    }
    public static <AnyType extends Comparable<AnyType>> void quickSort(AnyType[] a, int low, int high) { //best way to pick a pivot for quicksort is to pick the median of 3. look at left, center, and right element, arrange them, and pick the median
        if (low + CUTOFF > high)
            insertionSort(a);
        else {
            //sort low, middle, high
            int middle = (low + high) / 2;
            if(a[middle].compareTo(a[low]) < 0)
                swapReferences(a, low, middle);
            if(a[high].compareTo(a[low]) < 0)
                swapReferences(a, low, high);
            if(a[high].compareTo(a[middle]) < 0)
                swapReferences(a, middle, high);

            //pivot placed in high - 1
            swapReferences(a, middle, high - 1);
            AnyType pivot = a[high - 1];
            //partitioning
            int i, j;
            for (i = low, j = high; ;) {
                while (a[++i].compareTo(pivot) < 0)
                    ;
                while (pivot.compareTo(a[--j]) < 0)
                    ;
                if(i >= j)
                    break;
                swapReferences(a, i, j);
            }
            //restore pivot
            swapReferences(a, i, high - 1);
            quickSort(a, low, i - 1);
            quickSort(a, i + 1, high);

        }


    }

    public static <AnyType> void removeDuplicates(AnyType[] x) {
        for (int i = x.length - 1; i >= 1; i--)
            if (x[i] != null)
                if (x[i] == x[i--]) x[i] = null;
    }
    public static <AnyType> void printArr(AnyType[] arr) {
        for (AnyType anArr : arr)
            System.out.print(anArr + ", ");
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] x = {13, 14, 15, 16, 16, 17, 14, 12, 15, 17};
        quickSort(x);
        removeDuplicates(x);
        printArr(x);
    }


}


