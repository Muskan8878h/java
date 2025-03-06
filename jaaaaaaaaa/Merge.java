import java.util.Arrays;

public class Merge{
    static void merge(int arr[], int l, int m, int r){
        int i,j,k,n1,n2;
        n1=m-l+1;
        n2=r-m;
    int L[]=new int[n1];
    int R[]=new int[n2];
    for(i=0;i<n1;i++)
        L[i]=arr[l+i];
    for(j=0;j<n2;j++)
        R[j]=arr[m+1+j];
    i=0;
    j=0;
    k=l;
    while(i<n1 && j<n2){
        if(L[i]<=R[j]){
            arr[k]=L[i];
            i++;
        }
        else{
            arr[k]=R[j];
            j++;
        }
        k++;
    }
    while(i<n1){
        arr[k]=L[i];
        i++;
        k++;
    }
    while(j<n2){
        arr[k]=R[j];
        j++;
        k++;
    }
}
static void mergesort(int arr[], int l, int r){
    int m;
    if(l<r){
        m=l+(r-l)/2;
        mergesort(arr,l,m);
        mergesort(arr,m+1,r);
        merge(arr,l,m,r);
    }
}
    public static void main(String[] args){
        int arr[]={12,11,13,5,7,3,1,4};
        System.out.println("The array is "+Arrays.toString(arr));
        mergesort(arr,0,arr.length-1);
        System.out.println("SOrted array is "+Arrays.toString(arr));
    }
}
