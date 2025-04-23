import java.util.*;
public class queueee1 {
    int[] arr;
    int front, rear, capacity, size;
    public queueee1(int c){
        arr=new int[c];
        capacity=c;
        size=0;
        front=0;
    }
    public int getFront(){
        if(size==0){
            return -1;
        }
        return arr[front];
    }
    public void enqueue(int x){
        if(size==capacity){
            return ;
        }
        int rear=(front+size)%capacity;
        arr[rear]=x;
        size++;
    }
    public int dequeue(){
        if(size==0){
            return -1;
        }
        int res=arr[front];
        front=(front+1)%capacity;
        size--;
        return res;
    }
    public static void main(String[] args) {
        queueee1 q=new queueee1(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        System.out.println(q.getFront()+" "+q.getRear());
        q.dequeue();
        System.out.println(q.getFront()+" "+q.getRear());
        q.dequeue();
    }


}
