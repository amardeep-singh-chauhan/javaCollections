import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriortyQueue {

    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();
//        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); // to reverse the order

        pq.offer(40); // to add the element in priortyqueue and minHeap implements by default
        pq.offer(12);
        pq.offer(24);
        pq.offer(36);
        System.out.println(pq);

        System.out.println(pq.poll()); // to get the first element
        System.out.println(pq.peek()); // to peek next out element

        System.out.println(pq);
    }
}
