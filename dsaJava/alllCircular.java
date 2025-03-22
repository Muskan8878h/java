class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class alllCircular {
// ...........................................
    public static Node insertInEmpty(Node last,int data){
        if(last!=null) return last;
        Node newNode=new Node(data);
        newNode.next=newNode;
        last=newNode;
        return last;
    }
// ...........................................

    public static Node insertAtbeg(Node last,int val){
        Node newNode=new Node(val);
        if(last==null){
            newNode.next=newNode;
            return newNode;
        }
        newNode.next=last.next;
        last.next=newNode;
        return last;
    }
// ..........................................

    public static Node insertAtEnd(Node tail,int val){
        Node newNode=new Node(val);
        if(tail==null){
            tail=newNode;
            newNode.next=newNode;
        }
        else{
            newNode.next=tail.next;
            tail.next=newNode;
            tail=newNode;
        }
        return tail;
    }

// ..........................................

    public static Node delFirst(Node head){
        Node last=head;
        Node first=head;
        if(head==null || head.next==head) {
            return null;
        }
        while(last.next!=head){
            last=last.next;
        }
        head=head.next;
        last.next=head;
        return first;
    }
// ..........................................

    public static void print(Node last){
        if(last==null) return;
        Node head=last.next;
        while(true){
            System.out.print(head.data+" ");
            head=head.next;
            if(head==last.next) break;
        }
        System.out.println();
    }
// ...........................................
    public static void main(String[] args) {
        Node last=null;

        // insert in empty list.........
        System.out.println("insert in empty list");
        int data=1;
        last=insertInEmpty(last, data);
        print(last);

        // insert at begining...........
        System.out.println("insert at begining ");
        data=2;
        last=insertAtbeg(last, data);
        print(last);

        // insert at end.............
        System.out.println("insert at end ");
        data=3;
        last=insertAtEnd(last, data);
        print(last);

        // delete first node..........
        System.out.println("delete first node");
        delFirst(last);
        print(last);

    }
}
