package Leetcode;

/*
Given a m x n matrix grid which is sorted in non-increasing order both row-wise and column-wise,
return the number of negative numbers in grid.
 */
public class CountNegativeInMatrix {
    public static int countNegatives(int[][] grid) {
        int i=0;
        for (int j=0;j< grid.length;j++){
            for (int k=0;k<grid[j].length;k++){
                if (grid[j][grid[j].length-1] >=0)
                    break;
                if (grid[j][k]<0)
                    i++;
            }
        }
        return i;
    }
    public static void main(String[] args) {
        int grid[][] = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        int negatives = countNegatives(grid);
        System.out.println(negatives);
    }
}
