import java.util.*;
public class BinarySearch{
    public static int find(int[] nums,int target){
        int left=0,right=nums.length-1,last=-1;
        int mid;
        while(left<=right){
            mid=left+(right-left)/2;
            if(nums[mid]==target){
                last=mid;
                left=mid+1;
                // right=mid-1;
            }
            else if(nums[mid]<target){
                // first=mid;
                // left=mid+1;
                 left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return last;
    }
    public static int findfirst(int[] nums,int target){
        int left=0,right=nums.length-1,first=-1;
        int mid;
        while(left<=right){
            mid=left+(right-left)/2;
            if(nums[mid]==target){
                first=mid;
                // left=mid+1;
                right=mid-1;
            }
            else if(nums[mid]<target){
                // first=mid;
                // left=mid+1;
                 left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return first;
    }
    public static int[] searchRange(int[] nums,int target){
        int first=findfirst(nums,target);
        int last=find(nums,target);
        return new int[]{first,last};
    }

    public static void main(String[] args) {
        int arr[]={1,3,5,5,5,7,9,11,15};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int[] result=searchRange(arr, 5);
       System.out.println("first and last position of "+5+":"+Arrays.toString(result)); 
              }
    }
