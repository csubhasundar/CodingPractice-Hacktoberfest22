package Leetcode;

/*
Suppose an array of length n sorted in ascending order is rotated between 1 and n times. For example, the array nums = [0,1,4,4,5,6,7] might become:

[4,5,6,7,0,1,4] if it was rotated 4 times.
[0,1,4,4,5,6,7] if it was rotated 7 times.
Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].

Given the sorted rotated array nums that doesnot contain duplicates, return the minimum element of this array.

You must decrease the overall operation steps as much as possible.
 */
public class MinimumInRotatedSortedArray {
    public static int findMin(int[] nums) {
        if (nums[0]<nums[nums.length-1])
            return nums[0];
        return findMinElement(nums , 0 , nums.length-1);
    }
    public static int findMinElement(int[]arr , int s , int e){
        int mid = s +(e-s)/2;
        if (s<e){
            if (mid < e &&arr[mid]> arr[mid+1])
                return arr[mid+1];
            if (mid > s && arr[mid]<arr[mid-1])
                return arr[mid];
            if(arr[mid]>arr[s])
                return findMinElement(arr , mid+1 , e);
            else
                return findMinElement(arr , s , mid-1);
        }
        return arr[mid];
    }
    public static void main(String[] args) {
        int []arr={2,3,4,5,1};
        System.out.println(findMin(arr));
    }
}
