// Double Linked List

public class DoubleLinkedList {
	class Node
	{  
		int rollno;
		Node prev;
		Node next;

		public Node(int rollno)
		{  
			this.rollno=rollno;
		}  
	}  
	
	//Represent the head and tail of the doubly linked list  
	Node head=null;
	Node tail=null;  
		  
	//addNode() will add a node to the list  
	public void addNode(int data)
	{  
		//Create a new node  
		Node newnode = new Node(data);  
		  
		//If list is empty  
		if(head==null)
		{
			//Both head and tail will point to newNode  
		    head=tail=newnode;  
		    
		    //head's previous will point to null  
		    head.prev=null;  
		    
		    //tail's next will point to null, as it is the last node of the list  
		    tail.next=null;  
		}
		else
		{  
			tail.next=newnode;
		    newnode.prev=tail;  
		    tail=newnode;   
		    tail.next=null;
		}  
	}
	
	public void addNodeAtStart(int roll)
	{
		Node newnode=new Node(roll);
		newnode.prev=null;
		newnode.next=head; 
		head.prev=newnode;
		head=newnode;
	}
	
	public void insert(int key,int data)
	{
		Node newnode,current=head;
		int flag=0;
		while (current!=null)
		{
			if (current.rollno==key)
			{
				flag=1; 
				newnode=new Node(data);
				newnode.next=current.next;
				newnode.prev=current;
				current.next.prev=newnode;
				current.next=newnode;
				current=newnode;
			}
			current=current.next;
		}
		if (flag==0)
		{
			System.out.println("Node not found");
		}
	}
	
	//display() will print out the nodes of the list  
	public void display()
	{  
		//Node current will point to head  
		Node current=head;  
		
		if(head==null)
		{  
			System.out.println("List is empty");  
			return;  
        }
		System.out.println("Nodes of doubly linked list: ");  
		
		while(current!=null)
		{  
			//Prints each node by incrementing the pointer.  
			System.out.print(current.rollno+" ");  
		    current=current.next;
        }
		System.out.println();
	}
	
	//reversedisplay() will print out the nodes of the list  
	public void reversedisplay()
	{  
		//Node current will point to tail  
		Node current=tail;  
			
		if(tail==null)
		{  
			System.out.println("List is empty");  
			return;
	    }
		System.out.println("Nodes of doubly linked list: ");  
			
		while(current!= null)
		{  
			//Prints each node by incrementing the pointer.  
			System.out.print(current.rollno+" ");  
			current=current.prev;
		}
		System.out.println();
	}
	
	//Count the nodes
	public void countNodes()
	{
		int count=0;
		if (tail==null)
		{
			System.out.println("Empty double linked list");
		}
		else
		{
			Node current=tail;
			while (current!=null)
			{
				count++;
				current=current.prev;
			}
			System.out.println("Number of nodes are "+count);
		}
	}

	public void search(int key)
	{
		Node current;
		int flag=0,pos=1;
		
		current=head;
		while (current!=null)
		{
			if (current.rollno==key)
			{
				flag=1;
				break;
			}
			current=current.next;
			pos++;
		}
		if (flag==1)
		{
			System.out.println("Element found in the linked list at "+pos+" position");
		}
		else
		{
			System.out.println("Element not found in the linked list");
		}
	}
	
	public static void main(String[] args)
	{  
		DoubleLinkedList dl = new DoubleLinkedList();  
		dl.display();
		dl.reversedisplay();
		
		//Add nodes to the list  
		dl.addNode(10);
		dl.addNode(35);
		dl.addNode(57);
		dl.addNode(24);
	
		//Displays the nodes present in the list  
		dl.display();
		dl.reversedisplay();
				
		dl.addNodeAtStart(77);
		dl.display();
		
		dl.insert(57,92);
		dl.display();
		dl.reversedisplay();
		dl.countNodes();
		
		dl.search(57);
		dl.search(100);
	}  
}