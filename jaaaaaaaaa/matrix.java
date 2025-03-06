import java.util.*;
public class matrix {
    public static void main(String[] args){
        int n,m,i,j,key,flag=0;
        System.out.println("enter matrix");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        System.out.println("enter element");
        int a[][]=new int[n][m];
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter target");
        key=sc.nextInt();
        System.out.println("matrix is : ");
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                System.out.print(a[i][j]+" \t");
            }
            System.out.println();
        }
        // for(i=0;i<n;i++){
        //     for(j=0;j<m;j++){
        //         if(a[i][j]==key){
        //             System.out.println("element found at arr "+" [ "+i+" , "+(j)+"]");
        //             flag=1;
        //             break;
        //         }
        //     }
        // }
        // if(flag==0){
        //     System.out.println("element not found");
        // }
        // else{
        //     System.out.println("element found");
        // }

        int low=0;
        int high=m*n-1;
        while(low<=high){
            int mid=(low+high)/2;
            int index=mid%n;
            int row=mid/n;
            if(a[row][index]==key){
                System.out.println("element found at arr "+" [ "+row+" , "+index+"]");
                flag=1;
                break;
            }
            else if(a[row][index]>key){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
    }
}

