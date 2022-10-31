import java.util.Arrays;

public class Sorting_CyclicSort {
    public static void main(String[] args) {
        int[]arr = {5,4,3,2,1};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void cyclicSort(int[]arr){
        int i =0;
        while (i<arr.length){
            int index = arr[i]-1;
            if (arr[index]!=arr[i])
                swap(arr,index,i);
            else
                i++;
        }
    }
    public static void swap(int[]arr,int a,int b){
        int temp = arr[b];
        arr[b]=arr[a];
        arr[a]=temp;
    }
}
