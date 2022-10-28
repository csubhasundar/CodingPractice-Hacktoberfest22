//Finding th longest sub array from given array using sliding window method

import java.util.Arrays;

public class findLongestSubArray {
    
   
    public static void main(String[] args) {
        int[] input={1,2,3,4,5,0,0,0,1,6,7,9};
        int target=10;

        int[] range=findLongestSubArrayBySum(input, target);
        System.out.println("Indexes of Sub Array:"+ Arrays.toString(range));
    }

    static int[] findLongestSubArrayBySum(int[] input,int target){
        
        int k=0,j=0,cur_sum=0;
        int[] range = new int[]{-1};

        while(j< input.length){
            cur_sum += input[j];

            while(k < j && cur_sum > target){
                cur_sum-=input[k++];
            }

            if(cur_sum == target && (range.length ==1 || range[1]-range[0] < j-k)){
                range = new int[]{k+1,j+1};
            }j++;
        }
        return range;
    }
}
