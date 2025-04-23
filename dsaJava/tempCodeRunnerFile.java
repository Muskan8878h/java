//addition of code at the start
public class Linked9 {
    class Node{
        int rollno;
        Node next;
        Node(int rollno){
            this.rollno=rollno;
        }
    }

    Node head=null;
    Node current;
    public void addNodeAtStart(int roll){
        Node newnode=new Node(roll);
        newnode.next=head;
        head=newnode;

    }
    public void addNode(int roll) {
     Node newnode=new Node(roll);
     if(head==null){
        head=newnode;
     }
     else{
        current=head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=newnode;
     }
        
    }
    public void display(){
        if (head==null){
            System.out.println("empty linked list");
        }
        else{
            current=head;
        while(current!=null){
        System.out.print(current.rollno+" ");
         current=current.next;}
         System.out.println();
        }
    }
    public static void main(String[] args) {
        Linked9 ll=new Linked9();
        ll.display();
        ll.addNode(12);
        ll.addNode(22);
        ll.addNode(111);
        ll.addNodeAtStart(1);
        ll.display();
    }


    }