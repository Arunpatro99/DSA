/* Binary Search Tree(BST)                            Time Complexity :-O(H)
   a binary search tree (BST), also called an ordered or sorted binary tree
 * Note:Strategy:Most problems will be recursion
 * Build a Binary Search Tree(BST) 
 * Insert nodes
 * Inorder Traversal
 */
public class BST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }

        if (root.data > value) {
            // left subtree
            root.left = insert(root.left, value);
        }

        else {
            root.right = insert(root.right, value);
        }

        return root;

    }

    // Inorder Traversal

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.println(root.data + " ");
        inorder(root.right);
    }

    public static void main(String args[]) {
        int values[] = { 10, 5, 7, 6, 4, 12 };
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        inorder(root);
        System.out.println();
        /*
         * 4
         * 5
         * 6
         * 7
         * 10
         * 12
         */
    }
}
