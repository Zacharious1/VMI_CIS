//Help Received: none
import java.util.Arrays;
public class SortedSetC <AnyType extends Comparable> {
    private AnyType[] set;
    private static final int CAP = 10;
    public SortedSetC() {
        set = ((AnyType[]) new Comparable[CAP]);
    }

    public void add(AnyType x){         //the running time is O(N^2), as a for loop is O(N),
                                        // and the sort method is O(N^2). O(N^2) is has a greater
                                        // time complexity, so the overall time complexity is O(N^2)
        if (set[set.length-1] != null) return;
        for (int i = 0; i < set.length; i++) {
            if (set[i] == null) {
                set[i] = x;
                break;
            }
        }
        Arrays.sort(set);
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

    public AnyType first() {        //The running time is O(log N), because binary search is used, and repeated halving has a time complexity of log N
        return set[binSearch(set, set[set.length-1])];
    }
    public AnyType last() {         //The time complexity is the same as above, O(log n), because binary search is used.
        return set[binSearch(set, set[0])];
    }

}
