package Leetcode;

import java.util.Arrays;

/*
Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].

Return the array in the form [x1,y1,x2,y2,...,xn,yn].
 */
public class Shuffle_The_Array {
    public static int[] shuffle(int[] nums, int n) {
            int[]arr = new int[2*n];
            int j=0;
            for (int i=0;i<nums.length-1;i+=2){
                arr[i]=nums[j];
                arr[i+1]=nums[n+j];
                j++;
            }
            return arr;
    }
    public static void main(String[] args) {
        int []arr={2,5,1,3,4,7};
        arr = shuffle(arr,3);
        System.out.println(Arrays.toString(arr));
    }
}
