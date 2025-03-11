public class doublLL {
    class Node{
        int data;
        Node prev;
        Node next;
        public Node(int data){
            this.data = data;
        }
    }
   
    Node head=null;
    Node tail=null;
    public void addNode(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=tail=newNode;
            head.prev=null;
            tail.next=null;
        }
        else{
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
            tail.next=null;
        }
    }

    public void display(){
        Node current = head;
        if(head==null){
            System.out.println("No elements in the list");
            return ;
        }
        System.out.println("Node of doubly Linked list");
        while(current!=null){
            System.out.print(current.data+" ");
            current = current.next;
        }
        System.out.println();
    }

    
}