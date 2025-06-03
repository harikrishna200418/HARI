import java.util.ArrayDeque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
    
        ArrayDeque<String> deque = new ArrayDeque<>();

        // Add elements to both ends
        deque.addFirst("virat");
        deque.addLast("kohli");
        deque.offerFirst("hari");
        deque.offerLast("krishna");

        // Display the deque
        System.out.println("Deque: " + deque);

        // Peek at both ends
        System.out.println("First element: " + deque.peekFirst());
        System.out.println("Last element: " + deque.peekLast());

        // Remove elements from both ends
        System.out.println("Removed from front: " + deque.removeFirst());
        System.out.println("Removed from rear: " + deque.removeLast());

        // Display remaining deque
        System.out.println("Deque after removals: " + deque);

        // Check size and if empty
        System.out.println("Size: " + deque.size());
        System.out.println("Is empty? " + deque.isEmpty());

        // Clear the deque
        deque.clear();
        System.out.println("Deque after clear: " + deque);
        System.out.println("Is empty now? " + deque.isEmpty());
    }
}