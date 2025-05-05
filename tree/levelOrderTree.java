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
public class levelOrderTrav {
    static Node root;
    public levelOrderTrav{
        root=null;
    }
    public Node insert(Node root,int key){
        if(root==null){
            root=new Node(key);
            return root;
        }
        if(key< root.key){
            
        }
    }
    public static void main(String[] args) {
        
    }
    
}