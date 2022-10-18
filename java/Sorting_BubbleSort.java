import java.util.Arrays;

public class Sorting_BubbleSort {
    public static void main(String[] args) {
        int[]arr= {-32,10,2,40,-100};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubbleSort(int[]arr){
        for (int i=0;i<arr.length;i++){
            for (int j=1;j<arr.length-i;j++){
                if (arr[j]<arr[j-1])
                    swap(arr,j,j-1);
            }
        }
    }
    public static void swap(int[]arr,int a,int b){
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
