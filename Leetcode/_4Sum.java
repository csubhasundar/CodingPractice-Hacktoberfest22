package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Given an array nums of n integers, return an array of all the unique quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:

0 <= a, b, c, d < n
a, b, c, and d are distinct.
nums[a] + nums[b] + nums[c] + nums[d] == target
You may return the answer in any order.


 */
public class _4Sum {
    public static List< List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> al = new ArrayList<>();
        for (int i=0;i< nums.length-2;i++){
            for (int j= nums.length-1;j>i;j--){
                int k=i+1;
                int l=j-1;
                while (k<l) {
                    long sum = (long)nums[i] + nums[j] + nums[k] + nums[l];
                    if (sum == target) {
                        List<Integer> all = new ArrayList<>();
                        all.add(nums[i]);
                        all.add(nums[k]);
                        all.add(nums[l]);
                        all.add(nums[j]);
                        if (!al.contains(all))
                            al.add(all);
                        k++;
                        while (k < l && nums[k] == nums[k - 1])
                            k++;
                    } else if (sum < target) {
                        k++;
                    } else {
                        l--;
                    }
                }
            }
        }
        return al;
    }
    public static void main(String[] args) {
        int []arr = {1000000000,1000000000,1000000000,1000000000};
        int target =-294967296;
        List<List<Integer>> al = fourSum(arr,target);
        System.out.println(al);
    }
}
