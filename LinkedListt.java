/* LinkedList Implementation in java
* Operation perfomed
* Insert (First,Last)          Timecomplexity = O(1)
* Print                        Timecomplexity = O(n)
* Delete(First,Last)
* Tracking size of LinkedList
* Reversing a Linked List with multiple approaches
* Iterative
* Recursive
*/
public class LinkedListt {

    Node head;
    private int size;

    LinkedListt() {
        this.size = 0;
    }

    // Node Creation
    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // Insert Operation
    // Insert(add) at First position
    public void insertAtFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // Insert(add) at Last position
    public void insertAtLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }

    // Print Operation
    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    // Delete Operation
    // Delete from First
    public void deleteFromFirst() {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }
        size--;
        head = head.next;

    }

    // Delete from last

    public void deleteFromLast() {
        // Head is null
        if (head == null) {
            System.out.println("This list is empty");
            return;
        }
        size--;
        // LinkedList having Single Node
        if (head == null) {
            head = null;
            return;
        }
        // Traverse
        Node secondFromLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondFromLast = secondFromLast.next;
        }

        secondFromLast.next = null;
    }

    // Tracking size of LinkedList
    public int getSize() {
        return size;
    }

    // Reversing a List using Iterative approach
    public void reverseIterate() {
        // When LinkedList is empty or having single Node
        if (head == null || head.next == null) {
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;
        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            prevNode = currNode;
            currNode = nextNode;
        }

        head.next = null;
        head = prevNode;
    }

    // Reversing a List using recursive approachg
    public Node reverseRecursive(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node newHead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }

    public static void main(String args[]) {

        LinkedListt List = new LinkedListt();

        // Inserting & Tracking the size of LinkedList

        List.insertAtFirst("is");
        List.insertAtFirst("Name");
        List.printList();

        List.insertAtLast("Tingu");
        List.printList();

        List.insertAtFirst("My");
        List.printList();
        System.out.println(List.getSize());

        // Reversing a List using Iterative approach
        List.reverseIterate();
        List.printList();

        /*
         * Before:My -> Name -> is -> Tingu -> NULL
         * After :Tingu -> is -> Name -> My -> NULL
         */

        // Reversing a List using Recursive approach
        // List.head = List.reverseRecursive(List.head);
        // List.printList();
        // System.out.println(List.getSize());

        /*
         * Before:My -> Name -> is -> Tingu -> NULL
         * Size :4
         * After :Tingu -> is -> Name -> My -> NULL
         */
    }

}
