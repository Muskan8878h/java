import java.util.Arrays;

public class quickSort {
    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = (low-1);
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high]=temp;
        return (i+1);
    }
    public static void quick(int arr[] ,int low,int high){
        if (low < high) {
            int pi;
            pi = partition(arr, low, high);
            quick(arr, low, pi-1);
            quick(arr,pi+1,high);
        }        
    }

    public static void main(String[] args) {
        int[] arr={8,7,2,1,0,9,6};
        quick(arr,0,arr.length-1);
        System.out.println("sorted array : "+ Arrays.toString(arr));
    }
}
