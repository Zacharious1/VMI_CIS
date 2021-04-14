package Hashing;

//Help Received: My program was not working for some reason, so Cadet Jones sent me his program and it turns out that 2 of my methods were out of place (in the HashEntry class and shouldn't have been)

public class QuadraticProbing<AnyType> {
    public QuadraticProbing() {
        this(DEFAULT_TABLE_SIZE);
    }

    public QuadraticProbing(int size) {
        allocateArray(size);
        makeEmpty();
    }

    public void print() {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null)
                System.out.println("x");
            if (array[i] != null)
                System.out.println(array[i].element);
        }
    }

    private boolean isActive(int currentPos) {
        return array[currentPos] != null && array[currentPos].isActive;
    }

    public void makeEmpty() {
        currentSize = 0;
        for (int i = 0; i < array.length; i++)
            array[i] = null;
    }

    public boolean contains(AnyType x) {
        int currentPos = findPos(x);
        return isActive(currentPos);
    }

    public void insert(AnyType x) {
        int currentPos = findPos(x);
        if (isActive(currentPos))
            return;

        array[currentPos] = new HashEntry<>(x, true);


        if (++currentSize > array.length / 2)
            rehash();
    }

    private void rehash() {
        HashEntry<AnyType>[] oldArray = array;

        allocateArray(2 * oldArray.length);
        currentSize = 0;

        for (HashEntry<AnyType> entry : oldArray)
            if (entry != null && entry.isActive)
                insert(entry.element);
    }

    public int size() {
        return currentSize;
    }

    public int findPos(AnyType x) {
        int offset = 1;
        int currentPos = myhash(x);
        while (array[currentPos] != null && !array[currentPos].element.equals(x)) {
            currentPos += offset;
            offset += 2;


            if (currentPos >= array.length)
                currentPos -= array.length;
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

    public boolean remove(AnyType x) {
        int currentPos = findPos(x);
        if (isActive(currentPos)) {
            array[currentPos].isActive = false;
            currentSize--;
            return true;
        } else
            return false;
    }

    public static class HashEntry<AnyType> {
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
        if (n % 2 == 0)
            n++;

        for (; !isPrime(n); n += 2)
            ;

        return n;
    }

    private static boolean isPrime(int n) {
        if (n <= 1)
            return false;

        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }


    public static void main(String[] args) {
        QuadraticProbing<Integer> a = new QuadraticProbing(15);
        for (int i = 0; i < a.array.length; i++) {
            a.insert((int)(Math.random() * 150));
        }
        a.insert(15);
        System.out.println(a.contains(15));
        a.remove(15);
    }
}
