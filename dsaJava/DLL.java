import java.util.*;

public class DLL {
    class Node{
        String name;
        Node next;
        Node prev;
        public Node(String name){
            this.name = name;
            this.next = null;
            this.prev = null;
        }
    }
    public Node head=null;
    public Node tail=null;
    public void addNode(String name){
        Node newNode = new Node(name);
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
        Node current= head;
        if(head==null){
            System.out.println("List id empty");
            return ;
        }
        System.out.println("Node of Doubly Linked List");
        while(current!=null){
            System.out.println(current.name+" ");
            current=current.next;
        }
        System.out.println();
    }
    public void reversedisplay(){
        Node current= tail;
        if(tail==null){
            System.out.println("List is emply");
            return ;
        }
        System.out.println("Node of Doubly Linked list");
        while(current!=null){
            System.out.println(current.name+" ");
            current=current.prev;
        }
        System.out.println();
    }
    public static void main(String[] args){
        DLL dl= new DLL();
        int choice=1;
        String name;
        Scanner sc=new Scanner(System.in);
        dl.addNode("Patiala");
        dl.addNode("Rajpura");
        dl.addNode("Ambala");
        while(choice!=0){
            System.out.println("1.Add element");
            System.out.println("2. Display list");
            System.out.println("3. Display list in reverse");
            System.out.println("4. Exit");
            choice=sc.nextInt();
            sc.nextLine();
            if(choice==1){
                System.out.println("Enter name");
                name=sc.nextLine();
                dl.addNode(name);
            }
            else if(choice==2){
                dl.display();
            }
            else if(choice==3){
                dl.reversedisplay();
            } 
            else {
                System.exit(0);
            }
        }
    }
}
