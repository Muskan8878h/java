import java.util.*;
public class Linked {
    public static void main(String[] args) {
        LinkedList<String> ll=new LinkedList<String>();
        int choice=1;
        String name;
        Scanner sc=new Scanner(System.in);
        ll.add("uttarakhand");
        ll.add("Punjab");
        ll.add("Himachal");
        while(choice!=5){
            System.out.println("1 - Add Element");
            System.out.println("2 - Size of Linked List");
            System.out.println("3 - Sort Linked List");
            System.out.println("4 - Search Linked List");
            System.out.println("5 - Exit");
            choice=sc.nextInt();
            sc.nextLine();
            if(choice==1){
                System.out.println("enter the element to be added");
                name=sc.nextLine();
                ll.add(name);
                System.out.println(ll);
            }
            else if(choice==2){
                System.out.println("Linked List contains "+ll.size()+" items");
                System.out.println(ll);
            }
            else if(choice==3){
                ll.sort(null);
                System.out.println(ll);
            }
            else if(choice==4){
                System.out.println("Enter the element to be searched");
                name=sc.nextLine();
                if(ll.contains(name)){
                    System.out.println("Element present in the linked list");
                }
                else{
                    System.out.println("Element not present in the linked list");   
                }
            }
            else{
                System.exit(0);
            }
           
        }
    }
}