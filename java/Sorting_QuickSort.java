import java.util.Arrays;

public class Sorting_QuickSort {
    public static void main(String[] args) {
        int []arr = {3,1,5,2,4};
        quickSort(arr , 0 , arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void quickSort(int[]arr , int s ,int e){
        int pivot = s + (e-s)/2;
        if (s>=e)
            return;
        int i =s;
        int j =e;
        while (i<=j){
            while(arr[i]<arr[pivot])
                i++;
            while(arr[j]>arr[pivot])
                j--;
            if(i<j) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    i++;
                    j--;
            }
        }
        quickSort(arr,s, j);
        quickSort(arr, i,e);
    }
}
