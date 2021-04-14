//Help Received: none
public class MyQueue<AnyType extends Comparable> {
    private AnyType[] queue;
    private static final int QUEUE_CAPACITY = 10;
    public MyQueue() {
        queue = ((AnyType[]) new Comparable[QUEUE_CAPACITY]);
    }

    public void enqueue(AnyType a) {    //Running time is O(N) because the
                                        // for loop checks to see if the array at i
                                        // is null so that data can be entered
        for (int i = 0; i < queue.length; i++) {
            if (queue[i] == null) {
                queue[i] = a;
                break;
            }
        }
    }
    public void dequeue() {             //The running time is O(N) because the for loop
                                        // runs the length of the array to shift the elements
                                        // down an index when an item is deleted
        queue[0] = null;
        for (int i = 0; i < queue.length-1; i++) {
            if (queue[i+1] == queue[i]) {
                queue[i + 1] = null;
                queue[i] = null;
                break;
            }
            else queue[i] = queue[i+1];
        }
    }
    public AnyType getFront() {         //The running time is O(1) because the method returns
                                        // the first element in the array
        return queue[0];
    }
    public void printQueue() {
        for (AnyType aQueue : queue) {
            System.out.println(aQueue);
        }
    }

    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.enqueue(0);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);
        queue.enqueue(8);
        queue.enqueue(9);
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(10);
        queue.enqueue(11);
        queue.enqueue(12);
        queue.enqueue(13);
        queue.printQueue();

    }
}
