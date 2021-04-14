//Help Received: none
import java.util.Arrays;

public class EnhancedPriorityQueue <AnyType extends Comparable> {
    private AnyType[] pq;
    private static final int QUEUE_CAPACITY = 10;
    private int min;
    private int numElement;
    public EnhancedPriorityQueue() {
        pq = ((AnyType[]) new Comparable[QUEUE_CAPACITY]);
    }
    public void deleteMin() {                   // The running time is O(N) because the function calls the sort()
                                                // method for arrays, which has a time complexity of O(N)
        if (isEmpty()) return;
        pq[min] = null;
        numElement--;
        Arrays.sort(pq);
        min = findMin();
    }

    public void insert(AnyType a) {             //The running time is constant, because elements are added
                                                // in constant time, and if it is the new minimum in the Queue, the min variable is updated
        if (numElement == 0) {
            pq[0] = a;
            min = 0;
            numElement++;
        }
        if (a.compareTo(pq[min]) < 0) {
            min = numElement -1;
            numElement++;
            pq[numElement - 1] = a;
        }
        if (numElement == 1 && a.compareTo(pq[min]) >= 0) {
            pq[numElement] = a;
            numElement++;
        } else {
            pq[numElement - 1] = a;
            numElement++;
        }

    }

    public boolean isEmpty() {
        return (numElement == 0);
    }

    public int findMin() {                      //The running time is constant because it returns the value min holds.
        return min;
    } // O(1), because it is returning the instance variable min

    public void printQueue() {
        for (AnyType aQueue : pq)
            System.out.println(aQueue);
    }

    public static void main(String[] args) {

    }
}