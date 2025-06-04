import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        // Create a PriorityQueue of Integers (min-heap by default)
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Add elements
        pq.add(17);
        pq.add(333);
        pq.add(6);
        pq.offer(18);  // Similar to add()

        // Display elements (not sorted)
        System.out.println("PriorityQueue (unsorted view): " + pq);

        // Peek at the head (smallest element)
        System.out.println("Head of queue (peek): " + pq.peek());

        // Remove the head (smallest element)
        System.out.println("Removed element (poll): " + pq.poll());

        // Display remaining elements
        System.out.println("After poll: " + pq);

        // Remove specific element
        pq.remove((Integer) 6);
        System.out.println("After removing 6: " + pq);

        // Contains and size
        System.out.println("Contains 18? " + pq.contains(18));
        System.out.println("Queue size: " + pq.size());

        // Clear the queue
        pq.clear();
        System.out.println("Is queue empty? " + pq.isEmpty());
    }
}