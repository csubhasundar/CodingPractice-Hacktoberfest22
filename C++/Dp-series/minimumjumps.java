class Solution{
     static int helper(int arr[], int n){
       int jumps = 0, maxi = 0, cur = 0;
       for(int i=0; i<n-1; i++) {
           maxi = Math.max(maxi, arr[i] + i);
           if(i == cur) {
               cur = maxi; 
               jumps++;
           }
       }
       if(cur < n-1) {
           return -1;
       }
       return jumps;
   }
    static int minJumps(int[] arr){
      return helper(arr,arr.length);
    }
}