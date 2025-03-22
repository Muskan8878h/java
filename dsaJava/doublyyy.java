public class doublyyy {
    class Node{
        int data;
        Node prev;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    Node head=null;
    Node tail=null;
    public void add(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
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
        Node curr=head;
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        while(curr!=null){
            System.out.println(curr.);
        }
    }
}
