/*
 * PreOrder Tree traversal Time complexity= O(n)
 * Root                     
 * Left subtree
 * right subtree
 */

public class PreOrderTraversal {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int index = -1;

        public Node buildtree(int nodes[]) {
            index++;

            if (nodes[index] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[index]);
            newNode.left = buildtree(nodes);
            newNode.right = buildtree(nodes);

            return newNode;
        }
    }
    //PreOder Tree traversal
    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.println(root.data + "  ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String args[]) {
        // PreOrder
        // -1 represents null
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildtree(nodes);
        /*
         * PreOrder
         * first=root
         * then left subtree
         * then rigth subtree
         */
        preorder(root);

    }
}
