import java.util.Arrays;

public class Sorting_MergeSort {
    public static void main(String[] args) {
        int []arr = {5,4,3,2,1};
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void mergeSort(int[]arr, int s ,int e){
        int mid = s + (e-s)/2;
        if (s==e)
            return;
        mergeSort(arr , s, mid);
        mergeSort(arr,mid+1 ,e);
        merge(arr ,s ,mid ,e);
    }
    public static void merge(int[]arr , int s ,int mid ,int e){
        int []sort = new int[e-s+1];
        int i=mid+1;
        int j=0;
        int ss=s;int ee=e;
        while (s<=mid && i <=e){
            if (arr[s]<arr[i]){
                sort[j]=arr[s];
                s++;
                j++;
            }
            else if(arr[s]>arr[i]){
                sort[j] = arr[i];
                i++;
                j++;
            }
            else{
                sort[j] = arr[i];
                s++;
                i++;
                j++;
            }
        }
        while(i<=e){
            sort[j] = arr[i];
            i++;
            j++;
        }
        while (s<=mid){
            sort[j] = arr[s];
            s++;
            j++;
        }
        j=0;
        for ( i=ss;i<=ee;i++){
            arr[i]  = sort[j];
            j++;
        }
    }
}
