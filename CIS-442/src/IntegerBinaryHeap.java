//Cadet Jones informed me that you said we could use an Integer binary heap for the increaseKey, decreaseKey, and delete
//methods as they dont work for AnyType. Cadet Goldsmith was my partner for this assignment.
import java.util.Arrays;
public class IntegerBinaryHeap{
    private int currentSize;
    private Integer[] array;
    private Integer maxValue;

    public IntegerBinaryHeap(Integer[] list) {
        this.array = new Integer[list.length];
        this.currentSize = 0;
        buildHeap(list);
    }

    public Integer findMin() {
        return array[1];
    }

    public void deleteMin() {
        Integer minItem = findMin();
        array[1] =  array[currentSize--];
        percolateDown(1);
        if (minItem.equals(maxValue))
            maxValue = Integer.MIN_VALUE;
    }

    public Integer findMax() { return maxValue; }

    private void getNewMax() {
        maxValue = Integer.MIN_VALUE;
        for (int i = 1; i < currentSize; i++)
            if (array[i] > maxValue)
                maxValue = array[i];
    }

    public void increaseKey(int k, Integer num) {
        if (num > 0) array[k] += num;
        percolateDown(k);
    }

    public void decreaseKey(int k, Integer num) {
        if (num > 0) array[k] -= num;
        percolateUp(k);
    }


    private void incrementSize() {
        Integer[] tmp = new Integer[array.length * 2];
        System.arraycopy(array, 1, tmp, 1, array.length - 1);
        System.out.println(array.length);
        array = tmp;
    }

    public void buildHeap(Integer[] list) {
        maxValue = list[0];
        for (int o : list)
            insert(o);
    }

    public void delete(int k) {
        //When the max is subtracted from the num, it makes it
        //a massively small number so that way delete min can clear it out
        decreaseKey(k, Integer.MAX_VALUE);
        deleteMin();
        if (k == maxValue)
            getNewMax();
    }

    public void insert(Integer x) {
        if (currentSize == array.length - 1) incrementSize();
        array[++currentSize] = x;
        percolateUp(currentSize);
        if (maxValue < x) maxValue = x;
    }

    private void percolateUp(int hole) {
        Integer currentNode = array[hole];
        for(; hole / 2 > 0 && currentNode < array[hole / 2]; hole /= 2)
            array[hole] = array[hole / 2];
        array[hole] = currentNode;
    }

    private void percolateDown(int hole) {
        int child;
        Integer currentNode = array[hole];
        for (; hole * 2 <= currentSize; hole = child) {
            child = hole * 2;
            if (child != currentSize && array[child + 1].doubleValue() < array[child].doubleValue())
                child++;
            if (array[child].doubleValue() < currentNode.doubleValue())
                array[hole] = array[child];
            else
                break;
        }
        array[hole] = currentNode;
    }

    public String toString() {
        return "BinaryHeap: " + Arrays.toString(array);
    }

    public static void main(String[] args) {
        Integer[] items = new Integer[22];
        for (int i = 0; i < items.length; i++)
            items[i] = (int)(1 + Math.random() * 25);
        IntegerBinaryHeap heap = new IntegerBinaryHeap(items);
        System.out.println(heap.toString());
        heap.delete(22);
        System.out.println(heap.toString());
        heap.decreaseKey(6, 5);
        heap.increaseKey(5, 5);
        System.out.println(heap.toString());
    }

}