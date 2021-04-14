
public class PriorityQueue {

    private static int minIndex;
    private static int maxIndex;


    public static boolean insert(Integer[] arr, int n) {
        if (isEmpty(arr))
            arr[0] = n;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                arr[i] = n;
                if (arr[i] > arr[maxIndex])
                    maxIndex = i;
                if (arr[i] < arr[minIndex])
                    minIndex = i;
                System.out.println("The number " + n + " has been inserted into array at index " + i);
                break;
            }
        }
        return true;
    }

    public static int findMin(Integer[] arr) {
        return arr[minIndex];
    }

    public static int findMax(Integer[] arr) {
        return arr[maxIndex];
    }

    public static void deleteMin(Integer[] arr) {
        arr[minIndex] = null;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null)
                if (arr[i] < min)
                    maxIndex = arr[i];
        }
    }

    public static void deleteMax(Integer[] arr) {
        arr[maxIndex] = null;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null)
                if (arr[i] > max)
                    maxIndex = arr[i];
        }
    }

    public static boolean isEmpty(Integer[] arr) {
        for (Integer integer : arr) {
            if (integer != null) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Integer[] a = new Integer[15];

        for (int i = 0; i < a.length; i++) {
            insert(a, 1 + (int) (Math.random() * 1000));
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println();
        System.out.println("The Max is: " + findMax(a));
        System.out.println("The Min is: " + findMin(a));
        System.out.println();


        deleteMax(a);
        deleteMin(a);
    }
}