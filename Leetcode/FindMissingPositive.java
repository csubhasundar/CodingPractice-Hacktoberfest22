package Leetcode;

import java.util.Arrays;

/*
Given an unsorted integer array nums, return the smallest missing positive integer.

You must implement an algorithm that runs in O(n) time and uses constant extra space.
 */
public class FindMissingPositive {
    public static int firstMissingPositive(int[] nums) {
        int i=0;
        while (i<nums.length){
            int index = nums[i]-1;
            if (nums[i] >0 && nums[i]<nums.length && nums[i] != nums[index]){
                swap(nums , i,index);
            }
            else {
                i++;
            }
        }
        int []errors = new int[2];
        for (int j=0;j<nums.length;j++){
            if (nums[j]!=j+1) {
                return j+1;
            }
        }
      return nums.length+1;
    }
    public static void swap(int[]nums,int a,int b){
        int temp = nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
    public static void main(String[] args) {
        int []arr={1};
        int missingPositive = firstMissingPositive(arr);
        System.out.println(missingPositive);
        System.out.println(Arrays.toString(arr));
    }
}
