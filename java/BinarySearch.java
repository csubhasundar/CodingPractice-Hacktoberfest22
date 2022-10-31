public class BinarySearch {

    public static int binaryAscending(int[]arr, int s, int e, int x){
        int mid = s+(e-s)/2;
        if (e>=s){
            if (arr[mid]==x)
                return mid;
            else if(arr[mid]>x)
                return binaryAscending(arr,s,mid-1,x);
            else
                return binaryAscending(arr,mid+1,e,x);
            }
        return -1;
        }
        public static int binaryDescending(int[]arr , int s ,int e ,int x){
        if (e>=s){
            int mid =s+(e-s)/2;
            if (arr[mid]==x)
                return mid;
            else if (arr[mid]>x)
                return binaryDescending(arr,mid+1,e,x);
            return binaryDescending(arr,s,mid-1,x);
            }
        return -1;
        }
        public static int OrderAgnostic(int []arr, int s,int e ,int x){
        boolean ans = arr[s]>arr[e];
        int index;
        if (ans)
            index=binaryDescending(arr,s,e,x);
        else
           index= binaryAscending(arr,s,e,x);
        return index;
        }
        public static int iterative(int[]arr,int target){
                int start=0;
                int end = arr.length-1;
                while (start<=end){
                    int mid = start +(end-start)/2;
                    if (arr[mid]==target)
                        return mid;
                    else if (arr[mid]>target)
                        end = mid-1;
                    else
                        start = mid+1;
                return mid;
                }
                return -1;
        }
    public static void main(String[] args) {
        int []arr = {1,2,4,6,7,9,10};
        int target =10;
        int index =OrderAgnostic(arr,0,arr.length-1,target);
        System.out.println(index);
    }
}
