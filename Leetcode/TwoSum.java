package Leetcode;


/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.



Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]


Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.


Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?
 */
public class TwoSum {
        public static int[] twoSum(int[] nums, int target) {
            int [] sum = new int[2];
            for(int i=0;i<nums.length;i++){
                for(int j=0;j<nums.length;j++){
                    if(i==j){
                        continue;
                    }
                    else if(target==nums[i] + nums[j]){
                        sum[0] = i;
                        sum[1] = j;
                    }
                }
            }

            return sum;
        }
    public static void main(String[] args) {
    int arr[] = {1,2,3,4,5};
    int target = 7;
    int sum[] = twoSum(arr, target);
    System.out.println(sum[0]+ ","+sum[1]);
    }
}
