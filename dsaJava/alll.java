// class SLL{
//     public class Node{
//         int data;
//         Node next;
//         Node(int data){
//             this.data=data;
//             this.next=null;
//         }
//     }
//     Node head;
//     public void add(int data){
//         Node newNode=new Node(data);
//         if(head==null){
//             head=newNode;
//         }
//         else{
//             Node curr=head;
//             while(curr.next!=null){
//                 curr=curr.next;
//             }
//             curr.next=newNode;
//         }
//     }
//     public void print(){
//         Node curr=head;
//         while(curr!=null){
//             System.out.print(curr.data+ " ");
//             curr=curr.next;
//         }
//         System.out.println("null");
//     }
// }
// public class alll{
//     public static void main(String[] args){
//         SLL list=new SLL();
//         list.add(10);
//         list.add(20);
//         list.add(30);
//         list.add(40);
//         System.out.print("Linked list");
//         list.print();
//     }
// }


class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class alll {
// ...................................................
    public static Node insertAtFront(Node head,int data){
        Node newNode=new Node(data);
        newNode.next=head;
        return newNode;
    }
//......................................................
    public static Node insertAfter(Node head,int key, int newData){
        Node curr=head;
        while(curr!=null){
            if(curr.data==key){
                break;
            }
            curr=curr.next;
        }
        if(curr==null){
            System.out.println("Node not found");
            return head;
        }
        Node newNode=new Node(newData);
        newNode.next=curr.next;
        curr.next=newNode;
        return head;
    }
//...................................................
    public static Node insertBeforekey(Node head,int key1,int newData1){
        if(head==null){
            return null;
        }
        if(head.data==key1){
            Node newNode=new Node(newData1);
            newNode.next=head;
            return newNode;
        }
        head.next=insertBeforekey(head.next, key1, newData1);
        return head;
    }
// ...............................................
    public static Node insertAtPos(Node head, int pos, int data){
        Node newNode=new Node(data);
        if(pos<1){
            return head;
        }
        if(pos==1){
            newNode.next=head;
            return newNode;
        }
        Node curr=head;
        for(int i=1;i<pos-1 && curr!=null;i++){
            curr=curr.next;
        }
        if(curr==null){
            return head;
        }
        newNode.next=curr.next;
        curr.next=newNode;
        return head;
    }
//.............................................
    public static Node atEnd(Node head, int data){
        Node newNode = new Node(data);
        if(head==null){
            return newNode;
        }
        Node last=head;
        while(last.next!=null){
            last=last.next;
        }
        last.next=newNode;
        return head;
    }
// ............................................
    public static Node deleteAtStart(Node head){
        if(head==null){
            return head;
        }
        head=head.next;
        return head;
    }
// .........................................
    public static Node deleteAtPos(Node head,int pos){
        if(head==null || pos<1){
            return head;
        }
        if(pos==1){
            return head.next;
        }
        Node curr=head;
        for(int i=1;i<pos-1 && curr!=null;i++){
            curr=curr.next;
        }
        if(curr==null || curr.next==null){
            return head;
        }
        curr.next=curr.next.next;
        return head;
    }

// .........................................
    public static Node deleteEnd(Node head){
        if(head==null || head.next==null){
            return null;
        }
        Node secondLast=head;
        while(secondLast.next.next!=null){
            secondLast=secondLast.next;
        }
        secondLast.next=null;
        return head;
    }
// .....................................
    public static Node deleteNthNodeFromEnd(Node head,int n){
        // int k=0;
        // Node curr=head;
        // while(curr!=null){
        //     curr=curr.next;
        //     k++;
        // }       
        // if(k-n==0) return head.next;
        // curr=head;
        // for(int i=0;i<k-n-1;i++){
        //     curr=curr.next;
        // }
        // curr.next=curr.next.next;
        // return head;

        Node fast=head;
        Node slow=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        slow.next=slow.next.next;
        return head;
    }

// .........................................
    public static void triverseList(Node head){
        while(head!=null){
            System.out.print(head.data+ " -> ");
            head=head.next;
        }
        System.out.println();
    }

// ..............................................
    public static void triverseListRecursive(Node head){
        if(head==null){
            return ;
        }
        System.out.print(head.data+" -> ");
        triverseListRecursive(head.next);
    }

// .......................................
    public static boolean searchKey(Node head, int key){
        Node curr = head;
        while(curr!=null){
            if(curr.data==key){
                return true;
            }
            curr=curr.next;
        }
        return false;
    }

// ...............................................
    public static boolean searchKeyRecursive(Node head,int key){
        if(head==null) return false;
        if(head.data==key) return true;
        return searchKeyRecursive(head.next,key);
    }

// .........................................
    public static int lengthOfList(Node head){
        // int count=0;
        // Node curr = head;
        // while(curr!=null){
        //     count++;
        //     curr=curr.next;
        // }
        // return count;

        if(head==null) return 0;
        return 1+lengthOfList(head.next);

    }

// ............................................
    public static Node reverse(Node head){
        Node prev = null;
        Node curr=head;
        while(curr!=null){
            Node nextNode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextNode;
        }
        return prev;
    }

// .....................................
    public static Node modify(Node head){
        if(head.next==null) return head;
        Node slow=head;
        Node fast=head;
        Node mid;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        mid=slow;
        Node reverseList=mid.next;
        mid.next=null;
        reverseList=reverse(reverseList);
        Node curr1=head;
        Node curr2=reverseList;
        while(curr2!=null){
            int x=curr1.data;
            curr1.data=curr2.data-x;
            curr2.data=x;
            curr1=curr1.next;
            curr2=curr2.next;
        }
        mid.next=reverse(reverseList);
        return head;

    }

// ..................................
    public static int getMiddle(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow.data;

    }
// ...........................................
    public static void print(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(" "+ curr.data);
            curr=curr.next;
        }
        System.out.println();
    }

    public static void main (String[] args){
        Node head=new Node(2);
        head.next=new Node(3);
        head.next.next=new Node(5);
        head.next.next.next=new Node(6);
        System.out.println("Original linked list : ");
        print(head);

        // at front add element..........
        System.out.println("After insertion at front:");
        int data=1;
        head=insertAtFront(head,data);
        print(head);
        
        // add element at given position...........
        System.out.println("Linked list After insertion");
        int key=3;
        int newData=4;
        head=insertAfter(head, key, newData);
        print(head);

        //add element before given position............
        System.out.println("Linked list Before insertion");
        int newData1=10;
        int key1=3;
        head=insertBeforekey(head,key1,newData1);
        print(head);

        // add elemnt at given position..............
        System.out.println("Linked list at given Position");
        int val=12;
        int pos=3;
        head=insertAtPos(head,pos,val);
        print(head);

        // add element at the end..................
        System.out.println("Linked list at end");
        int val1=15;
        head=atEnd(head,val1);
        print(head);

        // delete from begning................
        System.out.println(" deletion from beginig");
        head=deleteAtStart(head);
        print(head);

        // delete from a given position...............
        System.out.println("deletion from given position");
        int pos1=2;
        head=deleteAtPos(head,pos1);
        print(head);

        // delete from end ..................
        System.out.println("deletion from end");
        head=deleteEnd(head);
        print(head);

        // delete Nth Node From End............
        System.out.println("deletion Nth Node from end");
        int n=2;
        head=deleteNthNodeFromEnd(head,n);
        print(head);

        // triverse List..................
        System.out.println("triverse a List");
        triverseList(head);

        // triverse List Recursive............
        System.out.println("triverse a List Recursive");
        triverseListRecursive(head);
        System.out.println();

        // search a key.................
        System.out.println("search a key");
        int key2=6;
        if(searchKey(head, key2)){
            System.out.println("key found : "+key2);
        }
        else{
            System.out.println("key not found");
        }

        // search key recursively............
        System.out.println("search key recursively");
        if(searchKeyRecursive(head, key2)){
            System.out.println("key found : "+key2);
        }
        else{
            System.out.println("key not found");
        }

        // length of list ..................
        System.out.print("length of list : ");
        System.out.println(lengthOfList(head));

        // revrse a list ..............
        System.out.println("reverse a list");
        head=reverse(head);
        print(head);

        // modify list..............
        System.out.println("modify list");
        head=modify(head);
        print(head); //2-6=-4 //10-4=6 //3 4 6 same...

        // middle element of the list..........
        System.out.print("middle element of the list : ");
        System.out.println(getMiddle(head)); 


    }
}