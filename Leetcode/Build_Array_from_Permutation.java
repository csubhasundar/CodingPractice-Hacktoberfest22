package Leetcode;

import java.util.Arrays;

/*
Given a zero-based permutation nums (0-indexed), build an array ans of the same length where ans[i] = nums[nums[i]] for each 0 <= i < nums.length and return it.

A zero-based permutation nums is an array of distinct integers from 0 to nums.length - 1 (inclusive).
 */
public class Build_Array_from_Permutation {
    public static int[] buildArray(int[] nums) {
            int []arr= new int[nums.length];
            for(int i=0;i<arr.length;i++){
                arr[i]=nums[nums[i]];
            }
            return arr;
    }

    public static void main(String[] args) {
        int []arr= {0,2,1,5,3,4};
        int [] permutearr= buildArray(arr);
        for (int var:permutearr
             ) {
            System.out.println(var);
        }
    }
}
