/* LinkedList Implementation in java
 * Operation perfomed
 * Insert (First,Last)          Timecomplexity = O(1)
 * Print                        Timecomplexity = O(n)
 * Delete(First,Last)
 * Tracking size of LinkedList
 */
public class LinkedList {
    Node head;
    private int size;

    LinkedList() {
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

    public static void main(String args[]) {

        LinkedList List = new LinkedList();

        // Inserting & Tracking the size of LinkedList

        List.insertAtFirst("is");
        List.insertAtFirst("Name");
        List.printList();

        List.insertAtLast("Tingu");
        List.printList();

        List.insertAtFirst("My");
        List.printList();
        System.out.println(List.getSize());

        /*
         * My -> Name -> is -> Tingu -> NULL
         * Size=4(My -> Name -> is -> Tingu)
         */

        // Deleting & Tracking the size of LinkedList'

        List.deleteFromFirst();
        List.printList();
        System.out.println(List.getSize());

        /*
         * Before - My -> Name -> is -> Tingu -> NULL
         * After - Name -> is -> Tingu -> NULL
         * size=3(Name -> is -> Tingu)
         */

        List.deleteFromLast();
        List.printList();
        System.out.println(List.getSize());

        /*
         * Before - Name -> is -> Tingu -> NULL
         * After - Name -> is -> NULL
         * size -2( Name -> is)
         * 
         * Null never counted
         */

    }

}
