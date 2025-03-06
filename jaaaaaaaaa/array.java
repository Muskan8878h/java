import java.util.*;

public class array{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        // int max=0;
        // int smax=0;
        // for(int i=0;i<n;i++){
        //     if(arr[i]>max){
        //         max=arr[i];
        //     }
        // }
        // for(int i=0;i<n;i++){
        //     if(arr[i]>smax && arr[i]!=max){
        //         smax=arr[i];
        //     }
        // }
        // System.out.println("answer: "+smax);
        int first=0;
        int last=n-1;
        for(int i=0;i<n/2;i++){
            int temp=arr[first];
            arr[first]=arr[last];
            arr[last]=temp;
            first++;
            last--;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close(); 
    }
}