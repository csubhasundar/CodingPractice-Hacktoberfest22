package Leetcode;

import java.util.Arrays;

/*
Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

Return the running sum of nums.
 */
public class RunningSum_of_Array {
    public static int[] runningSum(int[] nums) {
        for (int i=1;i<nums.length;i++){
            nums[i] = nums[i]+nums[i-1];
        }
        return nums;
    }
    public static void main(String[] args) {
        int []arr = {1,1,1,1,1};
        arr = runningSum(arr);
        System.out.println(Arrays.toString(arr));
    }
}
