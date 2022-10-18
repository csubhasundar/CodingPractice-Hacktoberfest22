package Leetcode;

import java.util.*;

/*
Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]]
such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.
 */
public class _3Sum {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>>ll = new ArrayList<>();
        Arrays.sort(nums); // -4,-1,-1,0,1,2
        for (int i=0;i+2<nums.length;i++){
            if (i>0&&nums[i]==nums[i-1])
                continue;
            int j = i+1;
            int k = nums.length-1;
            while (j<k){
                if (nums[i]+nums[j]+nums[k]==0){
                    ll.add(Arrays.asList(nums[i], nums[j],nums[k]));
                    k--;
                    while (j<k&&nums[k] == nums[k+1])
                        k--;
                }
                else if(nums[i]+nums[j]+nums[k]>0)
                    k--;
                else
                    j++;
            }
        }
        return ll;
    }
    public static List<List<Integer>> brute3Sum(int[]arr){
        List<List<Integer>>ll = new ArrayList<>();
        for (int i=0;i<arr.length;i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        ArrayList<Integer> al = new ArrayList<>();
                        al.add(arr[i]);
                        al.add(arr[j]);
                        al.add(arr[k]);
                        Collections.sort(al);
                        if (ll.contains(al) == false)
                            ll.add(al);
                    }
                }
            }
        }
        return  ll;
    }
    public static void main(String[] args) {
            int []nums = {-1,0,1,2,-1,-4};
        List<List<Integer>>ll = new ArrayList<>();
        ll=brute3Sum(nums);
        System.out.println(ll);
    }
}
