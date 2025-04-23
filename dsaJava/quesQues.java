import java.util.*;
public class quesQues {
//     public static void main(String[] args) {
// // add elements and print.................
//         Queue<Integer> q=new LinkedList<>();
//         q.add(10);
//         q.add(20);
//         q.add(30);
//         q.add(40);
//         System.out.println("Queue contains");
//         while(!q.isEmpty()){
//             System.out.print(q.poll()+" "); 
//         }
// // remove spaces..............
//         String name;
//         char ch;
//         int i;
//         System.out.println("Enter string");
//         Scanner sc=new Scanner(System.in);
//         name=sc.nextLine();
//         Queue<Character> qs=new LinkedList<>();
//         for(i=0;i<name.length();i++){
//             ch=name.charAt(i);
//             if(ch!=' '){
//                 qs.add(ch);
//             }
//         }
//         System.out.println("the modified string is : ");
//         while(!qs.isEmpty()){
//             System.out.print(qs.poll());
//         }
//     }


// .........................................................................................................


// // implement queue through arrays......................
//         int[] arr;
//         int front,rear,maxsize;
//         public quesQues(int size){
//             arr=new int[size];
//             front=-1;
//             rear=-1;
//             maxsize=size;
//         }
//         public boolean isFull(){
//             return rear==maxsize-1;
//         }
//         public boolean isEmpty(){
//             return front==-1;
//         }
//         public void enqueue(int value){
//             if(isFull()){
//                 System.out.println("Queue is full");
//                 return;
//             }
//             if(front==-1){
//                 front=0;
//             }
//             rear++;
//             arr[rear]=value;
//             System.out.println("Enqueued : "+value);
//         }
//         public int dequeue(){
//             if(isEmpty()){
//                 System.out.println("Queue is empty");
//                 return -1;
//             }
//             int dequeueValue=arr[front];
//             if(front==rear){
//                 front=-1;
//                 rear=-1;
//             }
//             else{
//                 front++;
//             }
//             return dequeueValue;
//         }
//         public static void main(String[] args){
//             quesQues q=new quesQues(5);
//             q.enqueue(11);
//             q.enqueue(22);
//             q.enqueue(33);
//             q.enqueue(44);
//             // q.enqueue(55);
//             // q.enqueue(66); 
//             System.out.println("Dequeued item is "+q.dequeue());
//         }


// remove vowel from the string .......................
    // public static void main(String[] args) {
    //     // String str = "Hello World";
    //     // String str1 = str.replaceAll("[aeiouAEIOU]", "");
    //     // System.out.println(str1); 
 
    //     Queue<Character> q=new LinkedList<>();
    //     Scanner sc=new Scanner(System.in);
    //     System.out.println("Enter the string");
    //     String str=sc.nextLine();
    //     for(int i=0;i<str.length();i++){
    //         char ch=str.charAt(i);
    //         if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u' && ch!='A' && ch!='E' && ch!='I' && ch!='O' && ch!='U' ){
    //             q.add(ch);
    //         }

    //     }
    //     String ans="";
    //     while(!q.isEmpty()){
    //         ans+=q.poll();
    //     }
    //     System.out.println(ans);
    // }

    
}
