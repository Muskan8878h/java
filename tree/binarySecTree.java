import java.util.IllformedLocaleException;

class Node{
    int key;
    Node left;
    Node right;
    public Node(int item){
        key=item;
        left=null;
        right=null;
    }
}
public class binarySecTree {
    static Node root;
    public binarySecTree(){
        root=null;
    }
    public void preOrder(Node root){
        if(root==null) return;
        System.out.print(root.key+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public void inOrder(Node root){
        if(root==null) return;
        inOrder(root.left);
        System.out.print(root.key+" ");
        inOrder(root.right);
    }
    public void postOrder(Node root){
        if(root==null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.key+" ");
    }
    public int height(Node node){
        if(node==null){
            return -1;
        }
        else{
            int leftHeight=height(node.left);
            int rightHeight=height(node.right);
            return Math.max(leftHeight,rightHeight)+1;
        }
    }
    public static void main(String[] args) {
        binarySecTree tree = new binarySecTree();
        int arr[] = {80, 60, 90, 10, 70, 85, 110,-340};
        int i;
        root = new Node(arr[0]);
        for (i = 0; i < arr.length; i++) {
            tree.insert(root, arr[i]);
        }
//        System.out.println("inorder");
//        tree.inOrder(root);
//        System.out.println();
//        System.out.println("preorder");
//        tree.preOrder(root);
//        System.out.println();
//        System.out.println("postorder");
//        tree.postOrder(root);
//        System.out.println();
//        System.out.println("minimum value value in the tree "+tree.findMin(root));
        System.out.println(tree.height(root));
    }
    public int findMin(Node root){
        if(root==null) throw new IllformedLocaleException("tree is empty");
        if(root.left==null) return root.key;
        return findMin(root.left);
    }
    public Node insert(Node root, int key) {
        if(root==null){
            root=new Node(key);
            return root;
        }
        if(key<root.key) root.left=insert(root.left,key);
        else if(key>root.key) root.right=insert(root.right,key);
        return root;
    }
}