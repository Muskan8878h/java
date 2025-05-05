import java.util.*;
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
public class levelOrderTree {
    static Node root;
    public levelOrderTree(){
        root=null;
    }
    public Node insert(Node root,int key){
        if(root==null){
            root=new Node(key);
            return root;
        }
        if(key< root.key){
            root.left=insert(root.left,key);
        }
        else if(key>root.key){
            root.right=insert(root.right,key);
        }
        return root;
    }
    public void levelOrder(Node node){
        if(node==null) return;
        Queue<Node> qu = new LinkedList<>();
        qu.add(node);
        while(!qu.isEmpty()){
            Node current=qu.poll();
            System.out.print(current.key+" ");
            if(current.left!=null){
                qu.add(current.left);
            }
            if(current.right!=null){
                qu.add(current.right);
            }
        }
    }
    public static void main(String[] args) {
        levelOrderTree tree=new levelOrderTree();
        int arr[]={80,90,60,110,70,10,85};
        root=new Node(arr[0]);
        for(int i=1;i<arr.length;i++){
            tree.insert(root,arr[i]);
        }
        System.out.println("Level order traversal of binary " + "tree is: ");
        tree.levelOrder(tree.root);
    }

}