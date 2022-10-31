package Leetcode;

/*
A peak element is an element that is strictly greater than its neighbors.

Given a 0-indexed integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks.

You may imagine that nums[-1] = nums[n] = -∞. In other words, an element is always considered to be strictly greater than a neighbor that is outside the array.

You must write an algorithm that runs in O(log n) time.
 */
public class Peak_Element {
    public static int findPeakElement(int[] nums) {
        int start =0;
        int end =nums.length-1;
        int peek=0;
        while (start<end){
            int mid = start+(end-start)/2;
            if (nums[mid]>nums[mid+1]){
                peek =mid;
                end = mid;
            }
            else if (nums[mid]<nums[mid+1]){
                peek =mid+1;
                start =mid+1;
            }
            else
                peek =start;
        }
        return peek;
    }
    public static void main(String[] args) {
        int [] arr ={1,2,3};
        int peak = findPeakElement(arr);
        System.out.println(peak);
    }
}
