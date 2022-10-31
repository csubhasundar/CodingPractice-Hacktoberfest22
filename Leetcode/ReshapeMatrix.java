package Leetcode;

/*
In MATLAB, there is a handy function called reshape which can reshape an m x n matrix into a new one with a different size r x c keeping its original data.

You are given an m x n matrix mat and two integers r and c representing the number of rows and the number of columns of the wanted reshaped matrix.

The reshaped matrix should be filled with all the elements of the original matrix in the same row-traversing order as they were.

If the reshape operation with given parameters is possible and legal, output the new reshaped matrix; Otherwise, output the original matrix.
 */
public class ReshapeMatrix {
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int rr =0;
        int cc = 0;
        if (r*c == mat.length* mat[0].length){
            int [][]reshape = new int[r][c];
            for (int i =0;i<r;i++){
                for (int j =0;j<c;j++){
                    if (cc < mat[0].length) {
                        reshape[i][j] = mat[rr][cc];
                    }else{
                        rr++;
                        cc=0;
                        reshape[i][j] = mat[rr][cc];
                    }
                    cc++;
                }
            }
            return reshape;
        }
        return mat;
    }
    public static void main(String[] args) {
        int [][]matrix = {{1,2,3,4,5},{6,7,8,9,10}};
        int [][]reshape = matrixReshape(matrix , 4 ,2);
        for (int i =0 ;i<reshape.length;i++){
            for(int j =0;j<reshape[i].length;j++){
                System.out.print(reshape[i][j] + " ");
            }
            System.out.println();
        }
    }
}
