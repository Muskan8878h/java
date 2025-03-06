import java.util.Scanner;

public class bubbleSort {
    public static void main(String[] args) {
        int n,i,j,temp;
        System.out.println("enter the array size");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        int arr[] = new int[n];
        for(i=0;i<n;i++){
            System.out.println("enter the element"+i+1);
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n-1;i++){
            for(j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}