package Leetcode;

public class BinarySearch {

    public static int search(int[] nums, int target) {
        return binarySearch(nums , 0 , nums.length-1,target);
    }
    public static int binarySearch(int[]arr, int s, int e, int x){
        int mid = s+(e-s)/2;
        if (e>=s){
            if (arr[mid]==x)
                return mid;
            else if(arr[mid]>x)
                return binarySearch(arr,s,mid-1,x);
            else
                return binarySearch(arr,mid+1,e,x);
            }
        return -1;
        }

    public static void main(String[] args) {
        int []arr = {1,2,4,6,7,9,10};
        int target =10;
        int index =search(arr,target);
        System.out.println(index);
    }
}
