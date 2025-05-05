// package tree;

class Node {
    char key;
    Node left;
    Node right;
    public Node(char item){
        key=item;
        left=null;
        right=null;
    }
}
class BinaryTree {
    Node root;
    public static void preOrderTraversal(Node node){
        if (node != null) {
            System.out.print(node.key + " ");
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
        }
    }
    public static void inOrderTraversal(Node node){
        if (node != null) {
            inOrderTraversal(node.left);
            System.out.print(node.key + " ");
            inOrderTraversal(node.right);
        }
    }
    public static void postOrderTraversal(Node node){
        if (node != null) {
            postOrderTraversal(node.left);
            postOrderTraversal(node.right);
            System.out.print(node.key + " ");
        }
    }
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root=new Node('1');
        tree.root.left = new Node('2');
        tree.root.right = new Node('3');
        tree.root.left.left = new Node('4');
        tree.root.left.right = new Node('5');

        System.out.println("Pre order traversal");
        tree.preOrderTraversal(tree.root);
        System.out.println();

        System.out.println("In order traversal"); 
        tree.inOrderTraversal(tree.root);
        System.out.println();

        System.out.println("Post order traversal");
        tree.postOrderTraversal(tree.root);
        System.out.println();
    }
}
