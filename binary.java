import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        left=null;
        right=null;
    }
}
public class binary{
    Node root;
    public binary(){
        root=null;
    }
    public void nonleafNode(){
        if(root==null){
            return;
        }
        Queue<Node> qu=new LinkedList<>();
        Queue<Node> qu1=new LinkedList<>();
        qu.add(root);
        while(!qu.isEmpty()){
            Node curr=qu.poll();
            if(curr.left!=null || curr.right!=null){
                qu1.add(curr);
            }
            if(curr.left!=null){
                qu.add(curr.left);
            }
            if(curr.right!=null){
                qu.add(curr.right);
            }
        }
        System.out.println("Number of non leaf node : "+qu1.size());
        while(!qu1.isEmpty()){
            System.out.print(qu1.poll().data+" ");
        }
        System.out.println();
    
    }
    public static void main(String[] args){
        binary tree=new binary();
        tree.root=new Node(1);
        tree.root.left=new Node(2);
        tree.root.right=new Node(3);
        tree.root.left.left=new Node(4);
        tree.root.right.right=new Node(5);
        tree.nonleafNode();
    }
}

