import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedListQueue {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(12); // to add the element in queue
        queue.offer(24);
        queue.offer(36);
        System.out.println(queue);

        System.out.println(queue.poll()); // to get the element from queue (first as it's FIFO)
        System.out.println(queue.peek()); // to peek the element

        System.out.println(queue);

    }
}
