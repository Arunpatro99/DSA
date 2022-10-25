/* 
Building Tree
Counting the nodes of tree
Sum of the nodes  of  tree
Diameter of a tree
*/
public class TreeInfo {
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
    //No.of nodes Time complexity:-O(n)
    public static int countOfNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int leftNodes = countOfNodes(root.left);
        int rightNodes= countOfNodes(root.right);

        return leftNodes + rightNodes + 1;
    }
    //Sum of Nodes
    public static int sumOfNodes(Node root) {
        if (root == null) {
            return 0;
        }

        int leftSum = sumOfNodes(root.left);
        int rightSum= sumOfNodes(root.right);

        return leftSum + rightSum + root.data;
    }
    //Height of a Tree
    public static int height(Node root) {
        if(root == null) {
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight= height(root.right);

        int myHeight = Math.max(leftHeight, rightHeight ) + 1;

        return myHeight; 
    }
    //First approach Diameter of a Tree
    public static int diameter(Node root) {
        if(root == null) {
            return 0;
        }
        int diameter1 = diameter(root.left);
        int diameter2 = diameter(root.right);
        int diameter3 = height(root.left) + height (root.left) + 1;

        return Math.max(diameter3,Math.max(diameter1,diameter2));
    }

    public static void main(String args[]) {
        // -1 represents null
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildtree(nodes);
        System.out.println(countOfNodes(root));
        //6
        System.out.println(sumOfNodes(root));
        //21
        System.out.println(height(root));
        //3
        System.out.println(diameter(root));
        //5
    }
}

