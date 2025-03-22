class Node{
    int data;
    Node next;
    Node prev;
    Node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}
public class alllDoubly {
    Node head;
    Node tail;
// ..........................................
    public static Node insertAtFront(Node head, int data){
        Node newNode = new Node(data);
        newNode.next=head;
        if(head!=null){
            head.prev=newNode;
        }
        return newNode;
    }

// .............................................
    public static Node insertAtEnd(Node head,int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
        }
        else{
           Node curr=head;
           while(curr.next!=null){
            curr=curr.next;
           }
           curr.next=newNode;
           newNode.prev=curr;
        }
        return head;
    }


// ...........................................
    public static void forwardTraversal(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
        System.out.println();
    }

// .................................................
    public static void backwardTraversal(Node tail){
        Node curr = tail;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.prev;
        }
        System.out.println();
    }

// ...........................
    public static int lengthOfList(Node head){
        int count = 0;
        Node curr = head;
        while(curr!=null){
            count++;
            curr=curr.next;
        }
        return count;
    }

// .............................................
    public static Node insertAtpos(Node head,int pos,int data){
        Node newNode = new Node(data);
        if(pos==1){
            newNode.next = head;
            if(head!=null){
                head.prev = newNode;
            }
            head = newNode;
            return head;
        }
        Node curr=head;
        for(int i = 1; i < pos - 1 && curr != null; ++i){
            curr = curr.next;
        }
        if(curr == null) {
            System.out.println("position out of bound : ");
            return head;
        }
        newNode.prev=curr;
        newNode.next=curr.next;
        curr.next=newNode;
        if(newNode.next!=null){
            newNode.next.prev = newNode;
        }
        return head;
    }

// ......................................
    public static Node delAtEnd(Node head){
        if(head==null) return null;
        if(head.next==null) return null;
        Node curr = head;
        while(curr.next!=null){
            curr = curr.next;
        }
        if(curr.prev!=null){
            curr.prev.next = null;
        }
        return head;
    }

// ........................................
    public static Node delAtPos(Node head,int pos){
        if(head==null) return head;
        Node curr=head;
        for(int i=1;curr!=null && i<pos;i++){
            curr=curr.next;
        }
        if(curr==null) return head;
        if(curr.prev!=null){
            curr.prev.next=curr.next;
        }
        if(curr.next!=null){
            curr.next.prev=curr.prev;
        }
        if(head==curr){
            head = curr.next;
        }
        curr=null;
        return head;
    }

// ......................................
public static void print(Node head){
    Node curr=head;
    while(curr!=null){
        System.out.print(curr.data+ " ");
        curr=curr.next;
    }
    System.out.println();
}

// .............................................
    public static void main(String[] args){
        Node head=new Node(2);
        head.next=new Node(3);
        head.next.prev=head;
        head.next.next=new Node(5);
        head.next.next.prev=head.next;
        System.out.println("original list ");
        print(head);

        // add element at front .........
        System.out.println("insert at begining ");
        head=insertAtFront(head, 1);
        print(head);

        // add eleent at end.........
        System.out.println("insert at end ");
        int data=6;
        head=insertAtEnd(head,data);
        print(head);

        // forward traversal ..........
        System.out.println("forward traversal ");
        forwardTraversal(head);

        // backward traversal...............
        System.out.println("backward traversal ");
        backwardTraversal(head);

        // length of list............
        System.out.print("length of list : ");
        System.out.println(lengthOfList(head));

        // insert at given position ..............
        System.out.println("insert at given position ");
        int pos=3;
        int val=14;
        head=insertAtpos(head,pos,val);
        print(head);

        // delet at end.............
        System.out.println("delete at end ");
        head=delAtEnd(head);
        print(head);

        // delete at given position.............
        System.out.println("delete at given position");
        int pos1=2;
        head=delAtPos(head, pos1);
        print(head);
        

    }
}
