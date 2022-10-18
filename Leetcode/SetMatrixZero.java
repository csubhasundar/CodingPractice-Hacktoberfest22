package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;

/*
Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.

You must do it in place.
 */
public class SetMatrixZero {
    public static void setZeroes(int[][] matrix) {
        ArrayList<ArrayList<Integer>>al = new ArrayList<>();
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                if (matrix[i][j]==0){
                    ArrayList<Integer>index = new ArrayList<>();
                    index.add(i);
                    index.add(j);
                    al.add(index);
                }
            }
        }
        for (int i=0;i<al.size();i++){
            int row = al.get(i).get(0);
            int column =al.get(i).get(1);
            for (int j = 0;j<matrix[row].length;j++){
                matrix[row][j]=0;
            }
            for (int j=0;j<matrix.length;j++){
                matrix[j][column]=0;
            }
        }
        System.out.println(al);
    }
    public static void main(String[] args) {
        int [][]matrix={
            {0,1,2,0},
            {3,0,5,2},
            {1,3,0,5}
        };
        setZeroes(matrix);
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
