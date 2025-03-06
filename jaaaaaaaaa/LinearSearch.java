import java.util.*;
public class LinearSearch {
    public static int search(int n,int[] arr,int target){
        // for(int i=0;i<n;i++){
        //     if(arr[i]==target){
        //         return i+1;
        //     }
        // }
        // return -1;
        if(n==0){
            return -1;
        }
        if(arr[n-1]==target){
            return n-1;
        }
        else{
            return search(n-1,arr,target);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        int ans=search(n,arr,target);
        System.out.println(ans);
        sc.close();
    }
}