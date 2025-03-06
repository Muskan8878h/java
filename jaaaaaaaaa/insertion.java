public class insertion{
    public static void main(String[] args) {
        int[] arr = {5,7,1,3,28,9,3,4,2};
        // for(int i=1;i<arr.length;i++){
        //     int j=i-1;
        //     int temp=arr[i];
        //     while(j>=0 && arr[j]>temp){
        //         arr[j+1]=arr[j];
        //         j--;
        //     }
        //     arr[j+1]=temp;
        // }

        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+" ");
        // }

        int n=arr.length;
        for(int i=1;i<n;i++){
            int j=i-1;
            int temp=arr[i];
            while(j>=0 && arr[j]<temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}