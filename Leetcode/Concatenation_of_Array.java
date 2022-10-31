package Leetcode;

import java.util.Arrays;

/*
Given an integer array nums of length n, you want to create an array ans of length 2n
where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).

Specifically, ans is the concatenation of two nums arrays.

Return the array ans.
 */
public class Concatenation_of_Array {
    public static int[] getConcatenation(int[] nums) {
            int n = nums.length;
            int []arr  = new int[n*2];
            for (int i=0;i<nums.length;i++){
                arr[i]=arr[n]=nums[i];
                n++;
            }
            return arr;
    }
    public static void main(String[] args) {
        int []arr = {1,3,2,1};
        int []concat = getConcatenation(arr);
        System.out.println(Arrays.toString(concat));
    }
}
