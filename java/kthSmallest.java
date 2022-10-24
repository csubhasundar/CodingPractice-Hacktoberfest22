//Kth smallest element

//Given an array arr[] and an integer K where K is smaller than size of array, the task is to find the Kth smallest element in the given array. It is given that all array elements are distinct.


//Java solution

import java.io.*;
import java.util.*;
class kthSmallest {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    
		    int arr[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    arr[i]=sc.nextInt();
		    
		    int k=sc.nextInt();
		    Solution ob = new Solution();
		    out.println(ob.kthSmallest(arr, 0, n-1, k));
		}
		out.flush();
	}
}

class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    {   
        int i;
        int n, m;
        int[] d;
        int c=0;
        n = arr.length;
        d = new int[100000];
        m = d.length;
        for(i=0;i<=m-1;i++) {
            d[i]=0;
        }
        for(i=0;i<n;i++) {
            d[arr[i]]++;
        }
        for(i=0;i<=m-1;i++) {

            if(d[i]==1){
                c++;
                if(c==k) {
                    return i;
                }
            }          
        }        
        return 0;
    } 
}
