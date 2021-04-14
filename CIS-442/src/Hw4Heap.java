import java.util.Arrays;

public class Hw4Heap{

    private static final int DEFAULT_CAPACITY = 10;
    private int currentSize;     // Number of elements in heap
    private Integer[] array;   // The heap array
    private Integer maxValue;

    public Hw4Heap() {
        this.array = new Integer[DEFAULT_CAPACITY]; // found on google
        this.currentSize = 0;
    }

    public Hw4Heap(int size) {
        this.array = new Integer[size];
        this.currentSize = 0;
    }

    public Integer findMin() {
        return this.array[1];
    }

    public Integer findMax() {
        return this.maxValue;
    }

    private void getNewMax() {
        this.maxValue = Integer.MIN_VALUE;
        for (int i = 1; i < this.currentSize; i++)
            if (this.array[i] > this.maxValue)
                this.maxValue = this.array[i];
    }

    public void increaseKey(int p, Integer delta) {

        // should run in O(log n)
        if (delta > 0)
            array[p] += delta;
        percolateDown(p);
    }

    public void decreaseKey(int p, Integer delta) {

        // should run in O(log n)
        if (delta > 0)
            array[p] -= delta;
        percolateUp(p);
    }


    private void incrementSize() {
        Integer[] tmp = new Integer[this.array.length * 2];
        for (int i = 1; i < this.array.length; i++)
            tmp[i] = this.array[i];
        System.out.println(this.array.length);
        this.array = tmp;
    }

    public void buildHeap(Integer[] list) {
        this.maxValue = list[0];
        for (int o : list)
            this.insert(o);
    }

    public void delete(int p) {
        decreaseKey(p, Integer.MAX_VALUE);
        deleteMin();
        if (p == this.maxValue)
            getNewMax();
    }

    public void insert(Integer x) {
        if( currentSize == array.length - 1 )
            this.incrementSize();

        this.array[++this.currentSize] = x;
        percolateUp(this.currentSize);

        if (this.maxValue < x)
            this.maxValue = x;
    }


    public void deleteMin() {
        Integer minItem = findMin();
        this.array[1] =  this.array[this.currentSize--];
        percolateDown(1);
        int a = 0;
        a -= 10;
        if (minItem == this.maxValue)
            this.maxValue = Integer.MIN_VALUE;
    }

    private void percolateUp(int hole) {
        Integer currentNode = this.array[hole];
        for(; hole / 2 > 0 && currentNode < array[hole / 2]; hole /= 2)
            array[hole] = array[hole / 2];
        array[hole] = currentNode;
    }

    private void percolateDown(int hole) {
        int child;
        Integer currentNode = this.array[hole];
        for (; hole * 2 <= this.currentSize; hole = child) {
            child = hole * 2;
            if (child != this.currentSize && this.array[child + 1].doubleValue() < this.array[child].doubleValue())
                child++;
            if (this.array[child].doubleValue() < currentNode.doubleValue())
                this.array[hole] = this.array[child];
            else
                break;
        }
        this.array[hole] = currentNode;
    }

    @Override
    public String toString() {
        return "BinaryHeap{" +
                "currentSize=" + currentSize +
                ", array=" + Arrays.toString(array) +
                '}';
    }

    public static void main(String[] args) {
        int n = 20;
//        int k = 15;
        Integer[] items = new Integer[n];
        for (int i = 0; i < n; i++)
            items[i] = (int)(Math.random() * n) + 1;
        Hw4Heap heap = new Hw4Heap(n);
        heap.buildHeap(items);
        System.out.println(heap);
        heap.delete(3);
        System.out.println(heap);
        heap.delete(3);
        System.out.println(heap);
        heap.decreaseKey(10, 5);
        System.out.println(heap);
        heap.increaseKey(5, 5);
        System.out.println(heap);
    }

}