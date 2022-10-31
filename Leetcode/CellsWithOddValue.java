package Leetcode;

/*
There is an m x n matrix that is initialized to all 0's.
There is also a 2D array indices where each indices[i] = [ri, ci] represents a 0-indexed location to perform some increment operations on the matrix.

For each location indices[i], do both of the following:

Increment all the cells on row ri.
Increment all the cells on column ci.
Given m, n, and indices, return the number of odd-valued cells in the matrix after applying the increment to all locations in indices.
 */
public class CellsWithOddValue {
    public static int oddCells(int m, int n, int[][] indices) {
        int[][]arr = new int[m][n];
        for (int i=0;i<indices.length;i++){
            int r = indices[i][0];
            int c = indices[i][1];
            for (int j=0;j<arr[r].length;j++){
                arr[r][j] += 1;

            }

            for (int j=0;j<arr.length;j++){
                arr[j][c] = arr[j][c]+1;
            }
        }
        int count=0;
        for (int i=0;i<arr.length;i++){
            for (int j=0;j< arr[i].length;j++){
                if (arr[i][j]%2==1)
                    count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int [][]indices = {{1,1},{0,0}};
        int m=2;
        int n=2;
        int oddcells = oddCells(m , n ,indices);
        System.out.println(oddcells);
    }

}
