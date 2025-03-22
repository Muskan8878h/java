import javax.sound.sampled.SourceDataLine;

public class Singlyyy{
    class Node{
        int rollno;
        Node next;
        Node(int rollno){
            this.rollno=rollno;
        }
    }
    Node head=null;
    Node current;
    public void addNode(int roll){
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
    public void addNodeAtStart(int roll){
        Node newnode=new Node(roll);
        newnode.next=head;
        head=newnode;
    }
    public void countNodes(){
        int count=0;
        if(head==null){
            System.out.println("empty linked list");
        }
        else{
            Node current=head;
            while(current!=null){
                count++;
                current=current.next;
            }
            System.out.println();
            System.out.println("number of nodes are " +count);
        }
    }
    public void insert(int key,int data){
        Node newnode,current=head;
        int flag=0;
        while(current!=null){
            if(current.rollno==key){
                flag=1;
                newnode=new Node(data);
                newnode.next=current.next;
                current.next=newnode;
                current=newnode;
                break;
            }
            current=current.next;
        }
        if(flag==0){
            System.out.println("Node not found");
        }
    }
    public void display(){
        if(head==null){
            System.out.println("Empty Linked List");
        }
        else{
            current=head;
            System.out.println("Nodes are");
            while(current!=null){
                System.out.print(current.rollno+" ");
                current=current.next;
            }
            // System.out.println();
        }
    }
    public void search(int key){
        Node current=head;
        int flag=0,pos=1;
        while(current!=null){
            if(current.rollno==key){
                flag=1;
                break;
            }
            current=current.next;
            pos++;
        }
        if(flag==1){
            System.out.println("element found in the linked list at "+pos+" position");
        }
        else{
            System.out.println("element not found in the linked list");
        }
    }
    public void sort(){
        Node current,nextnode;
        current=head;
        int temp;
        while(current.next!=null){
            nextnode=current.next;
            while(nextnode!=null){
                if(current.rollno>nextnode.rollno){
                    temp=current.rollno;
                    current.rollno=nextnode.rollno;
                    nextnode.rollno=temp;
                }
                nextnode=nextnode.next;
            }
            current=current.next;
        }
    }
    public void delete(int key){
        Node current,temp;
        current=head;
        // int flag=0;
        if(current.rollno==key){
            head=head.next;
        }
        else{
            temp=current.next;
            while(temp!=null){
                if(temp.rollno==key){
                    current.next=temp.next;
                    // flag=1;
                    break;
                }
                current=temp;
                temp=temp.next;
            }
        }
    }
    public static void main(String[] args){
        Singlyyy ll=new Singlyyy();
        ll.display();
        ll.addNode(70);
        ll.addNode(20);
        ll.addNode(50);
        ll.display();
        ll.addNodeAtStart(12);
        ll.display();
        ll.countNodes();
        ll.search(70);
        ll.sort();
       ll.display();
       ll.insert(20,90);
       ll.display();
       ll.delete(50);
       ll.display();
    }
}