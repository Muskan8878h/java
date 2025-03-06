import java.util.*;
// public class helo{
//     public static void main(String[] args){
//         // ArrayList<Integer> arr=new ArrayList<>();
//         // Stack<Integer> st=new Stack<>();
//         // Queue<Integer> q=new ArrayDeque<>();
//         Queue<Integer> q=new LinkedList<>();

//         System.out.println(q.isEmpty());

//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);
//         System.out.println(q);

//         q.remove();
//         System.out.println(q);
//         // q.poll(); //same as remove
//         // System.out.println(q);

//         // System.out.println(q.element()); //print first element / peak()
        
//         System.out.println(q.isEmpty());

//         //add()=push , 
//         // remove() / poll() = pop();
//         // element() / peek() = top();
//         // size()
//         // isEmpty();
//     }
// } 


public class helo{
    public static void main(String[] args){
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);
        Queue<Integer> helper=new LinkedList<>();
        while(q.size()>0){
            System.out.println(q.peek());
            helper.add(q.poll());
        }
        System.out.println();
        while(helper.size()>0){
            System.out.println(helper.peek());
            q.add(helper.poll());
        }
    }
}