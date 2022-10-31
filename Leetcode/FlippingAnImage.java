package Leetcode;

import java.util.Arrays;

/*
Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.

To flip an image horizontally means that each row of the image is reversed.

For example, flipping [1,1,0] horizontally results in [0,1,1].
To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.

For example, inverting [0,1,1] results in [1,0,0].
 */
public class FlippingAnImage {
    public static int[][] flipAndInvertImage(int[][] image) {
            for (int i=0;i<image.length;i++){
                for (int j=0;j<=(image[i].length-1)/2;j++){
                    swap(image[i], j,image[i].length-1-j);
                }
            }
            return image;
    }
    public static void swap(int[]arr , int a ,int b){
        int first = arr[a]==0 ?1:0;
        int second = arr[b]==0 ?1 :0;
        arr[a]=second;
        arr[b]=first;
    }

    public static void main(String[] args) {
        int [][]arr = {{1,1,0},{1,0,1},{0,0,0}};
        arr= flipAndInvertImage(arr);
       for (int i=0;i<arr.length;i++){
           for (int j=0;j<arr[i].length;j++){
               System.out.print(arr[i][j] + " ");
           }
           System.out.println();
       }
    }
}
