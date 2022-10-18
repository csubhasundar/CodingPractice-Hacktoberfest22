import java.util.Arrays;

public class Sorting_SelectionSort {
    public static void main(String[] args) {
        int[]arr= {5,4,3,2,1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void selectionSort(int[]arr){
        for (int i=0;i<arr.length;i++){
            int last = arr.length-1-i;
            int start = 0;
            int max= findMax(arr,start,last);
            swap(arr,max,last);
        }
    }
    public static int findMax(int[]arr,int start,int end){
        int max = start;
        for (int i=start;i<=end;i++){
            if (arr[max]<arr[i])
                max = i;
        }
        return max;
    }
    public static void swap(int[]arr , int a,int b){
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
