package Leetcode;

/*
Given an array nums of integers, return how many of them contain an even number of digits.
 */
public class Find_Numbers_with_Even_Number_of_Digits {
    public static int findNumbers(int[] nums) {
        int count=0;
        for (int i=0;i<nums.length;i++){
            String s = Integer.toString(nums[i]);
            if (s.length()%2==0)
                count++;
        }
        return count;
    }
    public static int findNumbers2(int[] nums) {
        int count=0;
        for (int i=0;i<nums.length;i++){
            int digit = (int) Math.log10(nums[i])+1;
            if (digit%2==0)
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int []arr= {12,345,2,6,7896,555,901,482,1771};
        int evendigit = findNumbers2(arr);
        System.out.println(evendigit);
    }
}
