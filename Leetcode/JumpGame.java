package Leetcode;

/*
You are given an integer array nums.
You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.

Return true if you can reach the last index, or false otherwise.


 */
public class JumpGame {
    public static boolean canJump(int[] nums) {
        int j = nums.length-1;
        for (int i= nums.length-2;i>=0;i--){
            if(nums[i]+i >= j)
                j=i;
        }
        return j==0;
    }

    public static void main(String[] args) {
        int []arr = {2,3,1,1,4};
        boolean jump  = canJump(arr);
        System.out.println(jump);
    }
}
