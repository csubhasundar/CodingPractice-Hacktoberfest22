package Leetcode;

import java.util.ArrayList;
import java.util.List;

/*
Given an array nums of n integers where nums[i] is in the range [1, n],
return an array of all the integers in the range [1, n] that do not appear in nums.
 */
public class All_NumsDisapperedInArray {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer>al = new ArrayList<>();
        int i=0;
        while (i<nums.length){
            int index = nums[i]-1;
            if (nums[i] != nums[index]){
                int temp = nums[i];
                nums[i]=nums[index];
                nums[index]=temp;
            }
            else {
                i++;
            }
        }
        for (int j=0;j<nums.length;j++){
            if (nums[j]!=j+1)
                al.add(j+1);
        }
        return al;
    }

    public static void main(String[] args) {
        int[]arr={1,1};
        List<Integer>al = new ArrayList<>();
        al = findDisappearedNumbers(arr);
        System.out.println(al);
    }
}
