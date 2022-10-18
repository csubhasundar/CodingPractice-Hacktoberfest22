package Leetcode;

import java.util.Arrays;

/*
Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

There is only one repeated number in nums, return this repeated number.

You must solve the problem without modifying the array nums and uses only constant extra space.
 */
public class FindDuplicate {
    public static int findDuplicate(int[] nums) {
        int i=0;
        while (i<nums.length){
            int index = nums[i]-1;
            if (nums[i] != nums[index]){
                swap(nums , i,index);
            }
            else {
                i++;
            }
        }
        return nums[nums.length-1];
    }
    public static void swap(int[]nums,int a,int b){
        int temp = nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
    public static void main(String[] args) {
        int []arr={1,1,2};
        int dduplicate = findDuplicate(arr);
        System.out.println(dduplicate);
        System.out.println(Arrays.toString(arr));
    }
}
