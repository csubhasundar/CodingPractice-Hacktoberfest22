package Leetcode;

/*
Given a 2D integer array matrix, return the transpose of matrix.

The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.
 */
public class TransposeMatrix {
    public static int[][] transpose(int[][] matrix) {
        int [][] transpose = new int[matrix[0].length][matrix.length];
        for (int i=0;i<transpose.length;i++){
            for (int j=0;j<transpose[i].length;j++){
                transpose[i][j] = matrix[j][i];
            }
        }
        return transpose;
    }
    public static void main(String[] args) {
        int [][]matrix = {{1,2,3},
                          {4,5,6}};
        int [][]transpose = transpose(matrix);
        for (int i=0;i<transpose.length;i++){
            for (int j=0;j<transpose[i].length;j++){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
    }
}
