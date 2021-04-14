public class SortingAlgorithms {
    public static final int CUTOFF = 20;
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

    public static <AnyType extends Comparable<AnyType>> void shellSort(AnyType[] arr) { //Running time - O(N^2)

        int j;
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {

            for (int i = gap; i < arr.length; i++) {
                AnyType tmp = arr[i];

                for (j = i; j >= gap && tmp.compareTo(arr[j - gap]) < 0; j-= gap)
                    arr[j] = arr[j - gap];

                arr[j] = tmp;
            }
        }
        printArr(arr);
    }

    public static <AnyType extends Comparable<AnyType>> void shellSortHibbard(AnyType[] arr) { //running time = O(N^1.5)
        int j;
        int k;
        for(k = 1; Math.pow(2, k) - 1 < arr.length; k++)
        for (int m = k; m >= 1; m--) {
            int gap = (int) (Math.pow(2, m) - 1);
            for (int i = gap; i < arr.length; i++) {
                AnyType tmp = arr[i];

                for (j = i; j >= gap && tmp.compareTo(arr[j - gap]) < 0; j-= gap)
                    arr[j] = arr[j - gap];

                arr[j] = tmp;
            }
        }
        printArr(arr);
    }

    public static <AnyType extends Comparable<AnyType>> void mergeSort(AnyType[] a) { //worse case for MergeSort is O(NlogN)
        AnyType[] tmpArray = (AnyType[]) new Comparable[a.length];
        mergeSort(a, tmpArray, 0, a.length - 1);

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

    public static <AnyType extends Comparable<AnyType>> void
        mergeSort(AnyType[] a, AnyType[] tmpArray, int left, int right) { //page 364/5
        if (left < right) {
            int center = (left + right) / 2;
            mergeSort(a, tmpArray, left, center);
            mergeSort(a, tmpArray, center + 1, right);
            merge(a, tmpArray, left, center + 1, right);
        }
    }
    private static <AnyType extends Comparable<AnyType>> void
                    merge(AnyType[] a, AnyType[] tmpArray, int leftPos, int rightPos, int rightEnd){ //linear overhead
        int leftEnd = rightPos - 1;
        int tmpPos = leftPos;
        int numElements = rightEnd - leftPos + 1;

        while (leftPos <= leftEnd && rightPos <= rightEnd)
            if(a[leftPos].compareTo(a[rightPos]) <= 0)
                tmpArray[tmpPos++] = a[leftPos++];
            else tmpArray[tmpPos++] = a[rightPos++];
        while(leftPos <= leftEnd)
            tmpArray[tmpPos++] = a[leftPos++];
        while (rightPos <= rightEnd)
            tmpArray[tmpPos++] = a[rightPos++];
        for (int i = 0; i < numElements; i++, rightEnd--) {
            a[rightEnd] = tmpArray[rightEnd];
        }
    }
    public static <AnyType> void printArr(AnyType[] arr) {
        for (AnyType anArr : arr)
            System.out.print(anArr + ", ");
        System.out.println();
    }
    //best way to pick a pivot for quicksort is to pick the median of 3. look at left, center, and right element, arrange them, and pick the median

    public static void main(String[] args) {
        Integer[] arr = {81, 94, 11, 96, 12, 35, 17, 95, 28, 58, 41, 75, 15};
        quickSort(arr);
        printArr(arr);
    }
}
