//Help Received: in class help.
public class findMaxAndMin {
    public static double[] findMaxAndMinV2(double[] arr) {
        int left = 0;
        int right = arr.length-1;
        double[] maxMin= {arr[0], arr[0]};
        return findMaxMinElementsV2(arr,left, right ,maxMin);
    }

    public static double[] findMaxMinElementsV2(double[] arr, int left, int right, double[] maxMin) {
        if (left == right) {
            if(arr[left] < maxMin[0])
                maxMin[0] = arr[left];
            if (arr[left] > maxMin[1])
                maxMin[1] = arr[left];
            return maxMin;
        }
        int center = (left+right)/2;
        findMaxMinElementsV2(arr, left, center, maxMin);
        return findMaxMinElementsV2(arr, center + 1, right, maxMin);
    }

    public static void printArr(double[] arr) {
        for (int i = 0; i <arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        double[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        printArr(findMaxAndMinV2(a));
    }
}
