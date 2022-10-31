package Leetcode;

import java.util.Arrays;

/*
Given an integer array nums, find a contiguous non-empty subarray within the array that has the largest product, and return the product.

The test cases are generated so that the answer will fit in a 32-bit integer.

A subarray is a contiguous subsequence of the array.
 */
public class MaximumProductSubarray {
    public static int maxProduct(int[] nums) {
        int min =nums[0];
        int max = min;
        int ans = min;

        for(int i=1;i<nums.length;i++){
            if(nums[i]<0){
                int temp = min;
                min = max;
                max = temp;
            }

            min = Math.min(nums[i],nums[i]*min);
            max = Math.max(nums[i],nums[i]*max);

            ans = Math.max(ans,max);
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {3,-1,4};
        System.out.println(maxProduct(arr));
    }
}
