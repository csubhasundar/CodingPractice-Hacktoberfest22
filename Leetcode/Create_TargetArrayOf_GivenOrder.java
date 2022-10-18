package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*

 */
public class Create_TargetArrayOf_GivenOrder {
    public static int[] createTargetArray(int[] nums, int[] index) {
        int []target= new int[nums.length];
        List<Integer>al = new ArrayList<>();
        for (int i=0;i< nums.length;i++){
            al.add(index[i],nums[i]);
        }
        for (int i=0;i<al.size();i++)
            target[i]=al.get(i);
        return target;
    }
    public static void main(String[] args) {
        int []arr={1};
        int []index={0};
        int[]target= createTargetArray(arr,index);
        System.out.println(Arrays.toString(target));
    }
}
