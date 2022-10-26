/* Binary Search Tree(BST)                            Time Complexity :-O(H)
a binary search tree (BST), also called an ordered or sorted binary tree
* Note:Strategy:Most problems will be recursion
* Build a Binary Search Tree(BST) 
* Operation performed in a BST
* Insertion in a BST
* Inorder Traversal
* Searching in a BST
* Deletion in a BST
* No   node
* One  node
* Two  node
*/
public class BSTInformation {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    // Insertion in BST
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

    // Searching in a BST
    public static boolean search(Node root, int key) {

        if (root == null) {
            return false;
        }
        if (root.data > key) { // left subtree
            return search(root.left, key);
        } else if (root.data == key) {
            return true;
        } else if (root.data < key) { // right subtree
            return search(root.right, key);
        }
        return false;
    }

    // Deletion in a BST
    public static Node delete(Node root, int value) {
        // Searching for node that going to be deleted
        if (root.data > value) {
            root.left = delete(root.left, value);
        }
        if (root.data < value) {
            root.right = delete(root.right, value);
        }

        else { // root.data == value // Node found which is going to be deleted
               // case 1:- No node
            if (root.left == null && root.right == null) {
                return null;
            }

            // Case 2:- One Node
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // Case 3: Two Node
            Node IS = inorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }

        return root;
    }

    public static Node inorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }

        return root;
    }

    public static void main(String args[]) {
        int values[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
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

        if (search(root, 8)) {
            System.out.println("found");
        } else {
            System.out.println("not found");
        }
        /*
         * 3
         * 4
         * 5
         * 6
         * 8
         * 10
         * 11
         * 14
         * 
         * found
         */
        // Case 1: No Node

        // delete(root, 4);
        // inorder(root);

        // 1 3 4 5 6 8 10 11 14
        // 1 3 6 10 11 14

        // Case 2: One Node
        // delete(root,10);
        // inorder(root);

        // 1 3 4 5 6 8 10 11 14
        // 1 3 4 5 6 8 11 14

        // Case 3: Two Node
        delete(root, 5);
        inorder(root);
        // 1 3 4 5 6 8 10 11 14
        // 1 3 4 6 8 11 14
    }
}
