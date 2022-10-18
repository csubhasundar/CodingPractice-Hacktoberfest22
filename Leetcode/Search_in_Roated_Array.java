package Leetcode;

/*
There is an integer array nums sorted in ascending order (with distinct values).
Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length)
such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed).
For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].  Given the array nums after the possible rotation and an integer target,
return the index of target if it is in nums, or -1 if it is not in nums.  You must write an algorithm with O(log n) runtime complexity.
 */
public class Search_in_Roated_Array {
    public static int search(int[] nums, int target) {
           int peak =peak(nums ,0,nums.length-1);
           if (peak==-1)
               return findIndex(nums ,0 , nums.length-1,target);
           if (nums[peak]==target)
               return peak;
           if (nums[0]>target)
               return findIndex(nums ,peak+1 ,nums.length-1,target);
           else if (nums[0]<target)
               return findIndex(nums,0 ,peak,target);
           else
               return 0;
    }
    public static int peak(int[]arr,int start ,int end){
        while(start<=end) {
        int mid =start+(end-start)/2;
            if (mid<end&&arr[mid] > arr[mid + 1])
                return mid;
             if (mid>start&&arr[mid] < arr[mid - 1])
                return mid-1;
             if (arr[mid]<=arr[start])
                 end = mid-1;
             else
                 start=mid+1;
        }
        return -1;
    }
    public static int peakDuplicate(int[]arr,int start ,int end){
        while(start<=end) {
        int mid =start+(end-start)/2;
            if (mid<end&&arr[mid] > arr[mid + 1])
                return mid;
             if (mid>start&&arr[mid] < arr[mid - 1])
                return mid-1;
             if(arr[mid]==arr[start] && arr[mid]==arr[end]){
                 if (arr[start]>arr[start+1])
                     return start;
                 start++;
                 if (arr[end]>arr[end-1])
                     return end;
                 end--;
             }
             else if (arr[mid]>arr[start] || (arr[start]==arr[mid] && arr[mid]>arr[end]))
                 start = mid+1;
             else
                 end = mid-1;
        }
        return -1;
    }
    public static int findIndex(int[]arr,int start,int end,int target){
        int mid = start+(end-start)/2;
        if (start<=end){
            if (arr[mid]>target){
              return   findIndex(arr,start,mid-1,target);
            }
            else if (arr[mid]<target){
              return findIndex(arr,mid+1,end,target);
            }
            return mid;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[]arr ={2,5,6,0,0,1,2};
        int target =0;
        int index=search(arr,target);
        System.out.println(index);
    }
}
