
/*Circular Queue Implementation using Array
 * Operation performed
 * Enqueue=Adding Elements      Time complexity=O(1)
 * Dequeue=removing elements    Time complexity=O(1)
 * peek                         Time complexity=O(1)
 */
public class CircularQueue {
    static class Queue {
        static int arr[];
        static int size;
        static int rear = -1;
        static int front = -1;

        Queue(int n) {
            arr = new int[n];
            this.size = n;
        }

        public static boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public static boolean isFull() {
            return (rear + 1) % size == front;
        }

        // Enqueue operation--O(1)
        public static void add(int data) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
                // First element add
            }
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        // Dequeue operation--O(1)
        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            int result = arr[front];
            // Single element condition
            if (rear == front) {
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }
            return result;
        }

        // peek operation
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String args[]) {
        Queue q = new Queue(5);
        q.add(5);
        q.add(10);
        q.add(15);
        q.add(20);
        q.add(25);
        /*
         * arr=[5,10,15,20,25]
         * arr[0]=front=5
         * arr[4]=rear =25
         * new arr=[30,10,15,20,25]
         * new arr=[30,35,15,20,25]
         */
        System.out.println(q.remove()); // front arr[0]=5
        // 5 removed from front and 30 added through rear // rear arr[0]=30
        q.add(30);
        // index rear=[0]=30 new array=[30,10,15,20,25]

        System.out.println(q.remove()); // front arr[1]=10
        // 10 removed from front and 35 added through rear // rear arr[1]=35
        q.add(35);
        // index rear=arr[1]=35 new array=[30,35,15,20,25]

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }

}
