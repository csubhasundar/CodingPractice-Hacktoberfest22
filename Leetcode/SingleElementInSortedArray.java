package Leetcode;

/*
You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once.

Return the single element that appears only once.

Your solution must run in O(log n) time and O(1) space.
 */
public class SingleElementInSortedArray {
    public static int singleNonDuplicate(int[] nums) {
        int left =0;
        int right = nums.length-1;
        if (nums.length==1)
            return nums[0];
        while (left<=right){
            if (nums[left]!= nums[left+1])
                return nums[left];
            if (nums[right]!= nums[right-1])
                return nums[right];
            left+=2;
            right-=2;
        }
        return -1;
    }

    public static void main(String[] args) {
        int []arr = {1,2};
        int element = singleNonDuplicate(arr);
        System.out.println(element);
    }
}
