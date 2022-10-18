package Leetcode;

import java.util.Arrays;

/*
You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately,
due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.

You are given an integer array nums representing the data status of this set after the error.

Find the number that occurs twice and the number that is missing and return them in the form of an array.
 */
public class SetMismatch {
    public static int[] findErrorNums(int[] nums) {
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
        int []errors = new int[2];
        for (int j=0;j<nums.length;j++){
            if (nums[j]!=j+1) {
                errors[0] = nums[j];
                errors[1]=j+1;
                break;
            }
        }
        return errors;
    }
    public static void swap(int[]nums,int a,int b){
        int temp = nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }

    public static void main(String[] args) {
        int []arr= {1,2,2,4};
        int []errors = findErrorNums(arr);
        System.out.println(Arrays.toString(errors));
    }
}
