/*
 * Building tree in Pre-order
 */

public class BinaryTreePre {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left=null;
            this.right=null;
        }
    }

    static class BinaryTree {
        static int index = -1;
        public Node buildtree ( int nodes []) {
            index++;

            if(nodes[index] == -1){
                return null;
            }

            Node newNode = new Node(nodes[index]);
            newNode.left = buildtree(nodes);
            newNode.right=buildtree(nodes);

            return newNode;
        }
     }
    
    public static void main(String args[]){
        //PreOrder
        int nodes []= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildtree(nodes);
        System.out.println(root.data);
    }

  
}
