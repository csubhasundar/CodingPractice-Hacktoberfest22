package Leetcode;

import java.util.ArrayList;
import java.util.List;

/*
Given an integer array nums of length n where all the integers of nums are in the range [1, n]
and each integer appears once or twice, return an array of all the integers that appears twice.

You must write an algorithm that runs in O(n) time and uses only constant extra space.
 */
public class FindAllDuplicates {
    public static List<Integer> findAllDuplicates(int[] nums) {
        List<Integer>al =new ArrayList<>();
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
        for (int j=0;j<nums.length;j++){
            if (nums[j]!=j+1)
                al.add(nums[j]);
        }
        return al;
    }
    public static void swap(int[]nums,int a,int b){
        int temp = nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
    public static void main(String[] args) {
        int [] arr= {1};
        List<Integer>al =new ArrayList<>();
        al=findAllDuplicates(arr);
        System.out.println(al);
    }
}
