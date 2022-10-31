package Leetcode;

/*
You are given an array nums of non-negative integers.
nums is considered special if there exists a number x such that there are exactly x numbers in nums that are greater than or equal to x.

Notice that x does not have to be an element in nums.

Return x if the array is special, otherwise, return -1. It can be proven that if nums is special, the value for x is unique.
 */
public class SpecialArrayElemGrEqX {
    public static int specialArray(int[] nums) {
        int start = 0, end =0;

        for(int num:nums){
            end = Math.max(num,end);
        }


        while(start<=end){
            int mid = start + (end-start)/2;
            int count = 0;

            for(int num:nums){
                if(num>=mid){
                    count++;
                }
            }

            if(count==mid){
                return mid;
            }
            else if(count>mid){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int arr[] = {0,4,3,0,4};
        int spec = specialArray(arr);
        System.out.println(spec);
    }
}
