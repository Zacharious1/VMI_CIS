//Help received: https://www.quora.com/What-is-the-time-complexity-of-compareTo-function-in-Java for learning the time complexity of compareTo in Comparable
public class MyPriorityQueue <AnyType extends Comparable> {
    private AnyType[] pq;
    private static final int QUEUE_CAPACITY = 10;
    public MyPriorityQueue() {
        pq = ((AnyType[]) new Comparable[QUEUE_CAPACITY]);
    }
    public void deleteMin() {                   // The running time is O(N) because the funtion calls the findMin()
                                                // method, which has a time complexity of O(N)
        if (isEmpty()) return;
        int a = findMin();
        pq[a] = null;
    }

    public void insert(AnyType a) {             //The running time is O(N) because the for loop runs the
                                                // length of the array in the worst case
        for (int i = 0; i <pq.length; i++)
            if (pq[i] == null){
                pq[i] = a;
                break;
            }
    }

    public boolean isEmpty() {
        return (pq[0] == null);
    }

    public int findMin() {                      //The running time is O(N) because the loop runs the length of the array.
                                                // I saw online that the time complexity of compareTo() depends on the
                                                // implementation, and im not sure how long it is in this particular case,
                                                // so to the best of my knowledge, the running time is O(N)
        if (isEmpty()) return -1;
        int a = 0;
        for (int i = 1; i < pq.length; i++)
            if (pq[i].compareTo(pq[a]) < 0)
                a = i;
        return a;
    }
    public void printQueue() {
        for (AnyType aQueue : pq)
            System.out.println(aQueue);
    }

    public static void main(String[] args) {
        MyPriorityQueue p = new MyPriorityQueue();
        p.insert(4);
        p.deleteMin();
        p.printQueue();
        System.out.println();
        System.out.println(p.findMin());

    }
}
