public class ShellSort {

    public static <AnyType extends Comparable<AnyType>> void shellSort(AnyType[] arr) { //Running time = O(N^2)
        int j;
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < arr.length; i++) {
                AnyType tmp = arr[i];
                for (j = i; j >= gap && tmp.compareTo(arr[j - gap]) < 0; j-= gap)
                    arr[j] = arr[j - gap];
                arr[j] = tmp;
            }
        }
    }

    public static <AnyType extends Comparable<AnyType>> void shellSortHibbard(AnyType[] arr) { //running time = O(N^1.5), 2^k-1 increments
        int j, k;
        for(k = 1; Math.pow(2, k) - 1 < arr.length; k++) {
            for (int m = k; m >= 1; m--) {
                int gap = (int) (Math.pow(2, m) - 1);
                for (int i = gap; i < arr.length; i++) {
                    AnyType tmp = arr[i];
                    for (j = i; j >= gap && tmp.compareTo(arr[j - gap]) < 0; j -= gap)
                        arr[j] = arr[j - gap];
                    arr[j] = tmp;
                }
            }
        }
    }
    public static <AnyType extends Comparable<AnyType>> void shellSortKnuth(AnyType[] arr) { //(3^k-1)/2 increments
        int j, k;
        for(k = 1; (Math.pow(3, k) - 1) / 2 < arr.length; k++) {
            for (int m = k; m >= 1; m--) {
                int gap = (int) (Math.pow(3, k) - 1) / 2;
                for (int i = gap; i < arr.length; i++) {
                    AnyType tmp = arr[i];
                    for (j = i; j >= gap && tmp.compareTo(arr[j - gap]) < 0; j -= gap)
                        arr[j] = arr[j - gap];
                    arr[j] = tmp;
                }
            }
        }
    }
    public static <AnyType extends Comparable<? super AnyType>> void shellSortGonnet( AnyType [ ] a ) {
        for (int gap = a.length / 2; gap > 0;
             gap = gap == 2 ? 1 : (int) ( gap / 2.2 ) )
            for (int i = gap; i < a.length; i++ ) {
                AnyType tmp = a[ i ];
                int j = i;
                for( ; j >= gap && tmp.compareTo( a[j-gap] ) < 0; j -= gap )
                    a[ j ] = a[ j - gap ];
                a[ j ] = tmp;
            }
    }

    public static <AnyType extends Comparable<AnyType>> void shellSortSedgewick(AnyType[] arr) {
        int j, k;
        for(k = 1; 9 * Math.pow(4, k) - 9 * Math.pow(2, k) + 1 < arr.length; k++) {
            for (int m = k; m >= 1; m--) {
                int gap = (int) (Math.pow(2, m) - 1);
                for (int i = gap; i < arr.length; i++) {
                    AnyType tmp = arr[i];
                    for (j = i; j >= gap && tmp.compareTo(arr[j - gap]) < 0; j -= gap)
                        arr[j] = arr[j - gap];
                    arr[j] = tmp;
                }
            }
        }
    }
    public static <AnyType> void printArr(AnyType[] arr) {
        for (AnyType anArr : arr)
            System.out.print(anArr + ", ");
        System.out.println();
    }

    public static void initialize(Integer[] x) {
        for (int i = 0; i < x.length; i++)
            x[i] = 1 + (int) (Math.random() * 100000);
    }

        public static void main (String[]args){
            Integer[] arr = new Integer[640000];
            initialize(arr);
            long start = System.currentTimeMillis();
            shellSortSedgewick(arr);
            long end = System.currentTimeMillis();
            long totalTime = end - start;
            System.out.println(totalTime);
        }


    }
