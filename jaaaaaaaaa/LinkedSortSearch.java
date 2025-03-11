import java.util.*;
public class LinkedSortSearch {
    class Node{
        String name;
        Node next;
        public Node(String name){
            this.name=name;
            this.next=null;
        }
    }
    // represent the head and tail of the Linked class
    public Node head=null;
    public Node tail=null;

    // addNode() will add a new node to the list
    public void addNode(String name){
        Node newnode=new Node(name);

        // checks if the list is empty
        if(head==null){
            // if list is empty, both head and tail will point to new node
            head=newnode;
            tail=newnode;
        }
        else{
            // newNode will be added after tail such that tail's next point to 
            tail.next=newnode;

            // newnode will become new tail of the list
            tail=newnode;
        }
        
    }
    // Display will display all the nodes present in the list
    public void display(){
        Node current=head;
        if(head==null){
            System.out.println("List is empty");
        return;
        }
        System.out.println("Nodes of Linked list");
        while(current!=null){
            // prints each node by incrementing pointer
            System.out.println(current.name+" ");
            current=current.next;
        }
        System.out.println();
    }
    public void search(String key){
        Node current;
        int flag=0,pos=1;
        current=head;
        while(current!=null){
            if(current.name.equals(key)){
                flag=1;
                break;
            }
            current=current.next;
            pos++;
        }
        if(flag==1){
            System.out.println("Element found in the linked list at "+pos+" position");
        }
        else{
            System.out.println("Element not found in the linked list");
        }       
        }
        // sort the list
        public void sort(){
            Node current,nextNode;
            current=head;  
            String temp;   
            while(current!=null){
                nextNode=current.next;
                while(nextNode!=null){
                    if(((current.name).compareTo(nextNode.name))>0){
                        temp=current.name;
                        current.name=nextNode.name;
                        nextNode.name=temp;
                    }
                    nextNode=nextNode.next;
                }
                current=current.next;
            }
        }
        public void countNode(){
            int count=0;
            Node current = head;
            while(current!=null){
                count++;
                current=current.next;
            }
            System.out.println(count);
        }
    public static void main(String[] args){
        LinkedSortSearch  list=new LinkedSortSearch ();
        int choice=1;
        String name;
        Scanner sc= new Scanner(System.in);
        list.addNode("Shimla");
        list.addNode("Manali");
        list.addNode("Mumbai");
        while(choice!=0){
            System.out.println("1.Add element");
            System.out.println("2.Display List");
            System.out.println("3.Searcht");
            System.out.println("4.Sort");
            System.out.println("5.Count");
            System.out.println("6.Exit");
            choice=sc.nextInt();
            sc.nextLine();
            if(choice==1){
                System.out.println("Enter element");
                name=sc.nextLine();
                list.addNode(name);
            }
            else if(choice==2){
                list.display();
            }
            else if(choice==3){
                System.out.println("Enter element to search");
                name=sc.nextLine();
                list.search(name); 
            }
            else if(choice==4){
                list.sort();
            }
            else if(choice==5){
                System.out.println("Count : ");
                list.countNode();
            }
            else{
                System.exit(0);
            }
        }

    }
}
