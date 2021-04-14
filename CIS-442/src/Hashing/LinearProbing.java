package Hashing;
import java.util.Arrays;

public class LinearProbing<AnyType> {
    public LinearProbing() {
        this(DEFAULT_TABLE_SIZE);
    }

    public LinearProbing(int size) {
        allocateArray(size);
        makeEmpty();
    }

    private void print() {
        for (HashEntry<AnyType> anyTypeHashEntry : array) {
            if (anyTypeHashEntry == null)
                System.out.println("x");
            if (anyTypeHashEntry != null)
                System.out.println(anyTypeHashEntry.element);
        }
    }

    private boolean isActive(int currentPos) {
        return array[currentPos] != null && array[currentPos].isActive;
    }

    public void makeEmpty() {
        currentSize = 0;
        Arrays.fill(array, null);
    }

    public boolean contains(AnyType x) {
        int currentPos = findPos(x);
        return isActive(currentPos);
    }

    public void insert(AnyType x) {
        int currentPos = findPos(x);
        if (isActive(currentPos)) return;

        array[currentPos] = new HashEntry<>(x, true);

        if (++currentSize > array.length / 2) rehash();
    }

    private void rehash() {
        HashEntry<AnyType>[] oldArray = array;

        allocateArray(2 * oldArray.length);
        currentSize = 0;

        for (HashEntry<AnyType> entry : oldArray)
            if (entry != null && entry.isActive) insert(entry.element);
    }

    public int size() {
        return currentSize;
    }

    private int findPos(AnyType x) {
        int start = 1;
        int currentPos = myhash(x);
        while (array[currentPos] != null && !array[currentPos].element.equals(x)) {
            currentPos += start++;
            if (currentPos >= array.length) currentPos -= array.length;
        }
        return currentPos;
    }

    private int myhash(AnyType x) {
        int hashVal = x.hashCode();

        hashVal %= array.length;
        if (hashVal < 0)
            hashVal += array.length;

        return hashVal;
    }

    public void remove(AnyType x) {
        int currentPos = findPos(x);
        if (isActive(currentPos)) {
            array[currentPos].isActive = false;
            currentSize--;
        }
    }

    private static class HashEntry<AnyType> {
        public AnyType element;
        public boolean isActive;

        public HashEntry(AnyType x) {
            this(x, true);
        }

        public HashEntry(AnyType x, boolean i) {
            element = x;
            isActive = i;
        }
    }

    public static final int DEFAULT_TABLE_SIZE = 11;

    private HashEntry<AnyType>[] array;
    private int currentSize;

    private void allocateArray(int arraySize) {
        array = new HashEntry[nextPrime(arraySize)];
    }

    private static int nextPrime(int n) {
        if (n % 2 == 0) n++;

        while (!isPrime(n)) n += 2;
        return n;
    }

    private static boolean isPrime(int n) {
        if (n <= 1) return false;

        for (int i = 2; i < n; i++)
            if (n % i == 0) return false;
        return true;
    }

    public static void main(String[] args) {

        LinearProbing<Integer> a = new LinearProbing<Integer>(15);
        for (int i = 0; i < a.array.length; i++) a.insert((int) (Math.random() * 150));
        a.insert(15);
        System.out.println(a.contains(15));
        a.remove(15);

    }

}
