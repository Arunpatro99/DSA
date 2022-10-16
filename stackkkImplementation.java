/* Stack Implementation through Linked List 
 * operation performed 
 * push
 * pop
 * peek
*/
public class stackkkImplementation {
    static class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    static class Stack{
        public static  Node head;
        public boolean isEmpty() {
            return head == null;
        }
        //push
        public void push(int data) {
            Node newNode = new Node(data);
            if(isEmpty()) {
                head =newNode;
                return;
             }
             newNode.next = head;
             head = newNode;
        }
        //pop
        public int pop () {
            if(isEmpty ()) {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }
        //peek
        public int peek() {
            if(isEmpty ()) {
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String args[]) {
        Stack s =new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);

        while(!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
