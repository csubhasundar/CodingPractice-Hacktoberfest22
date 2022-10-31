package Leetcode;

import java.util.Arrays;

/*
Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent,
with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.
 */
public class SortColors {
    public static void sortColors(int[] nums) {
        int i=0;
        int j = nums.length-1;
        int k=0;
        while (i<=j){
           if (nums[i]==0){
               swap(nums,i,k);
               k++;
               i++;
           }
           else if (nums[i]==2){
               swap(nums,i,j);
               j--;
           }
           else{
             i++;

           }
        }
        System.out.println(Arrays.toString(nums));
    }
    public static  void swap(int[]arr , int i,int j){
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        int []arr= {2,2,1,0,0,1};
        sortColors(arr);
    }
}
