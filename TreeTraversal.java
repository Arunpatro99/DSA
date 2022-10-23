/* Building Tree and traversing of Tree
 * Tree traversal            
 * Operation performed
 * PreOder                    Time complexity=O(n)
 * Left subtree                   
 * right subtree
 * root
 * Inorder                   Time complexity=O(n)
 * Left subtree
 * root
 * right subtree
 * PostOrder                 Time complexity=O(n)
 * left subtree
 * right subtree
 * root
 */
public class TreeTraversal {
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

    // PreOrder Tree traversal
    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.println(root.data + " ");
        inorder(root.left);
        postorder(root.right);

    }

    // Inorder Tree traversal
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.println(root.data + " ");
        postorder(root.right);

    }

    // PostOrder Tree traversal
    public static void postorder(Node root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data + " ");
    }

    public static void main(String args[]) {
        // -1 represents null
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildtree(nodes);
        /*
         * preorder(root);
         * 1
         * 4
         * 2
         * 5
         * 6
         * 3
         */
        /*
         * inorder(root);
         * 4
         * 2
         * 5
         * 1
         * 6
         * 3
         */

        postorder(root);
        /*
         * 4
         * 5
         * 2
         * 6
         * 3
         * 1
         */

    }
}
