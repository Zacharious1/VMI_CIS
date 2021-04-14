import org.omg.CORBA.Any;

import java.util.Arrays;

/**
 * Cadets Goldsmith and Farr
 * Help received: textbook. Methods where Figure 6.4 says
 * "See online code" were found online, and were written by the author of the book.
 **/

public class BinaryHeap<AnyType extends Comparable<? super AnyType>> {
    private static final int DEFAULT_CAPACITY = 100;
    private int currentSize;
    private AnyType[] minArray;
    private AnyType[] maxArray;

    public BinaryHeap() {
        currentSize = 0;
        minArray = (AnyType[]) new Comparable[DEFAULT_CAPACITY + 2];
        maxArray = (AnyType[]) new Comparable[DEFAULT_CAPACITY + 2];
    }

    public BinaryHeap(AnyType[] items) {
        currentSize = items.length;
        minArray = (AnyType[]) new Comparable[items.length + 2];
        maxArray = (AnyType[]) new Comparable[items.length + 2];
        System.arraycopy(items, 0, minArray, 1, items.length); //IntelliJ IDEA IDE recommended this change.
        System.arraycopy(items, 0, maxArray, 1, items.length); //IntelliJ IDEA IDE recommended this change.
        buildMinHeap();
        buildMaxHeap();
    }

    public void insertMinHeap(AnyType x) {
        if (currentSize + 1 == minArray.length)
            doubleArray();

        int hole = ++currentSize;
        minArray[0] = x;

        while (x.compareTo(minArray[hole / 2]) < 0) {
            minArray[hole] = minArray[hole / 2];
            hole /= 2;
        }
        minArray[hole] = x;
    }

    public void insertMaxHeap(AnyType x) {
        if (currentSize + 1 == maxArray.length)
            doubleArray();

        int hole = ++currentSize;
        maxArray[0] = x;

        while (x.compareTo(maxArray[hole / 2]) > 0) {
            maxArray[hole] = maxArray[hole / 2];
            hole /= 2;
        }
        maxArray[hole] = x;
    }

    public BinaryHeap<AnyType> insert(AnyType[] items) {
        BinaryHeap<AnyType> min = new BinaryHeap<>(items);
        return min;
    }

    public AnyType findMin() {
        return minArray[1];
    }

    public AnyType deleteMin() {
        AnyType minItem = findMin();
        minArray[1] = minArray[currentSize--];
        percolateDownMin(1);

        return minItem;
    }

    public AnyType findMax() {
        return maxArray[1];
    }

    public AnyType deleteMax() {
        AnyType maxItem = findMax();
        maxArray[1] = maxArray[currentSize--];
        percolateDownMax(1);
        return maxItem;
    }

    //What is the kth smallest element
    public AnyType SixA(int kthSmallestEle) {
        AnyType[] tmpArr = (AnyType[]) new Comparable[minArray.length];
        System.arraycopy(minArray, 0, tmpArr, 0, minArray.length);
        AnyType a = null;
        for (int i = 0; i < kthSmallestEle; i++)
            a = deleteMin();

        minArray = tmpArr;
        return a;
    }
    //What is the kth largest element
    public AnyType SixB(int kthLargestEle) {
        AnyType[] tmpArr = (AnyType[]) new Comparable[maxArray.length];
        System.arraycopy(maxArray, 0, tmpArr, 0, maxArray.length);
        AnyType a = null;
        for (int i = 0; i < kthLargestEle; i++)
            a = deleteMax();
        maxArray = tmpArr;
        return a;
    }

    private void buildMinHeap() {
        for (int i = currentSize / 2; i > 0; i--)
            percolateDownMin(i);
    }

    private void buildMaxHeap() {
        for (int i = currentSize / 2; i > 0; i--)
            percolateDownMax(i);
    }

    public boolean isEmpty() {
        return currentSize == 0;
    }

    public void makeEmpty() {
        currentSize = 0;
    }

    private void percolateDownMin(int hole) {
        int child;
        AnyType tmp = minArray[hole];

        for (; hole * 2 <= currentSize; hole = child) {
            child = hole * 2;
            if (child != currentSize && minArray[child + 1].compareTo(minArray[child]) < 0)
                child++;

            if (tmp != null && minArray[child].compareTo(tmp) < 0)
                minArray[hole] = minArray[child];

            else break;
        }
        minArray[hole] = tmp;
    }

    private void percolateDownMax(int hole) {
        int child;
        AnyType tmp = maxArray[hole];

        for (; hole * 2 <= currentSize; hole = child) {
            child = hole * 2;
            if (child != currentSize && maxArray[child + 1].compareTo(maxArray[child]) > 0)
                child++;

            if (tmp != null && maxArray[child].compareTo(tmp) > 0)
                maxArray[hole] = maxArray[child];

            else break;
        }
        maxArray[hole] = tmp;
    }

    private void doubleArray() {
        AnyType[] newMinArray;
        AnyType[] newMaxArray;
        newMinArray = (AnyType[]) new Comparable[minArray.length * 2];
        newMaxArray = (AnyType[]) new Comparable[maxArray.length * 2];
        System.arraycopy(minArray, 0, newMinArray, 0, minArray.length); //Same as above, IDE recommended this change. Said "Manual Array Copy", then suggested this fix.
        System.arraycopy(maxArray, 0, newMaxArray, 0, maxArray.length); //Same as above, IDE recommended this change. Said "Manual Array Copy", then suggested this fix.
        minArray = newMinArray;
        maxArray = newMaxArray;
    }

    public String minToString() {
        return "MinBinaryHeap contents" + Arrays.toString(minArray);
    }

    public String maxToString() {
        return "MaxBinaryHeap contents" + Arrays.toString(maxArray);
    }

    public static void main(String[] args) {
        Integer[] items = new Integer[15];
        for (int i = 0; i < items.length; i++)
            items[i] = (int)(1 + Math.random()*88);

        BinaryHeap<Integer> h1 = new BinaryHeap<>(items);
        System.out.println(h1.minToString());
        System.out.println(h1.maxToString());
        System.out.println("The Min value is: " + h1.findMin());
        System.out.println("The Max value is: " + h1.findMax());
        System.out.println("The Min value " + h1.findMin() + " and the Max value " + h1.findMax() + " have been deleted!");
        h1.deleteMin();
        h1.deleteMax();
        h1.buildMinHeap();
        h1.buildMaxHeap();
        System.out.println("The Min value is: " + h1.findMin());
        System.out.println("The Max value is: " + h1.findMax());
        System.out.println(h1.minToString());
        System.out.println(h1.maxToString());
        System.out.println("The 4th smallest element is: " + h1.SixA(4));
        System.out.println("The 4th Largest element is: " + h1.SixB(4));

    }
}