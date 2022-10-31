import java.util.Arrays;
public class BinarySearch2D {
    // For strictly sorted array
    public static int[] binarySearch(int[][]arr, int target){
            int rStart=0;
            int rEnd = arr.length-1;
            int mid=0;
            while(rStart<=rEnd){
                if (rStart==rEnd){
                    int secondIndex =BinarySearch.OrderAgnostic(arr[rStart],0,arr[rStart].length-1,target);
                    if (secondIndex!=-1&& rStart!=-1)
                        return new int[]{rStart,secondIndex};
                    return  new int[]{-1,-1};
                }
                 mid = rStart + (rEnd-rStart)/2;
                if (arr[mid][0]>target){
                    rEnd = mid-1;
                }
                else if (arr[mid][0]<target){
                    if (arr[mid][arr[mid].length-1]<target)
                        rStart= mid+1;
                    else {
                        int secondIndex = BinarySearch.OrderAgnostic(arr[mid], 0, arr[mid].length - 1, target);
                        if (secondIndex != -1 && mid != -1)
                            return new int[]{mid, secondIndex};
                        return new int[]{-1, -1};
                    }
                }
                else
                    return new int[]{mid,0};
            }
            return new int[]{-1,-1};
    }

    //for sorted array
    public static  int[] binarySearchSorted(int[][]arr,int target){
        int r = 0;
        int c = arr[r].length-1;
        while (r<arr.length && c>0){
            if (arr[r][c]==target)
                return new int[]{r,c};
            else if (arr[r][c]>target)
                c--;
            else
                r++;
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[][]arr={ {10,20,30,40}
                    ,{15,25,35,45},
                     {28,29,37,49},
                     {33,34,38,50}};
        int[]index = binarySearchSorted(arr,37);
        System.out.println(Arrays.toString(index));
    }
}
