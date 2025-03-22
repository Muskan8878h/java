import java.util.*;
public class LLL{
    Node head;
    public class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
        public void addFirst(int data){
            Node newNode=new Node(data);
            if(head==null){
                head=newNode;
                return ;
            }
            newNode.next=head;
            head=newNode;
        }
        public void addLast(int data){
            Node newNode=new Node(data);
            Node curr=head;
            if(head==null){
                head=newNode;
                return ;
            }
            while(curr.next!=null){
                curr=curr.next;
            }
            curr.next=newNode;
        }
        public  void printlist(){
            Node curr=head;
            while(curr!=null){
                System.out.print(curr.data+" ");
                curr=curr.next;
            }
            System.out.print("null ");
            System.out.println();
        }

        public void addMiddle(int index, int data){
            int size=4;
            if(index>size || index<0){
                return ;
            }
            size++;
            Node newNode=new Node(data);
            if(head==null || index==0){
                newNode.next=head;
                head=newNode;
            }
            Node curr=head;
            for(int i=0;i<size;i++){
                if(i==index){
                    Node nextNode=curr.next;
                    curr.next=newNode;
                    newNode.next=nextNode;
                }
                curr=curr.next;
            }
            System.out.println();
        }
        public void search(int ele){
            if(head==null) return;
            Node curr=head;
            Node searchNode=new Node(ele);
            while(curr.next!=null){
                if(curr.data==searchNode.data){
                    System.out.println("found "+ curr.data);
                }
                curr=curr.next;
            }
        }
        public void greater(){
            Node curr=head;
            while(head!=null && head.data>25){
                head=head.next;
            }
            while(curr.next!=null && curr!=null){
                if(curr.next.data>25){
                    curr.next=curr.next.next;
                }
                else{
                    curr=curr.next;
                }
            }
        }

        public void reverse(){
            if(head==null || head.next==null){
                return;
            }
            Node prev=head;
            Node curr=head.next;
            while(curr!=null ){
                Node nextNode=curr.next;
                curr.next=prev;
                prev=curr;
                curr=nextNode;
            }
            head.next=null;
            head=prev;
        }
    public static void main(String[] args) {
            LLL list=new LLL();
            list.addFirst(4);
            list.addFirst(2);
            // list.addFirst("this ");
            // list.printlist();

            list.addLast(5);
            list.addLast(6);
            list.addFirst(1);
            // list.printlist();

            list.addMiddle(1,3);
            list.printlist();

            // list.search(4);

            // while(true){
            //     Scanner sc=new Scanner(System.in);
            //     int n=sc.nextInt();
            //     if(n==-1){
            //         break;
            //     }
            //     if(n<=50 || n>=1 ){
            //         list.addLast(n);
            //     }
            // }
            // list.greater();
            // list.printlist();

            list.reverse();
            list.printlist();

               
    }
}