//Help Received: I bounced ideas off of Zac Harris, who would tell me if he thought they might work or not.
import java.util.Arrays;
import java.util.stream.IntStream;

public class SortedSetD <AnyType extends Comparable>{
    private AnyType[] arr;
    private static final int CAP = 10;
    public SortedSetD() {
        arr = ((AnyType[]) new Comparable[CAP]);
    }

    public void add(AnyType x){                     //O(N^2), because the for loop runs through N elements in worst case, and the sort method from arrays is O(N^2), which is the larger of the 2
        if (isEmpty()) {arr[0] = x; return; }
        if (arr[arr.length-1] != null) return;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                arr[i] = x;
                break;
            }
        }
        Arrays.sort(arr);
    }

    public void removeVal(AnyType x) { //O(log N), because binary search is used to find the element's location.
        if (isEmpty()) return;
        if (find(x) != -1) arr[find(x)] = null;
    }

    public int find(AnyType x) {
        return binSearch(arr, x);
    } //O(log N), because binary search is used to find the desired object.

    public boolean isEmpty() {
        for (AnyType anArr : arr) if (anArr != null) return false;
        return true;
    }

    public void makeEmpty() {
        IntStream.range(0, arr.length).forEach(i -> arr[i] = null);
    }

    public String toString() {
        return super.toString();
    }

    public int binSearch(AnyType[] a, AnyType key) {
        int low = 0;
        int high = a.length-1;
        while (low <= high) {
            int mid = (low+high) / 2;
            if (key.compareTo(a[mid]) < 0) {
                high = mid - 1;
            }
            else if (key == a[mid])
                return mid;
            else low = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {

    }
}
