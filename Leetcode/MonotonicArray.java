package Leetcode;

/*
An array is monotonic if it is either monotone increasing or monotone decreasing.

An array nums is monotone increasing if for all i <= j, nums[i] <= nums[j].
An array nums is monotone decreasing if for all i <= j, nums[i] >= nums[j].

Given an integer array nums, return true if the given array is monotonic, or false otherwise.
 */
public class MonotonicArray {
    public static boolean isMonotonic(int[] nums) {
        if (nums.length<=1)
            return true;
        if (nums[0]>nums[1])
          return isMonotonicDescending(nums);
        if (nums[0]<nums[1])
          return isMonotonicAscending(nums);
        for (int i = 1 ; i< nums.length-1;i++){
            if (nums[i]>nums[i+1])
                return isMonotonicDescending(nums);
            if (nums[i]<nums[i+1])
                return isMonotonicAscending(nums);
        }
        return true;
    }

   public static boolean isMonotonicDescending(int[] nums) {
        for (int i=1;i< nums.length-1;i++){
            if (nums[i]<nums[i+1])
                return false;
        }
        return true;
    }

    public static boolean isMonotonicAscending(int []nums){
        for (int i=1;i< nums.length-1;i++){
            if (nums[i]>nums[i+1])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int []arr = {1,1,0};
        boolean isMonotonic = isMonotonic(arr);
        System.out.println(isMonotonic);
    }
}
