package Leetcode;

/*
Given an array nums containing n distinct numbers in the range [0, n],
return the only number in the range that is missing from the array.
 */
public class MissingNumber {
    public static int missingNumber(int[] nums) {
            int i=0;
            while(i<nums.length){
                if (nums[i] == nums.length){
                    i++;
                    continue;
                }
                if (nums[i]!=i){
                    int temp = nums[i];
                    nums[i]=nums[temp];
                    nums[temp]=temp;
                }
                else
                    i++;
            }
            for (int j=0;j<nums.length;j++){
                if (j != nums[j])
                    return j;
            }
            return nums.length;
    }
    public static void main(String[] args) {
        int []arr = {9,6,4,2,3,5,7,0,1};
        int missingNum= missingNumber(arr);
        System.out.println(missingNum);
    }
}
