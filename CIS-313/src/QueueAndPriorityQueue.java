import java.util.LinkedList;
import java.util.Queue;
import java.util.PriorityQueue;
public class QueueAndPriorityQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        System.out.println("Original List");
        for (int i = 0; i < 5; i++) {
            int x = 1 + (int) (Math.random() * 100);
            System.out.println(x);
            priorityQueue.add(x);
            queue.add(x);
        }
        System.out.println("\n Queue");
        while (!queue.isEmpty())
            System.out.println(queue.remove());

        System.out.println("\n Priority Queue");
        while (!priorityQueue.isEmpty())
            System.out.println(priorityQueue.remove());
    }
}
