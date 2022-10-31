package Leetcode;

import java.util.Arrays;

/*
Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number.
Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.

Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.

The tests are generated such that there is exactly one solution. You may not use the same element twice.

Your solution must use only constant extra space.
 */
public class TwoSum_II {
    public static int[] twoSum(int[] numbers, int target) {
        int []arr = new int[2];
        int i=0;
        int j= numbers.length-1;
        while (i<j){
            if (numbers[i]+numbers[j]>target)
                j--;
            else if (numbers[i]+numbers[j]<target)
                i++;
            else{
                arr[0] = i+1;
                arr[1] = j+1;
                break;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int []arr = {-1,0};
        int []twoSum = twoSum(arr , -1);
        System.out.println(Arrays.toString(twoSum));
    }
}
