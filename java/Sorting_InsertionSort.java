import java.util.Arrays;

public class Sorting_InsertionSort {
    public static void main(String[] args) {
        int[]arr = {5,2,3,1,4};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void insertionSort(int[]arr){
       for (int i=0;i<arr.length-1;i++){
           for (int j=i+1;j>0;j--){
               if (arr[j]<arr[j-1])
                   swap(arr,j,j-1);
               else
                   break;
           }
       }
    }
    public static void swap(int[]arr,int a,int b){
        int temp = arr[b];
        arr[b]=arr[a];
        arr[a]=temp;
    }
}
