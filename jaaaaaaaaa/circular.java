    //circular linked list
public class circular {
    class Node{
        int rollno;
        Node next;
        Node(int rollno){
            this.rollno=rollno;
        }
    }
    public Node head=null;
    public Node tail=null;
    public void addNode(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            tail=newnode;
            newnode.next=head;
        }
        else{
            tail.next=newnode;
            tail=newnode;
            tail.next=head;
        }
    }
    public void swap(){
        int temp;
        if(head!=tail){
            temp=head.rollno;
            head.rollno=tail.rollno;
            tail.rollno=temp;
        }
        else{
            System.out.println("Swapping not possible");
        }
    }
    public void display(){
        Node current=head;
        if(head==null){
            System.out.println("Empty circular linked list");
        }
        else{
            do { System.out.print(current.rollno+" ");
            current=current.next;
                
            } while (current!=head);
            System.out.println();
          
        } 
    }
    public static void main(String[] args) {
        circular ll=new circular();
        ll.display();
        ll.addNode(11);
        ll.addNode(21);
        ll.addNode(333);
        ll.addNode(39);
        ll.display();
        ll.swap();
        ll.display();
    }
}

