package Leetcode;

/*
There is an integer array nums sorted in non-decreasing order (not necessarily with distinct values).

Before being passed to your function, nums is rotated at an unknown pivot index k (0 <= k < nums.length)
such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed).
For example, [0,1,2,4,4,4,5,6,6,7] might be rotated at pivot index 5 and become [4,5,6,6,7,0,1,2,4,4].

Given the array nums after the rotation and an integer target, return true if target is in nums, or false if it is not in nums.

You must decrease the overall operation steps as much as possible.
 */
public class Search_in_Rotated_Array_II {
    public static boolean search(int[] nums, int target) {
        int peak =peak(nums ,0,nums.length-1);
        if (peak==-1)
            return findIndex(nums ,0 , nums.length-1,target);
        if (nums[peak]==target)
            return true;
        if (nums[0]>target)
            return findIndex(nums ,peak+1 ,nums.length-1,target);
        else if (nums[0]<target)
            return findIndex(nums,0 ,peak,target);
        else
            return true;
    }
    public static int peak(int[]arr,int start ,int end){
        while(start<end) {
            int mid =start+(end-start)/2;
            if (mid<end&&arr[mid] > arr[mid + 1])
                return mid;
            if (mid>start&&arr[mid] < arr[mid - 1])
                return mid-1;
            if (arr[mid]<arr[start])
                end = mid-1;
            else if(arr[mid]== arr[start] && arr[mid]==arr[end]){
                if (start<end && arr[start]>arr[start+1])
                    return start;
                if(start<end && arr[end] < arr[end-1])
                    return end;
                start++;
                end--;
            }
            else
                start=mid+1;
        }
        return -1;
    }
    public static boolean findIndex(int[]arr,int start,int end,int target){
        int mid = start+(end-start)/2;
        if (start<=end){
            if (arr[mid]>target){
                return   findIndex(arr,start,mid-1,target);
            }
            else if (arr[mid]<target){
                return findIndex(arr,mid+1,end,target);
            }
            return true;
        }
        return false;
    }
    public static boolean search2(int[]arr,int target){
        for (int v:arr){
            if (target==v)
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[]arr ={3,1,1,1,1,1,1,1,1,1,1,1,1,};
        int target =3;
        boolean index=search(arr,target);
        System.out.println(index);
    }
}
