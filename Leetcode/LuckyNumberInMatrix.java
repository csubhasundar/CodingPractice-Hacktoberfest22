package Leetcode;

import java.util.ArrayList;
import java.util.List;

/*
Given an m x n matrix of distinct numbers, return all lucky numbers in the matrix in any order.

A lucky number is an element of the matrix such that it is the minimum element in its row and maximum in its column.
 */
public class LuckyNumberInMatrix {
    public static List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> mins =new ArrayList<>();
        List<Integer> maxs =new ArrayList<>();
        for (int i=0;i< matrix.length;i++){
            int min=Integer.MAX_VALUE;
            for(int j=0;j<matrix[i].length;j++){
//                System.out.println(matrix[i][j]);
                if(min>matrix[i][j])
                    min = matrix[i][j];
            }
            mins.add(min);
        }
        for (int i=0;i<matrix[0].length;i++){
                int max=Integer.MIN_VALUE;
            for (int k=0;k< matrix.length;k++){
                    if(max<matrix[k][i])
                        max = matrix[k][i];
                }
                maxs.add(max);
            }
        List<Integer>result = new ArrayList<>();
        for (int i=0;i<mins.size();i++){
            if (maxs.contains(mins.get(i)))
                result.add(mins.get(i));
        }
        return result;
    }
    public static void main(String[] args) {
        int [][]arr = {{7,8},{1,2}};
        List<Integer>al = luckyNumbers(arr);
        System.out.println(al);
    }
}
