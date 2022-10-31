package Leetcode;

import java.util.Arrays;

/*
Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once.
The relative order of the elements should be kept the same.

Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums.
 More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.

Return k after placing the final result in the first k slots of nums.

Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.
 */
public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        int count =1;
        int lastvalue =nums[0];
        for (int i=1;i< nums.length;i++){
            if (nums[i]==lastvalue)
                nums[i] = Integer.MAX_VALUE;
            else {
                lastvalue=nums[i];
                count++;
            }
        }
        System.out.println(Arrays.toString(nums));
        int i =1;
        int j = i+1;
        while (j<nums.length){
            if (nums[i]==Integer.MAX_VALUE){
                if (nums[j]!=Integer.MAX_VALUE) {
                    swap(nums, i, j);
                    i++;
                }
            }
            else{
                i++;
            }
                j++;
        }
return count;
    }
    public static void swap(int[]arr , int i,int j){
        int temp =arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        int []arr= {0,0,1,1,1,2,2,3,3,4};
        int removed = removeDuplicates(arr);
        System.out.println(removed);
        System.out.println(Arrays.toString(arr));
    }
}
