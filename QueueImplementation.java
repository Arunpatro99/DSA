
/* Queue Implementation using java Collection framework 
 * Operation performed
 * Enqueue=Adding Elements      Time complexity=O(1)
 * Dequeue=removing elements    Time complexity=O(1)
 * peek                         Time complexity=O(1)
*/
import java.util.*;

public class QueueImplementation {
    public static void main(String args[]) {
        /*
         * Queue is a Interface implements two class LinkedList and ArrayDeque class.
         * Class has objects while Interface has no objects.
         */

        // First Implementation using Linkedlist
        Queue<Integer> q = new LinkedList<>();

        // Second Implementation using ArrayDeque
        // Queue<Integer> q = new ArrayDeque<>();
        q.add(100);
        q.add(200);
        q.add(300);
        q.add(400);
        q.add(500);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
