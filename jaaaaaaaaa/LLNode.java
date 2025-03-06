import java.util.Scanner;

public class LLNode{
    public static class SinglyLinkedListMenuDriven{
        class Node{
            String name;
            Node next;
            public Node(String name){
                this.name = name;
                this.next = null;
            }
        }
        public Node head=null;
        public Node tail=null;

        public void addNode(String name){
            Node newNode = new Node(name);
            if(head == null){
                head = newNode;
                tail = newNode;
            }
            else{
                tail.next = newNode;
                tail = newNode;
            }
        }
        public void display(){
            Node current = head;
            if(head==null){
                System.out.println("List is empty");
                return ;
            }
            System.out.println("nodes of singly linked list ");
            while(current != null){
                System.out.print(current.name + " ");
                current = current.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        SinglyLinkedListMenuDriven ll = new SinglyLinkedListMenuDriven();
        int choice=1;
        String name;
        Scanner sc=new Scanner(System.in);
        ll.addNode("Chandigarh");
        ll.addNode("shimla");
        ll.addNode("Dehradun");
        while(choice!=0){
            System.out.println("1.Add Element");
            System.out.println("2. Display List");
            System.out.println("3. Exit");
            choice=sc.nextInt();
            sc.nextLine();
            if(choice==1){
                System.out.println("Enter the element to be added");
                name=sc.nextLine();
                ll.addNode(name);
            }
            else if(choice==2){
                ll.display();
            }
            else{
                System.exit(0);
            }
        }
    }
}