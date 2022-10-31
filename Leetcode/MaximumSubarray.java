package Leetcode;

/*
Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

A subarray is a contiguous part of an array.
 */
public class MaximumSubarray {
    public static int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum=0;
        for (int i=0;i<nums.length;i++){
            sum += nums[i];
            if (sum>max)
                max =sum;
            if(sum<0)
                sum=0;
        }
        return max;
    }
    public static void main(String[] args) {
        int []arr= {1,2};
        System.out.println(maxSubArray(arr));
    }
}
